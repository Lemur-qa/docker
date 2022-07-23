FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD /documents/jar/ demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT["kotlin", "-jar", "demo-0.0.1-SNAPSHOT.jar"]