package hello;

public class Hello {
  public static void main(String[] args) {
    var r = ((Runnable)()-> System.out.println("Hello world"));
    r.run();
  }
}
