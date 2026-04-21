class Calc{
    public int add(int a,int b){
        return a+b;

    }
    public double add(double a,int b){
        return a+b;
    }
    public double add(int a,int b,double c){
        return a+b+c;
    }

}

public class Polymorphism {   

    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        double c = 56;
        Calc cal = new Calc();

        System.out.println("a+b = "+cal.add(a,b));
        System.out.println("a+c = "+cal.add(c,a));
        System.out.println("a+b+c = "+cal.add(a,b,c));

    }
    
}
