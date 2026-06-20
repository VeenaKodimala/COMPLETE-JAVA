package com.OOPS;

/* In every constructure, we will have a defaultmethod 
called super().
 This will check if the current class extensds 
 any other class(parent), if so it will first
  call the parent's constructor and then the constructor of itself.
But when you call a parameterised constructor of B, even then the defualt constructor of A
will only be called. Because in constructor B super() will be called and not super(<parameters>).
The above has to be done by us explicitly.
 */
//Every class in java by default(if not extends any other class) extends Object class.
class A{
    public A(){
        System.out.println("Constructor of A");
        String a = "Req004,Req012";
        if(a.contains("Req004")){
            System.out.println("Requirement 004 is present");

        }
    }

     public A(int a){
        System.out.println("Constructor of A with int parameter: " + a);
    }

    public int sum2Nums(int n, int m){
        return n+m;

    }
}

class B extends A{
    public B(){
        //super() will by default be called here, even if we don't write it. It will call the default constructor of A.
        super();
        System.out.println("Constructor of B");
    }

    public B(int i){
        //we are explicitly calling the parameterized constructor of the parent class, by passing the parameter.
        super(i);
        System.out.println("Constructor of B with int parameter: " + i);
    }

    
    public int sum2Nums(int n, int m){
        return n+m+1;

    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        B b = new B(5);

        //Below, method overriding is demonstrated. Where the child's method is overriding the parent method.
        int result = b.sum2Nums(3, 4);
        System.out.println("Sum of 3 and 4 using B's method: " + result);

    }
}