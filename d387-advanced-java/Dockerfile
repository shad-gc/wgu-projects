FROM openjdk:17
ADD target/*.jar application.jar
ENTRYPOINT ["java", "-jar", "application.jar"]
EXPOSE 8080

# Committing docker file for part C1