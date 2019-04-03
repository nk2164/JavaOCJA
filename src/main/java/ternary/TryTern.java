package ternary;

public class TryTern {
  public static void main(String[] args) {
    boolean x = true;
    boolean y = false;
    String s = x ? y ? "X" : "Y" : "Z";
    System.out.println(s);
  }
}
