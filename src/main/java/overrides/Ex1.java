package overrides;

class Q22 {
  public int getValue() {return 1;}
  public long getLongValue() {return 1L;}
  public Object getObjectValue() {return null;}
}

class Sub extends Q22 {
//  public int getValue(int x) {return 1;}
  public String getValue(int x) {return "Hello";}
//  @Override
//  public String getValue() {return "Hello";}
  @Override
  public String getObjectValue() {return null;}

//  @Override
//  PRIMITIVES must be exactly the same return type in
//  overriding methods!!!! Special case.
//  public int getLongValue() {return 1;}
}
public class Ex1 {
}
