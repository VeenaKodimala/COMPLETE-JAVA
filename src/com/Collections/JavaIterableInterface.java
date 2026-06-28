package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaIterableInterface {
    static List<Integer> lst = new ArrayList<>();
    public static void main(String[] args) {
        //here, why left List and right ArrayList, because List is an interface and ArrayList is a class that implements the List interface. By using List on the left side, we can easily change the implementation to another List type (like LinkedList) in the future without changing the rest of the code. we are creating reference to interface and obj to class.
        
        lst.add(3);
        lst.add(5);
        lst.add(6);
        lst.add(3);
        lst.add(9);

        System.out.println("lst::: "+lst);
        Iterator<Integer> itr = lst.iterator();
        while (itr.hasNext()) {
            int a = itr.next();
            System.out.println("Current element: "+a);
            if(a == 3){
                itr.remove();
            }
            
        }
//The below loop will not print anything with itr1, because the iterator has already reached the end of the list in the previous loop. We created a new iterator To iterate again or we can simply use for enhanced for loop as well.
Iterator<Integer> itr2 = lst.iterator();
System.out.println("Printing values using while loop");
        while (itr2.hasNext()) {
            System.out.println("Index is at number: "+itr2.next());            
        }
        System.out.println("Printing values using for loop");
        for(int l : lst){
            System.out.println("For loop index is at number: "+l);  

        }

        //we can iterate through forEach() method of Iterable interface as well, which is implemented by all collection classes. The forEach() method takes a lambda expression as an argument, which defines the action to be performed on each element of the collection.
        lst.forEach((Integer l) -> System.out.println("l::: "+l));
        //(Integer l) -> System.out.println("l::: "+l) - This is a lambda expression that takes an Integer parameter l and prints it to the console. Left side of the arrow (->) is the parameter list, and the right side is the action to be performd. We can use the parameter from left side in the right side of the arrow. The forEach() method will call this lambda expression for each element in the list, passing the current element as the argument l.
        //lambda expression is available only from java 1.8(java 8).


        JavaCollectionInterface jci = new JavaCollectionInterface();

        jci.collectionMethods(lst);



        
    }
    
   

  

}
