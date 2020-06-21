FROM jecklgamis/openjdk-8-jre:latest
MAINTAINER Jerrico Gamis <jecklgamis@gmail.com>

RUN mkdir -m 0755 -p /cucumber-jvm-java-example

COPY target/cucumber-jvm-java-example.jar /cucumber-jvm-java-example
COPY docker-entrypoint.sh /cucumber-jvm-java-example

CMD ["/cucumber-jvm-java-example/docker-entrypoint.sh"]

