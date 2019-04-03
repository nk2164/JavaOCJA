package ternary;

public class TryTern {
  public static void main(String[] args) {
    boolean x = true;
    boolean y = false;
    String s = x ? y ? "X" : "Y" : "Z";
    System.out.println(s);

    // x < y ? x < z ? x : z : y < z ? y : z;
    int x1 = 99, y1 = 100, z1 = 80;
    int res = x1 < y1
        ? (x1 < z1 ? x1 : z1)
        : (y1 < z1 ? y1 : z1);
  }
}
