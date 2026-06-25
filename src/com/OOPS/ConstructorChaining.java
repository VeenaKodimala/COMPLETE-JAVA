package com.OOPS;

class ConstructorChainingDemo{
    ConstructorChainingDemo(){
        int x = 10;
        //While implementing constructor chaining, sonstructor calling should always be first than rest of the statements.
        System.out.println("Hi");
        this(x);

    }
    ConstructorChainingDemo(int i){
         System.out.println("Printing "+i+" from int constructor");
         this("Hello");

    }
    ConstructorChainingDemo(String a){
        System.out.println("Printing "+a+" from string constructor");

    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        ConstructorChainingDemo ccd = new ConstructorChainingDemo();
    }

}
