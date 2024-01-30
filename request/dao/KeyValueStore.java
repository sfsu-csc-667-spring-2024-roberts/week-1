package request.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeyValueStore {

  private Map<String, String> data;

  public KeyValueStore() {
    this.data = new HashMap<>();
  }

  public Set<String> keys() {
    return this.data.keySet();
  }

  public void add(String key, String value) {
    this.data.put(key, value);
  }

  public String get(String key) {
    return this.data.get(key);
  }

  public boolean isKeyValid(String key) {
    return this.data.containsKey(key);
  }
}