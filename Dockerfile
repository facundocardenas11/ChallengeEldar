# Utiliza una imagen base de Java para tu versión de Spring Boot
FROM openjdk:17-jdk-slim

# Copia el archivo JAR de tu proyecto Spring Boot al contenedor
COPY target/challenge-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto en el que se ejecutará tu aplicación Spring Boot
EXPOSE 8080

# Comando para ejecutar tu aplicación Spring Boot
CMD ["java", "-jar", "app.jar"]