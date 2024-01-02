#!/bin/bash

./gradlew -x test
gradle_result=$?

if [ $gradle_result -eq 0 ]; then
  echo "Gradle build succeeded."

  echo "Running Docker..."
  sudo docker-compose up --build
else
  echo "Gradle build failed"
fi

sudo docker-compose down
