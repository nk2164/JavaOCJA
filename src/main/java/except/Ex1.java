package except;

import javax.management.BadStringOperationException;
import javax.swing.text.BadLocationException;
import java.io.IOException;
import java.sql.SQLException;

public class Ex1 {
  public static void main(String[] args) throws BadStringOperationException,
      IOException, SQLException {
    try {
      if (Math.random() > 0.5) throw new IOException();
      if (Math.random() > -1) throw new SQLException();
      throw new BadStringOperationException("");
    } catch (IOException | SQLException e) {
      System.out.println("Got exception " + e.getClass().getName());
      throw e;
    }
  }
}
