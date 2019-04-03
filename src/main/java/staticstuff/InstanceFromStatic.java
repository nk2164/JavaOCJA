package staticstuff;

class XX {
  int a = 99;
  static void show(XX theThis) { // static methods DO NOT HAVE "this"
//    int a = 100;
    System.out.println("value of a is " + theThis.a);
  }
}
public class InstanceFromStatic {
  public static void main(String[] args) {
    XX x = new XX();
    x.show(x);
    XX.show(x);
  }
}
