package datetime;

import java.time.LocalDate;
import java.time.Period;

public class Ex2 {
  public static void main(String[] args) {
    Period aMonth = Period.ofMonths(2);
    LocalDate today = LocalDate.now();
    LocalDate later = today.plus(aMonth);
    System.out.println("later is " + later);

    Period longer = Period.of(1, 14, 465);
    System.out.println("longer is " + longer);
    longer = longer.normalized();
    System.out.println("longer is " + longer);


  }
}
