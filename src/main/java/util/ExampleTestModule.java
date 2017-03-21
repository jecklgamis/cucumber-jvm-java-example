package util;

import com.google.inject.AbstractModule;

import org.glassfish.jersey.client.JerseyClientBuilder;

import javax.ws.rs.client.Client;

class ExampleTestModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Client.class).toInstance(JerseyClientBuilder.createClient());
    }
}
