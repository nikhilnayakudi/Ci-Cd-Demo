FROM openjdk:22-jdk
ADD /target/CICD-Demo.jar CICD-Demo.jar
ENTRYPOINT ["java", "-jar","/CICD-Demo.jar"]