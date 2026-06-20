package com.OOPS;

/*  In java, if an abstract class has only abstract methods, it is recommended to use an interface instead.
Interface is not a class
By default, the methods in an interface are abstract and public.
We cannot create an instance of an interface .
Interfaces just lay an outline of methods that a class must implement, but do not actually provide any implementation themselves. 
In we implement an interface, then by default, we need to provide implementation for all the methods declared in the interface. If not, then the class implementing the interface must be declared as abstract.
*/

//This will automatically be a private interface, which will only be accessed by the classes inside same package.
interface DemoInterface {
    //By default, the variables in an interface are public, static and final. You should initialize them at the time of declaration.
    int a=10;
    int b=20;
void show();
void signOff();
    
}

interface AnotherInterface{
    void display();
}

/*We can create multiple interfaces and implement them in a single class. */

class ChildImpl implements DemoInterface, AnotherInterface{
public void signOff(){
    System.out.println("Signing off....");
}
public void show(){
    System.out.println("Inside show method of class ChildImpl");
}

public void display(){
        System.out.println("Inside display method of class ChildImpl implemented from AnotherInterface");
}
}

public class JavaInterface {
    public static void main(String[] args) {
        DemoInterface ci = new ChildImpl();
        System.out.println("Created obj of child class");
        ci.show();
        ci.signOff();
        System.out.println("value of a in DemoInterface: "+DemoInterface.a);
        System.out.println("value of b in DemoInterface: "+DemoInterface.b);
        
    }
}
