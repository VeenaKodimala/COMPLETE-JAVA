package com.JavaChapters;

// A class which is created inside a class is kanown as an inner class. An inner class can be used to logically group classes that are only used in one place, to increase encapsulation, and to make the code more readable and maintainable. Inner classes can access the members of the outer class, including private members, which allows for a tight coupling between the inner and outer classes. 

//we can make a class static, only when it is an inner class. A static inner class cannot access non-static members of the outer class, but it can access static members of the outer class. A non-static inner class can access both static and non-static members of the outer class.
class OuterClass{
    private int num = 10;
    static int staticNum = 20;
     class Inner{
        public void display(){
            System.out.println("Printing outer class's private variable num: "+num);
        }

     }

     static class staticInner{
        public void show(){
            System.out.println("This is a static inner class, it cannot access non-static members of the outer class.");
            System.out.println("But it can access static members of the outer class: "+staticNum);
        }
     }
}

class AnonymousClassDemo{
    public void display(){
        System.out.println("This is an anonymous class demo.");
    }
}

//Combining both abstract and anonymous inner class.
abstract class AbAnclass{
    public abstract void todo();
}


public class InnerClass {
    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        //creating an instance of the inner class using the instance of the outer class
        OuterClass.Inner i = o.new Inner(); 
        i.display(); // This will call the display() method of the inner class, which will print the value of the private variable num from the outer class.
        OuterClass.staticInner si = new OuterClass.staticInner(); // This is how we create an instance of the static inner class, we do not need an instance of the outer class to create an instance of the static inner class.
        si.show(); // This will call the show() method of the static inner class, which will print a message and the value of the static variable staticNum from the outer class.

AnonymousClassDemo acd = new AnonymousClassDemo()
{
    // This is an anonymous class, it is a class without a name that is defined and instantiated in a single expression. It is often used to provide a quick implementation of an interface or to override a method of a class without having to create a separate named class.
    public void display(){
        System.out.println("This is an anonymous class demo, it overrides the display() method of the AnonymousClassDemo class.");
    }

    //The bwlow cannot be done, because the original class doesn't have any such method. And also this anonymous innner class are used to override the existing methods, not t ocreate new ones.
    // public void show(){
    //     System.out.println("This is an anonymous class demo, we can also give any new implementations in the anonymous inner class.");
    //}
};
acd.display(); // This will call the display() method of the anonymous class, which will print a message indicating that it is an anonymous class demo and that it overrides the display() method of the AnonymousClassDemo class.
// acd.show(); // This will give error because the original class doesn't have any such method.

AbAnclass abn = new AbAnclass() {
    // This is an anonymous class that extends the abstract class AbAnclass. Since AbAnclass has an abstract method todo(), we must provide an implementation for that method in the anonymous class.
    public void todo(){
        System.out.println("This is an anonymous class that extends the abstract class AbAnclass, and it provides an implementation for the abstract method todo().");
    }
};
abn.todo(); // This will call the todo() method of the anonymous class, which will print a message indicating that it is an anonymous class that extends the abstract class AbAnclass and provides an implementation for the abstract method todo().
    
}
}
