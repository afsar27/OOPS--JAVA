import java.util.*;

public class Main {
    public static void main(String[] args) {
      SECE s = new SECE();
      PSG p = new PSG();
      CollegeFee c = new CollegeFee();
      System.out.println(s.fees());
      System.out.println(p.fees());
      System.out.println(c.fees());
      
  }
}


class CollegeFee{
  static int fees(){
    return 10000;
  }
}

class SECE extends CollegeFee{
  static int fees(){
    return 20000;
  }
}

class PSG extends CollegeFee{
  static int fees(){
    return 30000;
  }
}