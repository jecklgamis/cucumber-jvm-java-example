package util;

import com.google.inject.AbstractModule;
import io.cucumber.guice.ScenarioScoped;

class ExampleTestModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(TestContext.class).in(ScenarioScoped.class);
    }
}
