FROM openjdk:11
EXPOSE 9090
ADD target/students-ms-project.jar students-ms-project.jar
ENTRYPOINT ["java","-jar","/students-ms-project.jar"]