package except;

import java.io.IOException;

public class Ex2 {
  public static void main(String[] args) throws Throwable {
    try {
      System.out.println("Before");
      if (Math.random() > 0.5) throw new IOException();
      System.out.println("Success");
    } finally {
      System.out.println("finally");
    }
    System.out.println("after");
  }
}
