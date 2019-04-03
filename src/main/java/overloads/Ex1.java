package overloads;

class X {
//  void doStuff(int x, int y) {}
//  void doStuff(double x, double y) {} // line n1
  void doStuff(int x, double y) {}
  void doStuff(double x, int y) {} // line n1

}

public class Ex1 {
  public static void main(String[] args) {
    X x = new X();
//    x.doStuff(3, 4); // line n2
    x.doStuff(2, 3.14); // line n3
  }
}
