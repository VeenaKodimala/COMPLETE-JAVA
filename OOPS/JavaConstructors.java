public class JavaConstructors {
private String name;
private int age;

    public JavaConstructors() {
        System.out.println("Default Constructor");
    }

    public JavaConstructors(String name) {
        this.name = name;
        System.out.println("Parameterized Constructor with name: " + name);
    }

    public JavaConstructors(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor with name: " + name + " and age: " + age);
    }

    public static void main(String[] args) {
        // Constructor is a special method that is used to initialize objects. It is called when an object of a class is created. It can be used to set initial values for object attributes. A constructor has the same name as the class and does not have a return type. There are two types of constructors in Java: default constructor and parameterized constructor. The default constructor is provided by the compiler if no constructor is defined in the class. The parameterized constructor is defined by the programmer and can take parameters to initialize the object attributes.
        // Constructor overloading is a feature in Java that allows a class to have more than one constructor with different parameter lists. This allows you to create objects in different ways, depending on the parameters you provide. When you create an object using a constructor, the appropriate constructor is called based on the number and type of arguments you pass.

        // Example of Constructor Overloading:
        JavaConstructors co = new JavaConstructors();
        JavaConstructors co1 = new JavaConstructors("Veena");
        JavaConstructors co2 = new JavaConstructors("Veena", 25);
    }
    
}
