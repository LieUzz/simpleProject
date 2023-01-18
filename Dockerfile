FROM openjdk:8
EXPOSE 8080
ADD target/simple-project-image.jar simple-project-image.jar
ENTRYPOINT ["java", "-jar", "/simple-project-image.jar"]