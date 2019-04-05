package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

interface SelectFromMany {
  List<Student> get(List<Student> in, Predicate<Student> crit);
}

public class Ex2 {
  public static void main(String[] args) {
    List<Student> ls = Arrays.asList(
        Student.of("Fred", 3.2, "Math", "Art"),
        Student.of("Jim", 2.2, "Art"),
        Student.of("Sheila", 3.7, "Math", "Physics", "Astrophysics", "Quantum Mechanics")
    );

    SelectFromMany selector = (in, crit) -> {
      List<Student> out = new ArrayList<>();
      for (Student s : in) {
        if (crit.test(s)) out.add(s);
      }
      return out;
    };

    List<Student> res = selector.get(ls, s -> s.getName().length() > 3);
    System.out.println(res);
  }

}
