public class finalKeyword {
        //final keyword can be used with class, variable and method.


  
    public static void main(String[] args) {
        final int num = 8;
        //num = 10; // This will cause a compilation error because num is final
        System.out.println("The value of num is: " + num);
        //Calc calc = new Calc();
        AdvCalc calc = new AdvCalc();
        calc.square(num);
    }
}

// final class Calc{
 class Calc{
    //The below commented line will prevent the method from being overridden in the child class. So, if we want to allow method overriding, we should not make the method final.
        //public final void square(int num){
        public void square(int num){
            System.out.println("Square of " + num + " is: " + (num * num));

        }
    }
//public class AdvCalc extends Calc{
    // This will cause a compilation error because Calc is a final class and cannot be extended. So we are stopping the inheritance of a final class.
//}

public class AdvCalc extends Calc{
    //usually, when we want to prevent method overriding, we can make the method final. This will prevent the child class from overriding the parent method.
     public void square(int num){
            System.out.println("Square of " + num + " is: " + (num * num) +" in class AdvCalc");

        }
}

