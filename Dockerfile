FROM openjdk:11
COPY /var/jenkins_home/workspace/student-ms/target/student-ms-0.0.1-SNAPSHOT.jar student-ms-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","student-ms-0.0.1-SNAPSHOT.jar"]