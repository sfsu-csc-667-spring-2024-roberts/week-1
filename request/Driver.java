package request;

import java.io.IOException;

import request.dao.KeyValueStore;
import request.reader.FileReader;
import request.writer.ConsoleWriter;
import request.writer.Writer;

public class Driver {
  public static void main(String[] args) throws IOException {
    if (args.length != 1) {
      System.err.println("usage: java Driver <filepath>");
      System.exit(1);
    }

    FileReader reader = new FileReader(args[0]);
    KeyValueStore store = new KeyValueStore();

    while (reader.hasNext()) {
      String[] kv = reader.next().split("\s*");

      store.add(kv[0], kv[1]);
    }

    Writer writer = new ConsoleWriter(System.out, store);
    writer.write();

  }
}