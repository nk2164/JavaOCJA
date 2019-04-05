package gcstuff;

class Circular {
  public Circular other;
}

public class Ex2 {
  public static void main(String[] args) {
    Circular c1 = new Circular();
    Circular c2 = new Circular();
    c1.other = c2;
    c2.other = c1;

    c1 = null;
    c1 = c2.other;
    c2 = null;
    c1 = null;
  }
}
