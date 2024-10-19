FROM ubuntu:24.04

RUN apt-get update
RUN apt install openjdk-21-jdk -y

ENV JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
ENV PATH="$JAVA_HOME/bin:${PATH}"
ENV DEVOPS='Volodymyr'

WORKDIR /app

COPY ./target/devops-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]