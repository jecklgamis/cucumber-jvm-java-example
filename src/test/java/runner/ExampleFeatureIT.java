package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features"},
        tags = "not @Wip",
        glue = {"classpath:steps"},
        plugin = {"pretty", "html:target/cucumber/html"})
public class ExampleFeatureIT {
}

