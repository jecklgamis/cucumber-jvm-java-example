package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/Example.feature"},
        tags = {"not @Wip"},
        glue = {"classpath:steps"},
        plugin = {"pretty", "html:target/cucumber/html"})
public class ExampleFeatureTest {
}

