package com.Basics;

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            //When we create the string with new keyword, then it will create a new object in the heap memory, even if the string is same as the previous one.
            //But when we create the string without new keyword, then it will check if the string is already present in the string pool, if so it will not create a new object, but will point to the existing object in the string pool.
            String name = new String(sc.nextLine());
            String peru = new String(sc.nextLine());

            //Hashcode of the string is generated based on the content of the string, so if the content is same, then the hashcode will be same, even if the object is different.

            //Basically == operator checks if the two objects are same or not, but equals() method checks if the content of the two objects are same or not.
            
            System.out.println("name.hashCode(): " + name.hashCode());
            System.out.println("peru.hashCode(): " + peru.hashCode());

            String naam = "veena";
            String namam = "veena";

            String str1 = "Poodle";
            String str2 = "Semiya";

//Here compareTo() method is used to compare two strings lexicographically(It compares the each char one by one with their ASCII values). It returns a negative integer, zero, or a positive integer as the first string comes b4 second str, equal to, or 2nd str comes b4 1st str.

            System.out.println("str2.compareTo(str1): " + str2.compareTo(str1));
               System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));

            System.out.println(name == peru);
            System.out.println(naam == namam);
            System.out.println("name == peru ::: "+name.equals(peru));
            System.out.println("naam == namam ::: "+naam.equals(namam));


        }
    }
}
