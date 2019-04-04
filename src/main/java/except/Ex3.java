package except;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex3 {
  public void doStuff() throws IOException { // line n1
    try (FileInputStream fis = new FileInputStream("data.dat");) { // line n2
      if (Math.random() > 0.5) throw new IOException();
    } // line n3
  }
}
