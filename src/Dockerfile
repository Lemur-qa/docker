FROM openjdk:8-jdk-alpine
#ARG JAR_FILE=target/*.jar
RUN addgroup -S spring && adduser -S spring -G spring
#USER spring:spring
COPY demo-0.0.1-SNAPSHOT.jar .
#ADD /demo-0.0.1-SNAPSHOT.jar downloads/demo/build/libs/demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]
