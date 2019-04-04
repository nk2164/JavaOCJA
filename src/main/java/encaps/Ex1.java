package encaps;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex1 {
  private int d;
  private StringBuilder sb;
  private List<String> names = new LinkedList<>();

  public Ex1(StringBuilder sb) {
    if (sb.length() < 3) throw new IllegalArgumentException();
    this.sb = sb; // BAD, uses third party mutable object!!!
    this.d = 99;
  }
  public Ex1(int d, String s) {
    this.d = d; // OK, primitive gets copied
    // business rule: text must have at least 3 chars..
    if (s.length() < 3) throw new IllegalArgumentException();
    sb = new StringBuilder(s);
  }

  public StringBuilder getSb() {
    return sb; // NO, exposed mutable object
  }

  public List<String> getNames() {
    return names; // bad!
  }

  public void setText(String text) {
    if (text.length() < 3) throw new IllegalArgumentException();
    sb = new StringBuilder(text);
  }

  /*
    A) Encapsulated
    B) Not! <---
  */
  public static void main(String[] args) {
    Ex1 ex1 = new Ex1(99, "ABCDE");
    ex1.getSb().setLength(0);
    ex1.getNames().clear();

    StringBuilder sb = new StringBuilder("ABCD");
    Ex1 ex = new Ex1(sb);
    sb.setLength(0);
  }
}
