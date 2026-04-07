FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/result-analytics-1.0.jar app.jar
CMD ["java", "-jar", "app.jar"]