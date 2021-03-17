FROM java:8

VOLUME /tmp

LABEL maintainer="freddy@sellmate.co.kr"

EXPOSE 8080

ARG JAR_FILE=./build/libs/*.jar

COPY ${JAR_FILE} mozzi.jar

ENTRYPOINT ["java", "-jar", "/mozzi.jar"]
