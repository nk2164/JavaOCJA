package overrides;

import java.io.IOException;

class Base {
  void doBaseStuff() {
    System.out.println("doBaseStuff");
  }
}

class Sub2 extends Base {
  //@Override // NOTE this was NOT part of the question (and it matters!)
  void doBaseStuff() throws RuntimeException {
    System.out.println("doSubStuff");
//    if (Math.random() > 0.5) throw new IOException();
  }

  void doOtherStuff() {
    System.out.println("doOtherStuff");
  }
}

public class Ex2 {
  public static void main(String[] args) {
    Base b = new Sub2();
    b.doBaseStuff();
  }
}
