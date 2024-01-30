package tests.request;

import request.dao.KeyValueStore;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * public void add(String key, String value);
 * public ValueType get(String key);
 * public boolean isKeyValid(String key);
 */

public class KeyValueStoreTest {

  @Test
  public void testAdd() {
    KeyValueStore store = new KeyValueStore();
    store.add("key", "val");

    assertTrue(store.isKeyValid("key"));
    assertEquals("val", store.get("key"));
  }

  @Test
  public void testGet() {
    KeyValueStore store = new KeyValueStore();
    store.add("key", "val");

    assertTrue(store.isKeyValid("key"));
    assertEquals("val", store.get("key"));
  }

  @Test
  public void testIsKeyValidWithValidKey() {
    KeyValueStore store = new KeyValueStore();
    store.add("key", "val");

    assertTrue(store.isKeyValid("key"));
  }

  @Test
  public void testIsKeyValidWithInvalidKey() {
    KeyValueStore store = new KeyValueStore();

    assertFalse(store.isKeyValid("key"));
  }
}
