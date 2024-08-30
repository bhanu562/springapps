FROM openjdk:11
MAINTAINER "Ashok Bollepalli <797979>"
COPY target/StudentApp.jar  /usr/app/
WORKDIR /usr/app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "StudentApp.jar"]