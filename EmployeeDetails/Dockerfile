FROM openjdk:8
RUN echo 'deb http://httpredir.debian.org/debian jessie-backports main' > /etc/apt/sources.list.d/jessie-backports.list \
    && apt-get update \
    && apt-get install --no-install-recommends -y -q ca-certificates \
    && apt-get -y -q upgrade \
    && apt-get install --no-install-recommends -y openjdk-8-jre-headless \
    && rm -rf /var/lib/apt/lists/*
WORKDIR /usr/src/app
COPY . /usr/src/app
EXPOSE 8000
ENTRYPOINT ["java" ,"-jar", "target/EmployeeDetails-0.0.1-SNAPSHOT-jar-with-dependencies.jar"]