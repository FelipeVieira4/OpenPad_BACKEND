#!/bin/sh

./gradlew clean build -x test
java -jar build/libs/backEnd-0.0.1-SNAPSHOT.jar