FROM openjdk:17-jdk-slim
# FROM amazoncorretto:17
WORKDIR /app
COPY build/libs/accounts.jar app.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "app.jar"]