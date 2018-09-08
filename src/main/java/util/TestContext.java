package util;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TestContext {
    private ThreadLocal<Map<String, Object>> context = ThreadLocal.withInitial(() -> new HashMap());

    public void put(String key, Object value) {
        context.get().put(key, value);
    }

    public Optional<Object> get(String key) {
        Map map = context.get();
        return map.containsKey(key) ? Optional.of(map.get(key)) : Optional.empty();
    }

}
