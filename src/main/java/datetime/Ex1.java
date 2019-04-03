package datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex1 {

  public static void main(String[] args) {
    // new APIs use factories, not constructors
    LocalDate today = LocalDate.now();
    System.out.println(today);
    LocalDate next = today.plusDays(13);
//    LocalDate next2 = today.plus(5, ChronoUnit.HOURS);
    System.out.println(today);
    System.out.println(next);
//    System.out.println(next2);

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYYY - MMMM - dd");
    System.out.println(dtf.format(next));
  }
}
