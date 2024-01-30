package request.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReader implements Reader {
  private List<String> fileContent;
  private int index;

  public FileReader(String filePath) throws IOException {
    this.fileContent = Files.readAllLines(Path.of(filePath));
    this.index = 0;
  }

  @Override
  public boolean hasNext() {
    return index < fileContent.size();
  }

  @Override
  public String next() {
    return this.fileContent.get(index++);
  }

}