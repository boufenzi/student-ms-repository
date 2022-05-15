FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} students-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/students-0.0.1-SNAPSHOT.jar"]