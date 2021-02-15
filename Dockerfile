FROM openjdk:8-jdk-alpine
ADD target/codebuild-0.0.1.jar app-service.jar
ENTRYPOINT ["java","-jar","/app-service.jar"]