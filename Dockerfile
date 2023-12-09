FROM openjdk:17

ARG JAR_FILE=target/*.jar

WORKDIR /app

COPY ${JAR_FILE} ai.jar

ENTRYPOINT ["java", "-jar", "/app/ai.jar"]

EXPOSE 8080
