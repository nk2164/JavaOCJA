package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class School {
  public static void show(List<Student> ls) {
    for (Student s : ls) {
      System.out.println("> " + s);
    }
    System.out.println("-----------------");
  }

  public static List<Student> smartStudents(List<Student> ls) {
    List<Student> rv = new ArrayList<>();
    for (Student s : ls) {
      if (s.getGpa() > 3) {
        rv.add(s);
      }
    }
    return rv;
  }
  public static void main(String[] args) {
    List<Student> ls = new ArrayList<>(Arrays.asList(
        Student.of("Fred", 3.2, "Math", "Art"),
        Student.of("Jim", 2.2, "Art"),
        Student.of("Sheila", 3.7, "Math", "Physics", "Astrophysics", "Quantum Mechanics")
    ));
    System.out.println("All students");
    show(ls);
    System.out.println("Smart students");
    show(smartStudents(ls));
  }
}
