package steps;

import com.google.inject.Inject;
import io.cucumber.java8.En;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.TestContext;

public class ExampleStepsExtension implements En {
    private static final Logger log = LoggerFactory.getLogger(ExampleStepsExtension.class);
    private TestContext testContext;

    @Inject
    public ExampleStepsExtension(TestContext testContext) {
        log.info(String.format("Test context is %s", testContext));
        this.testContext = testContext;
        configureSteps();
    }

    private void configureSteps() {
        Then("^I can verify that$", () -> {
            assert (testContext.get("some-key").get().equals("some-value"));
        });

        Then("^I can also verify that$", () -> {
            assert (testContext.get("some-key").get().equals("some-value"));
        });

    }
}

