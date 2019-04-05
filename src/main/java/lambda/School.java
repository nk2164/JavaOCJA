package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

interface StudentCriterion {
  boolean test(Student s);
}

class SmartStudentCriterion implements StudentCriterion {
  @Override
  public boolean test(Student s) {
    return s.getGpa() > 3;
  }
}

class EnthusiasticStudentCriterion implements StudentCriterion {
  @Override
  public boolean test(Student s) {
    return s.getCourses().size() > 2;
  }
}

public class School {
  public static void show(List<Student> ls) {
    Iterator<Student> iterator = ls.iterator();
    while(iterator.hasNext()) {
      System.out.println("> " + iterator.next());
    }
//    for (Student s : ls) {
//      System.out.println("> " + s);
//    }
    System.out.println("-----------------");
  }

//  public static List<Student> smartStudents(List<Student> ls, double threshold) {
//    List<Student> rv = new ArrayList<>();
//    for (Student s : ls) {
//      if (s.getGpa() > threshold) {
//        rv.add(s);
//      }
//    }
//    return rv;
//  }
//  public static List<Student> enthusiasticStudents(List<Student> ls, int threshold) {
//    List<Student> rv = new ArrayList<>();
//    for (Student s : ls) {
//      if (s.getCourses().size() > threshold) {
//        rv.add(s);
//      }
//    }
//    return rv;
//  }
  public static List<Student> studentsByCriterion
      (List<Student> ls, StudentCriterion crit) {
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
//    System.out.println("Smart students");
//    show(smartStudents(ls, 2.1));
//    System.out.println("Enthusiastic students");
//    show(enthusiasticStudents(ls, 2));
    System.out.println("Smart students");
    show(studentsByCriterion(ls, new SmartStudentCriterion()));
    System.out.println("Enthusiastic students");
    show(studentsByCriterion(ls, new EnthusiasticStudentCriterion()));

    // anonymous inner class
//    System.out.println("Not-Smart students");
//    show(studentsByCriterion(ls, new/*
//    class NotStudentCriterion implements */StudentCriterion() {
//      @Override
//      public boolean test(Student s) {
//        return s.getGpa() < 3;
//      }
//    }
//        ));

    // Argument MUST be:
    // an expression... (not a class defintion) no need for "new"
    // implementation of StudentCriterion
    // Interface declares EXACTLY ONE abstract method
    // I ONLY CARE about implement THAT ONE METHOD
//    System.out.println("Not-Smart students");
//    show(studentsByCriterion(ls, /*new StudentCriterion() {
//      @Override
//      public boolean test*/(Student s) -> {
//        return s.getGpa() < 3;
//      }
//    /*}*/
//        ));

//  // Lambda expression
//    System.out.println("Not-Smart students");
//    show(studentsByCriterion(ls, (Student s) -> {
//        return s.getGpa() < 3;
//      }));

    StudentCriterion o;
    o = (Student s) -> {
      return s.getGpa() < 3;
    };

//    ((StudentCriterion)(Student s) -> {
//      return s.getGpa() < 3;
//    }).test(null);

    // Lambda expression
    // Argument types: all or none! (can omit when unambiguous)
    // parentheses on arg list optional for single arg without type.
    // if body is simply "return expression" can replace entire block
    //  with "expression"... called expression-lambda (as opposed to
    //  "block lambda")
    System.out.println("Not-Smart students");
    show(studentsByCriterion(ls, s -> s.getGpa() < 3 ));

    StudentCriterion crit = s -> s.getGpa() < 3;
    System.out.println("crit is " + crit.getClass().getName());

  }
}
