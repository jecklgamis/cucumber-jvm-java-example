package util;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;

import org.glassfish.jersey.client.JerseyClientBuilder;

import javax.ws.rs.client.Client;

import cucumber.api.guice.CucumberModules;
import cucumber.runtime.java.guice.InjectorSource;

public class ExampleInjectorSource implements InjectorSource {
    @Override
    public Injector getInjector() {
        return Guice.createInjector(Stage.PRODUCTION, CucumberModules.SCENARIO, new ExampleTestModule());
    }
}

class ExampleTestModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Client.class).toInstance(JerseyClientBuilder.createClient());
    }
}

