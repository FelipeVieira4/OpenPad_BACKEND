FROM maven:latest AS build

# Defina variáveis de ambiente para o projeto
ENV PROJECT_NAME=sprintTest
ENV PROJECT_PATH=/app/${PROJECT_NAME}

RUN mkdir -p ${PROJECT_PATH}

WORKDIR ${PROJECT_PATH}
COPY . ${PROJECT_PATH}


RUN mvn clean package -Dmaven.test.skip=true

#Executar
FROM eclipse-temurin:21

COPY ${PROJECT_PATH}/target/*.jar /app/app.jar
CMD ["java", "-jar", "/app/app.jar"]
