## cucumber-jvm-java-example

[![Build](https://github.com/jecklgamis/cucumber-jvm-java-example/actions/workflows/build.yml/badge.svg)](https://github.com/jecklgamis/cucumber-jvm-java-example/actions/workflows/build.yml)

This is an example Cucumber-JVM project.

* Uses Java 8 lambda step definitions
* Packages tests into executable jar file
* Uses Guice dependency injection

## Running Cucumber Tests

Using executable jar file:

```shell script
mvn clean package
java -jar target/cucumber-jvm-java-example.jar --plugin pretty --plugin html:cucumber/html --plugin json:cucumber/json/cucumber.json  --glue steps classpath:features --tags ~@Wip
```

Using Maven exec plugin:

```shell script
mvn exec:java -Dcucumber.options="--plugin pretty --plugin html:cucumber/html --plugin json:cucumber/json/cucumber.json --glue steps classpath:features --tags ~@Wip --tags @ExampleFeature"
```

Using JUnit test runner:

```shell script
mvn test -Dtest=ExampleFeatureTest
```

Using Docker:

Build Docker image (see `build-docker-image.sh`)

```shell script
IMAGE_NAME=jecklgamis/cucumber-jvm-java-example
IMAGE_TAG=latest
docker build -t ${IMAGE_NAME}:${IMAGE_TAG} .
```

Run Docker image (see `run-all-tests-using-docker.sh`)

```shell script
IMAGE_NAME=jecklgamis/cucumber-jvm-java-example
IMAGE_TAG=latest

JAVA_OPTS=${JAVA_OPTS:-""}
ARGS=${ARGS:-"--plugin pretty --plugin html:cucumber/html --plugin json:cucumber/json/cucumber.json --glue steps classpath:features --tags @ExampleFeature"}

docker run -e "JAVA_OPTS=${JAVA_OPTS}" -e "ARGS=${ARGS}" ${IMAGE_NAME}:${IMAGE_TAG}
```

In Intellij, you can also run the scenario directly from the feature file. Ensure you have the Cucumber Java plugin
installed.

## Other Cucumber-JVM Examples

* https://github.com/jecklgamis/cucumber-jvm-kotlin-example
* https://github.com/jecklgamis/cucumber-jvm-scala-example

## Links

* https://cucumber.io/docs
* http://github.com/cucumber/cucumber-jvm
* https://github.com/google/guice

