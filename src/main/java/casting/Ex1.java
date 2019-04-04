package casting;

class Base {
  public String getMessage() {
    return "I'm a Base";
  }
}
class Sub extends Base {
  public String myName;
  @Override
  public String getMessage() {
    return "I'm a Sub derived from " + super.getMessage();
  }

  public String getSubMessage() {
    return "Special sub-message";
  }
}

public class Ex1 {
  public static void showMessage(Base b) {
    System.out.println("Message is " + b.getMessage());

    System.out.println("b is: " + b.getClass().getName());
    if (b instanceof Sub) {
      System.out.println("oh! it's a Sub");
      Sub s = (Sub)b;
      System.out.println("Sub message is " + s.getSubMessage());
    }
  }

  public static void main(String[] args) {
//    Base b = new Sub();
//    System.out.println(b.getMessage());
    showMessage(new Sub());
    showMessage(new Base());
    /*
    A) Runtime Exception
    B) Sub message is null
    C) Sub message is I'm a sub derived from Base
    D) Sub message is Derived from Base
     */


  }
}
