FROM openjdk:10-jre-slim
WORKDIR /app
COPY build/libs/*.jar /app/auth-server.jar
EXPOSE 8711
CMD ["java", "-jar", "/app/auth-server.jar"]