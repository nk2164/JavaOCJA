package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class PredSchool {
  public static void show(List<Student> ls) {
    for (Student s : ls) {
      System.out.println("> " + s);
    }
    System.out.println("-----------------");
  }

  public static List<Student> studentsByCriterion
      (List<Student> ls, Predicate<Student> crit) {
    List<Student> rv = new ArrayList<>();
    for (Student s : ls) {
      if (crit.test(s)) {
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

    System.out.println("Not-Smart students");
    show(studentsByCriterion(ls, s -> s.getGpa() < 3 ));

    System.out.println("Medium-Smart students");
    show(studentsByCriterion(ls, s -> s.getGpa() > 3 && s.getGpa() < 3.5 ));

    System.out.println("Not enthusiastic, but fairly smart students");
    show(studentsByCriterion(ls, s -> s.getCourses().size() < 3 && s.getGpa() > 3 ));


  }
}
