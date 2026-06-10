//Abstract class is a class that cannot be instantiated, but can be subclassed. It is used to provide a common base class for other classes to inherit from. An abstract class can contain abstract methods, which are methods that are declared but not implemented in the abstract class. Subclasses of the abstract class must provide an implementation for the abstract methods.

//Why do we need to provide a declaration to a method when we are not providing an implementation to it? This is because the abstract class is meant to be a blueprint for other classes. It defines the structure and behavior that the subclasses must follow. By declaring abstract methods, we are enforcing that the subclasses must provide an implementation for those methods, ensuring that they adhere to the defined structure and behavior.

//So, it is basically to enforce a contract between the abstract class and its subclasses, ensuring that the subclasses implement the necessary methods to maintain the integrity of the design.

//Does it not have any functionality? Is it only to maintain the design? An abstract class can have both abstract methods (which do not have an implementation) and concrete methods (which do have an implementation). The concrete methods can provide common functionality that can be shared among the subclasses, while the abstract methods define the structure that the subclasses must follow. So, an abstract class can indeed have functionality, but it also serves to maintain the design and enforce a contract for its subclasses.

//What is a concrete method? A concrete method is a method that has an implementation in the class where it is defined.It is just a normal method. It can be called and executed directly. In contrast, an abstract method is declared without an implementation and must be implemented by subclasses of the abstract class. Concrete methods can provide common functionality that can be shared among subclasses, while abstract methods define the structure that subclasses must follow.

//Imp: object of an abstract class cannot be created, but a reference of an abstract class can be created. This is because the abstract class is meant to be a blueprint for other classes, and it cannot be instantiated on its own. However, you can create a reference of the abstract class and assign it to an object of a subclass that implements the abstract methods. This allows you to use the reference to call the methods defined in the abstract class, while still utilizing the implementation provided by the subclass. Abstarct methods can be declared only in an abstract class.


abstract class AbstractDemo{
    // This is an abstract method, it does not have an implementation and must be implemented by any subclass of AbstractDemo.
    abstract void demo();

    public void show(){
        System.out.println("This is just a demo of concrete methods.");
    }

}

class AbstractDemoChild extends AbstractDemo{
    // Here we are providing an implementation for the abstract method demo() from the AbstractDemo class.
    void demo(){
        System.out.println("This is the implementation of the abstract method demo() in the AbstractDemoChild class.");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        //This will allow me to use both the parent and child class methods.
        AbstractDemo adc = new AbstractDemoChild();
        adc.demo(); // This will call the demo() method implemented in the AbstractDemoChild class.
        adc.show(); // This will call the show() method from the AbstractDemo class.
    }
}
