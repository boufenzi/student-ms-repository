FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} students-ms-project.jar
ENTRYPOINT ["java","-jar","/students-ms-project.jar"]