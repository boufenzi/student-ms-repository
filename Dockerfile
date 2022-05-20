FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY /var/jenkins_home/workspace/student-ms/target/students-0.0.1-SNAPSHOT.jar students-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/students-0.0.1-SNAPSHOT.jar"]