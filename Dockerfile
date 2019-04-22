FROM openjdk:8
ADD target/docker-spring-boot-1.0.0.jar docker-spring-boot.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "docker-spring-boot.jar"]
