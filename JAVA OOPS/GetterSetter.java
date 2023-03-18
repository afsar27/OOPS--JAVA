import java.util.*;


public class Main {
 
    public static void main(String[] args) {
      
      App obj = new App();
      obj.setFirst("Mohamed");
      obj.setLast("Afsar");
      System.out.print(obj.getFirst()+" "+obj.getLast());
  }
}

public  class App{
    String firstName;
    String lastName;
   public void setFirst(String fname){
     this.firstName = fname;
   }
   public String getFirst(){
     return firstName;
   }
   
   public void setLast(String lname){
     this.lastName = lname;
   }
   
   public String getLast(){
     return lastName;
   }
}