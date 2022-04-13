FROM java:8-jdk-alpine

COPY ./target/authz-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch authz-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java", "-jar", "authz-0.0.1-SNAPSHOT.jar"]