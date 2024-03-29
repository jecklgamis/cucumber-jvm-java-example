package steps;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;
import io.cucumber.guice.CucumberModules;
import io.cucumber.guice.InjectorSource;
import util.ExampleTestModule;

public class ExampleInjectorSource implements InjectorSource {
    @Override
    public Injector getInjector() {
        return Guice.createInjector(Stage.PRODUCTION, CucumberModules.createScenarioModule(), new ExampleTestModule());
    }
}

