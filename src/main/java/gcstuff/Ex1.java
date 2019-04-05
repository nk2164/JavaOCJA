package gcstuff;

class MyData {
  String s = new String("Hello");
  int x = 99;
}

public class Ex1 {
  public static MyData doStuff() {
    MyData md = new MyData();
//    MyData md2 = md;
//    md = new MyData();
    md = null;
    return md;
  }
  public static void main(String[] args) {
    MyData md = new MyData();
    MyData md1 = doStuff();
  }
}
