FROM openjdk:11
EXPOSE 9090
ADD target/student-ms-0.0.1-SNAPSHOT.jar students-ms-project.jar
ENTRYPOINT ["java","-jar","/students-ms-project.jar"]