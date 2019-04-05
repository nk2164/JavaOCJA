package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex3 {
  public static void main(String[] args) {
    List<Student> ls = new ArrayList<>(Arrays.asList(
        Student.of("Fred", 3.2, "Math", "Art"),
        Student.of("Jim", 2.2, "Art"),
        Student.of("Sheila", 3.7, "Math", "Physics", "Astrophysics", "Quantum Mechanics")
    ));
    ls.forEach(s -> System.out.println("> " + s));
    System.out.println("------------");
    ls.sort((a, b) -> b.getName().compareTo(a.getName()));
    ls.forEach(s -> System.out.println("> " + s));
    System.out.println("------------");
    ls.sort((a, b) -> Double.compare(b.getGpa(), a.getGpa()));
    ls.forEach(s -> System.out.println("> " + s));
    System.out.println("------------");

  }
}
