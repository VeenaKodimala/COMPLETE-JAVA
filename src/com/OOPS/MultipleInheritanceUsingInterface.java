package com.OOPS;

/*
Below the code is an example of multiple inheritance using interfaces. In java, we cannot extend multiple classes, but we can implement multiple interfaces. In the below example, we have two interfaces DanceSchool and MusicSchool, both having a default method teaching(). The class MySchool implements both the interfaces and provides its own implementation of the teaching() method. Inside the teaching() method of MySchool, we are calling the teaching() methods of both the interfaces using super keyword. This way, we can achieve multiple inheritance in java using interfaces. 
The below approach, we are overriding the default methods of both the interfaces in the implementing class. We can also choose to not override the default methods of the interfaces in the implementing class, and in that case, we can call the default methods of the interfaces using the super keyword as shown below. This way, we can achieve multiple inheritance in java using interfaces without overriding the default methods of the interfaces in the implementing class.
*/

interface DanceSchool{
    default void teaching(){
        System.out.println("Teaching dance....");
    }
}

interface MusicSchool{
    default void teaching(){
        System.out.println("Teaching music....");
    }
}

class MySchool implements DanceSchool,MusicSchool{
    public void teaching(){
        System.out.println("My schools teaches the following....");
        DanceSchool.super.teaching();
        MusicSchool.super.teaching();

    }
}

public class MultipleInheritanceUsingInterface {
    public static void main(String[] args) {
        MySchool ms = new MySchool();
        ms.teaching();
    }
    

}
