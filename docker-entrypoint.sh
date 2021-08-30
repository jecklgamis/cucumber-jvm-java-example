#!/bin/bash
JAVA_OPTS=${JAVA_OPTS:-""}
ARGS=${ARGS:-"--plugin pretty --plugin html:cucumber/html --plugin json:cucumber/json/cucumber.json --glue steps classpath:features --tags @ExampleFeature"}
java -jar cucumber-jvm-java-example.jar ${JAVA_OPTS} ${ARGS}
