FROM openjdk:8
COPY /target/sparkApplication-jar-with-dependencies.jar /opt/deployment/
CMD ["java", "-jar", "/opt/deployment/sparkApplication-jar-with-dependencies.jar"]
