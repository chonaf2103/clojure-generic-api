FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/generic-api-0.0.1-SNAPSHOT-standalone.jar /generic-api/app.jar

EXPOSE 8080

CMD ["java", "-jar", "/generic-api/app.jar"]
