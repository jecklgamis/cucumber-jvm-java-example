# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Commands

```bash
# Build and run all tests (integration tests via failsafe)
mvn verify

# Run tests only (skips packaging)
mvn test

# Run integration tests (ExampleFeatureIT) specifically
mvn failsafe:integration-test failsafe:verify

# Run a specific tagged scenario
mvn verify -Dit.test=ExampleFeatureIT -Dcucumber.filter.tags="@ExampleFeature"

# Build executable jar (packages tests into runnable jar)
mvn clean package

# Run tests via executable jar
java -jar target/cucumber-jvm-java-example.jar --plugin pretty --glue steps classpath:features

# Build and run via Docker
make all   # builds jar and Docker image
make run   # runs Docker container
```

Use `./mvnw` instead of `mvn` if Maven is not installed locally.

## Architecture

This is a Cucumber-JVM test framework using Java 25 and Guice dependency injection.

**Key design pattern:** Step definitions live in `src/main/java/steps/` (not `src/test/java/`) and are packaged into an executable uber-jar via maven-shade-plugin. This allows running tests without Maven by executing the jar directly.

**Dependency injection flow:**
- `ExampleInjectorSource` implements `InjectorSource` and bootstraps Guice — Cucumber discovers it automatically via the `cucumber-guice` integration
- `ExampleTestModule` binds `TestContext` as `@ScenarioScoped`, meaning a fresh instance per scenario
- Step classes (`ExampleSteps`) receive `TestContext` via `@Inject` constructor injection
- `TestContext` is a simple `Map<String, Object>` for sharing state between step methods within a scenario

**Test runner:** `ExampleFeatureIT` in `src/test/java/runner/` uses JUnit Platform Suite (`@Suite`) with `cucumber-junit-platform-engine`. The `IT` suffix causes maven-failsafe to execute it during the `integration-test` phase. It loads additional Cucumber config from `src/main/resources/cucumber.properties`.

**Feature files** live in `src/main/resources/features/` on the classpath. The runner selects them via `@SelectPackages("features")`.

**Test execution is parallel** — failsafe is configured with `<parallel>methods</parallel>` and unlimited threads.
