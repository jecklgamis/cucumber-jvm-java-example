package steps;

import com.google.inject.Inject;
import io.cucumber.java8.En;
import io.cucumber.java8.Scenario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.TestContext;

public class ExampleSteps implements En {
    private static final Logger log = LoggerFactory.getLogger(ExampleSteps.class);
    private TestContext testContext;

    @Inject
    public ExampleSteps(TestContext testContext) {
        log.info(String.format("Test context is %s", testContext));
        this.testContext = testContext;
        configureSteps();
    }

    private void configureSteps() {
        Before((Scenario scenario) -> {
            log.info("Before scenario : " + scenario.getName());
        });

        After((Scenario scenario) -> {
            log.info("After scenario : " + scenario.getName());
        });

        Given("^this pre condition$", () -> {
            testContext.put("some-key", "some-value");
        });

        Given("^that pre condition$", () -> {
        });

        When("^I do this$", () -> {
        });

        When("^I do that$", () -> {
        });

    }
}

