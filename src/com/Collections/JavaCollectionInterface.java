package com.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class JavaCollectionInterface {
    public void collectionMethods(List<Integer> lst) {
        System.out.println("Inside collectionMethods of JavaCollectionInterface");

        System.out.println("List from JavaIterableInterface: "+lst);

        System.out.println("--------METHODS OF COLLECTION INTERFACE--------");

        System.out.println("Size of the list: "+lst.size());
        System.out.println("Is the list empty: "+lst.isEmpty());
        System.out.println("Does the list contain 3: "+lst.contains(3));
        System.out.println("lst as array: "+lst.toArray());
        System.out.println("adding 3 to lst: "+lst.add(3));
        System.out.println("removing 2th index element from lst: "+lst.remove(2));
        System.out.println("removing number 6 from lst: "+lst.remove(Integer.valueOf(6)));
        List<Integer> lst2 = new Stack<>();
       
        System.out.println("adding all elements from lst to lst2: "+lst2.addAll(lst));
        System.out.println("lst2: "+lst2);
        System.out.println("lst:: "+lst);
        System.out.println("Removing all elements from lst, that are present in lst2: "+lst.removeAll(lst2));
        System.out.println("Add all elements of lst2 to lst after removing from lst: "+lst.addAll(lst2));
        System.out.println("Are lst and lst2 same:: "+lst.equals(lst2));
        lst2.clear();
        System.out.println("Clearing lst2: "+lst2);





        

    }
    
}
