FROM gradle:8.5.0-jdk21-jammy as BUILDER


ENV PROJECT_NAME=sprintTest
ENV PROJECT_PATH=/app/${PROJECT_NAME}

RUN mkdir -p ${PROJECT_PATH}

WORKDIR ${PROJECT_PATH}

COPY . .

RUN gradle clean build -x test

FROM eclipse-temurin:21

COPY --from=BUILDER ${PROJECT_PATH}/build/libs/backEnd-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
