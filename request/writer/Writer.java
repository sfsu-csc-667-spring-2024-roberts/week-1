package request.writer;

import java.io.IOException;
import java.io.OutputStream;

import request.dao.KeyValueStore;

public abstract class Writer {
  protected OutputStream out;
  protected KeyValueStore store;

  public Writer(OutputStream out, KeyValueStore store) {
    this.out = out;
    this.store = store;
  }

  abstract public void write() throws IOException;
}