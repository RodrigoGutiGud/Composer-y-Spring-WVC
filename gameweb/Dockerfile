FROM eclipse-temurin:17-jdk
LABEL authors="Equipo"
WORKDIR /app
COPY target/*.jar app.jar
ENV DEMO=algo
ENTRYPOINT ["java", "-jar", "app.jar"]