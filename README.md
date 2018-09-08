## cucumber-jvm-java-example

This is an example Cucumber-JVM project.

* Uses Java 8 lambda step definitions
* Packages tests into executable jar file
* Uses Guice dependency injection

## Running Cucumber Tests

Using executable jar file:
```
mvn clean package
java -jar target/cucumber-jvm-java-example.jar --plugin pretty --plugin html:cucumber/html --json json:cucumber/json/cucumber.json  --glue steps classpath:features --tags ~@Wip
```

Using Maven exec plugin:
```
mvn exec:java -Dcucumber.options="--plugin pretty --plugin html:cucumber/html --plugin json:cucumber/json/cucumber.json --tags ~@Wip --tags @ExampleFeature"
```

Using JUnit test runner:
```
mvn test -Dtest=ExampleFeatureTest
```

In Intellij, you can also run the scenario directly from the feature file. Ensure you have the Cucumber Java 
plugin installed.

## Links

* https://cucumber.io/docs
* http://github.com/cucumber/cucumber-jvm
* https://github.com/google/guice

