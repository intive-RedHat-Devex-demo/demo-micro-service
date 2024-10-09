# Build stage
FROM gradle:7.6.1-jdk17-alpine AS build
WORKDIR /app
COPY . .
RUN gradle build --no-daemon

# Run stage
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "app.jar"]
