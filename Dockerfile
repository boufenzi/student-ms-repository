FROM openjdk:11
COPY target/student-ms-0.0.1-SNAPSHOT.jar student-ms-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","student-ms-0.0.1-SNAPSHOT.jar"]