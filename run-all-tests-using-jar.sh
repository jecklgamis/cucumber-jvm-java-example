#!/usr/bin/env bash
set -ex
PLUGINS="--plugin pretty --plugin html:cucumber/html --plugin json:cucumber/json/cucumber.json"
java -jar target/cucumber-jvm-java-example.jar ${PLUGINS} --glue steps classpath:features  --tags "not @Wip" --tags @ExampleFeature --threads 8
