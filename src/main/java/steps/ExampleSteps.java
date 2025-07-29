package steps;

import com.google.inject.Inject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.TestContext;

public class ExampleSteps {
    private static final Logger log = LoggerFactory.getLogger(ExampleSteps.class);
    private final TestContext testContext;

    @Inject
    public ExampleSteps(TestContext testContext) {
        log.info("Test context is {}", testContext);
        this.testContext = testContext;
    }

    @Before
    public void setupScenario(Scenario scenario) {
        log.info("Before scenario : {}", scenario.getName());
    }

    @After
    public void tearDownScenario(Scenario scenario) {
        log.info("After scenario : {}", scenario.getName());
    }

    @Given("this pre condition")
    public void thisPreCondition() {
        testContext.put("some-key", "some-value");
    }

    @Given("that pre condition")
    public void thatPreCondition() {
    }

    @When("I do this")
    public void iDoThis() {
    }

    @When("I do that")
    public void iDoThat() {
    }

    @Then("I can verify that")
    public void iCanVerifyThat() {
    }

    @Then("I can also verify that")
    public void iCanAlsoVerifyThat() {
    }

}

