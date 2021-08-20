package util;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TestContext {
    private Map<String, Object> context = new HashMap<>();

    public void put(String key, Object value) {
        context.put(key, value);
    }

    public Optional<Object> get(String key) {
        return context.containsKey(key) ? Optional.of(context.get(key)) : Optional.empty();
    }

}
