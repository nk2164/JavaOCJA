package equality;

public class Ex1 {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "He";
    String s3 = s2 + "llo";
    String s4 = Ex3.h;
    System.out.println("s1 " + s1);
    System.out.println("s3 " + s3);
    System.out.println("s1 == s3 ? " + (s1 == s3));
    System.out.println("s1.equals(s3) ? " + s1.equals(s3));
    System.out.println("s1 == s4 ? " + (s1 == s4));
    // A) true
    // B) false
  }
}
