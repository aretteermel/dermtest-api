FROM openjdk:11-jre-slim

EXPOSE 8080
WORKDIR /app

COPY target/dermtest-api-0.0.1-SNAPSHOT.jar /app/app.jar

CMD ["java", "-jar", "app.jar"]