FROM openjdk:17-jdk-alpine
LABEL authors="Zach"
COPY target/D387_sample_code-0.0.2-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]