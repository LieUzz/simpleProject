FROM openjdk:8
EXPOSE 8080
ADD target/simple-project-image.war simple-project-image.war
ENTRYPOINT ["java", "-war", "/simple-project-image.war"]