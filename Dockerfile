FROM openjdk:8-jdk-alpine
VOLUME /tmp
ENV JPDA_ADDRESS=5005
ENV JPDA_TRANSPORT=dt_socket
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
