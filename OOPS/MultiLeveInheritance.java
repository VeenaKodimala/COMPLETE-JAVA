

    class VeryAdvCalc{
   
  public double power(int a, int b){
    double power = a^b;
    return power;
  }

  public int rem(int a, int b){
    int rem = a%b;
    return rem;
  }
}

class AdvCalc extends VeryAdvCalc{
   
  public int multi(int a, int b){
    int prod = a*b;
    return prod;
  }

  public int div(int a, int b){
    int div = a/b;
    return div;
  }
}

class Calc extends AdvCalc{
   
  public int add(int a, int b){
    int sum = a+b;
    return sum;
  }

  public int sub(int a, int b){
    int diff = a-b;
    return diff;
  }
}

public class MultiLeveInheritance {
    public static void main(String[] args) {
        //Multi-level Inheritance
        Calc c = new Calc();
        System.out.println("Sum of 2 and 10 is:: "+c.add(2, 10));
        System.out.println("Diff of 10 and 2 is:: "+c.add(10, 2));
        System.out.println("Prod of 10 and 2 is:: "+c.multi(10, 2));
        System.out.println("Div of 10 and 2 is:: "+c.div(10, 2));
        System.out.println("Power of 10 and 2 is:: "+c.power(10, 2));
        System.out.println("Reminder of 10 and 3 is:: "+c.rem(10, 3));
    }
}
