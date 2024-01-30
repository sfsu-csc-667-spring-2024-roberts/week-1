package request.writer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import request.dao.KeyValueStore;

public class ConsoleWriter extends Writer {

  private BufferedWriter writer;
  private final String format = "%s: %s\n";

  public ConsoleWriter(OutputStream out, KeyValueStore store) {
    super(out, store);

    this.writer = new BufferedWriter(new OutputStreamWriter(out));
  }

  @Override
  public void write() throws IOException {
    for (String key : this.store.keys()) {
      writer.write(String.format(format, key, this.store.get(key)));
    }
  }

}
