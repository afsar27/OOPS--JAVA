public class Main{
  public static void main(String[] args){
    Shape s;
    s = new Triangle();
    s.shape();
    s = new Rectangle();
    s.shape();
  }
}

class Shape{
  void shape(){
    System.out.println("Shape");
  }
}

class Triangle extends Shape{
  void shape(){
    System.out.println("Triangle");
  }
}

class Rectangle extends Shape{
  void shape(){
    System.out.println("Rectangle");
  }
}

class Square extends Shape{
  void shape(){
    System.out.println("sqaure");
  }
}