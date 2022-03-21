FROM openjdk:11
EXPOSE 8080
ADD build/libs/banking-0.0.1-SNAPSHOT.jar banking-docker.jar
ENTRYPOINT ["java", "-jar", "banking-docker.jar"]
