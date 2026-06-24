package com.OOPS;


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

    public JavaConstructors(JavaConstructors obj){
        this.name = obj.name;
        this.age = obj.age;
        System.out.println("This is a copy constructor, which is used to create a new object as a copy of an existing object. It takes an object of the same class as a parameter and copies its attributes to the new object.");
        System.out.println("Copy Constructor with name: " + name + " and age: " + age);

    }

    public static void main(String[] args) {
        // Constructor is a special method that is used to initialize objects. It is called when an object of a class is created. It can be used to set initial values for object attributes. A constructor has the same name as the class and does not have a return type. There are two types of constructors in Java: default constructor and parameterized constructor. The default constructor is provided by the compiler if no constructor is defined in the class. The parameterized constructor is defined by the programmer and can take parameters to initialize the object attributes.
        // Constructor overloading is a feature in Java that allows a class to have more than one constructor with different parameter lists. This allows you to create objects in different ways, depending on the parameters you provide. When you create an object using a constructor, the appropriate constructor is called based on the number and type of arguments you pass.

        // Example of Constructor Overloading:
        JavaConstructors co = new JavaConstructors();
        JavaConstructors co1 = new JavaConstructors("Veena");
        JavaConstructors co2 = new JavaConstructors("Veena", 25);
        JavaConstructors co3 = new JavaConstructors(co2);
    }
    
}
//Private constructor: It is a constructor which is declared private inside the class. This constructor, stops the instnce createion of the calss, because, it prvents the obj creation of the calss, since the constructor is private. The instance creation can be controlled useing static method "getInstance". This is used in Singleton design pattern, where we want to create only one instance of the class. The private constructor is used to prevent the instantiation of the class from outside the class. The static method "getInstance" is used to create and return the single instance of the class. If the instance already exists, it returns the existing instance, otherwise it creates a new instance and returns it.