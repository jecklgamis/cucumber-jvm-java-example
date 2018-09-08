package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/Example.feature"},
        tags = {"not @Wip"},
        glue = {"classpath:steps"},
        plugin = {"pretty", "html:target/cucumber/html"})
public class ExampleFeatureTest {
}

