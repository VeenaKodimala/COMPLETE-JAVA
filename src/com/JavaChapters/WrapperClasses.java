package com.JavaChapters;

public class WrapperClasses {
    // Wrapper classes are used to convert primitive data types into objects. This is useful when you need to use methods that are only available for objects, or when you want to store primitive data types in collections that require objects (like ArrayList).
public static void main(String[] args) {
int n = 9;
    System.out.println("n:: "+n);

Integer nI =n; // This is called autoboxing, where the primitive int is automatically converted to an Integer object.
    System.out.println("nI:: "+nI);


int np = nI.intValue();// This is called unboxing, where the Integer object is converted back to a primitive int.
    System.out.println("np:: "+np);


}

}
