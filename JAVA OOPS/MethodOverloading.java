import java.util.*;

public class Main {
    public static void main(String[] args) {
      M obj = new M();
      obj.add(10.0,20.0);
  }
}

public class M{
 public void add(double a,double b){
    System.out.println(a+b);
  }
  
  public int add(int a,int b,int c){
    return a+b+c;
  }
  public int add(int a,int b){
    return a+b;
  }
  
}