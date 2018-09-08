package util;

import com.google.inject.AbstractModule;

class ExampleTestModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(TestContext.class);
    }
}
