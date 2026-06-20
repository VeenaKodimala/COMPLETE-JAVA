package com.JavaChapters;

/*Static variable is like a common property shared by all objects of a class. It is not bound to any specific object but belongs to the class itself. That is the reason we are calling the static variable using the class name. So if it gets changed, then it will affect all the objects of the class.*/

public class StaticKeyword {
    static int count; // static variable
    int instanceCount = 0; // instance variable

    static { // static block - it is executed when the class is loaded into memory, and it is used to initialize static variables. It is executed only once, and it is executed before the main method.
        count = 0; // initializing the static variable
        System.out.println("Static block executed: count initialized to " + count);

        //If we don't create an object, then the class will not be loaded into memory, and the static block will not be executed. So , w/o creating object, we can use Class.forName() method to load the class into memory and execute the static block. Example: Class.forName ("StaticKeyword");                                    
    }

    public void show() {
        System.out.println("count: "+count+" instanceCount: "+instanceCount); // incrementing the static variable in the method
    }

    public static void staticMethod(StaticKeyword sk) {
        System.out.println("This is a static method:instanceCount:: "+sk.instanceCount); // cannot access instance variable in static method - this will throw an error.

        System.out.println("This is a static method: count:: "+count); // can access static variable in static method

    }

    public static void main(String[] args) {
        StaticKeyword sk1 = new StaticKeyword();
        sk1.instanceCount = 5;
        sk1.show(); // count: 0
        StaticKeyword.count++; // incrementing the static variable using the class name
        StaticKeyword sk2 = new StaticKeyword();
         sk2.instanceCount = 6;
        sk2.show(); // count: 1
          StaticKeyword.count++; // incrementing the static variable using the class name
        StaticKeyword sk3 = new StaticKeyword();
         sk3.instanceCount = 7;
         sk3.show(); // count: 2
         sk1.show(); // count: 2

        System.out.println("Count at last: " + StaticKeyword.count); // accessing the static variable using the class name

            //StaticKeyword.staticMethod(); // calling the static method using the class name
            StaticKeyword.staticMethod(sk3); // calling the static method using the class name and passing an object as an argument, to indirectly access the instance variable in the static method
    }
}