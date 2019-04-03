package staticstuff;
class Y {
  static String sayHi() {
    return "Y-Hello";
  }
  String sayHi2() {
    return "Y-Hello2";
  }
}

class Z extends Y {
  static String sayHi() {
    return "Z-Hello";
  }
  String sayHi2() {
    return "Z-Hello2";
  }
}

public class LateBind {
  public static void main(String[] args) {
    Y y = new Z();
    System.out.println(y.sayHi() + ", " + y.sayHi2());
    /*
    What is the result?
    A) Y-Hello, Y-Hello2
    B) Y-Hello, Z-Hello2
    C) Z-Hello, Z-Hello2
    D) Z-Hello, Y-Hello2
    E) Compilation fails
*/
    System.out.println(((Y)null).sayHi());
    System.out.println(Z.sayHi());
  }
}
