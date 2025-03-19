FROM openjdk:17-jdk-slim

# JAR 파일 복사
COPY ./build/libs/jenkins_test-0.0.1-SNAPSHOT.jar /app.jar

EXPOSE 80

ENTRYPOINT ["java", "-jar", "/app.jar"]



#FROM openjdk:17-ea-slim-buster
#EXPOSE 8080
#ADD ./build/libs/jenkins_test-0.0.1-SNAPSHOT.jar /app.jar
#ENTRYPOINT ["java", "-jar", "/app.jar"]