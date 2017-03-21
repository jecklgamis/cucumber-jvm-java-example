package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/Example.feature"},
        tags = {"~@Wip"},
        glue = {"classpath:steps"},
        plugin = {"pretty", "html:target/cucumber/html"})
public class ExampleFeatureRunner {
}

