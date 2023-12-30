FROM openjdk:21-slim
COPY target/*.war tortm.war
ENTRYPOINT ["java", "-jar", "/tortm.war"]
EXPOSE 8981
