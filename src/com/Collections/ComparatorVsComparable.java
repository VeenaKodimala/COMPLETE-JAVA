package com.Collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorVsComparable {

    public void comparatorDemo(List<Integer> arr){
        try{
            arr.sort((a, b) -> Integer.compare(b, a));
            System.out.println("Sorted array using comparator: "+arr);

            Integer[] arr1 = arr.toArray(new Integer[0]);
             Arrays.sort(arr1);

             System.out.println("Sorted array using Arrays.sort() without any comparator, so default ascending: "+Arrays.toString(arr1));






        } catch(Exception e){
            System.err.println("Exception in comparatorDemo: "+e);
        }

    }   

    public void createMedicineBox(){
        try{
            System.out.println("Inside createMedicineBox");

            MedicineBox[] medicineBox = new MedicineBox[3];
            medicineBox[0] = new MedicineBox("Headache", "WhiteTablet");
            medicineBox[1] = new MedicineBox("StomachAche", "RedTablet");
            medicineBox[2] = new MedicineBox("Nausea", "GreenTablet");

            System.out.println("Before swapping.....");
            for(MedicineBox m:medicineBox){
                System.out.println(m.problem+":::"+m.tablet);
            }

            //Implementing comparator using Lambda expression.

            Arrays.sort(medicineBox,
                (obj1,obj2) -> (obj2.problem.compareTo(obj1.problem))
            );


            System.out.println("After swapping in descending order.....using lambda expression");

            for(MedicineBox m:medicineBox){
                System.out.println(m.problem+":::"+m.tablet);
            }

             Arrays.sort(medicineBox,
                (obj1,obj2) -> (obj1.problem.compareTo(obj2.problem))
            );


            //Implementing comparator using Anonymous expression.

            Arrays.sort(medicineBox,new Comparator<MedicineBox>() {
                public int compare(MedicineBox a, MedicineBox b){
                    return a.problem.compareTo(b.problem);
                }
            });

             System.out.println("After swapping in ascending order.....using anonumous class");

            for(MedicineBox m:medicineBox){
                System.out.println(m.problem+":::"+m.tablet);
            }

            //Implementing comparator using comparator interface implemented in the class..

             MedicineBoxComparatorDemo[] medicineBoxComparator = new MedicineBoxComparatorDemo[3];

            medicineBoxComparator[0] = new MedicineBoxComparatorDemo("Headache", "WhiteTablet");
            medicineBoxComparator[1] = new MedicineBoxComparatorDemo("StomachAche", "RedTablet");
            medicineBoxComparator[2] = new MedicineBoxComparatorDemo("Nausea", "GreenTablet");

            Arrays.sort(medicineBoxComparator);

             System.out.println("After swapping in ascending order.....using class implementing Comparator.");

            for(MedicineBoxComparatorDemo m:medicineBoxComparator){
                System.out.println(m.problem+":::"+m.tablet);
            }

            //Implementing Comparable using Comparable interface implemented in the class..

             MedicineBoxComparableDemo[] medicineBoxComparable = new MedicineBoxComparableDemo[3];

            medicineBoxComparable[0] = new MedicineBoxComparableDemo("Headache", "WhiteTablet");
            medicineBoxComparable[1] = new MedicineBoxComparableDemo("StomachAche", "RedTablet");
            medicineBoxComparable[2] = new MedicineBoxComparableDemo("Nausea", "GreenTablet");

            Arrays.sort(medicineBoxComparable);

            System.out.println("After swapping in ascending order.....using class implementing Comparable.");

            for(MedicineBoxComparableDemo m:medicineBoxComparable){
                System.out.println(m.problem+":::"+m.tablet);
            }

        } catch(Exception e){
            System.err.println("Exception in createMedicineBox: "+e);
        }
    }
}

class MedicineBox{
        String problem;
        String tablet;

        MedicineBox(String problem, String tablet){
            this.problem = problem;
            this.tablet = tablet;
        }
    }

class MedicineBoxComparableDemo implements Comparable<MedicineBox>{
        String problem;
        String tablet;

        MedicineBoxComparableDemo(String problem, String tablet){
            this.problem = problem;
            this.tablet = tablet;
        }

public int compareTo(MedicineBox m){
    return this.problem.compareTo(m.problem);

}

    }    

    class MedicineBoxComparatorDemo implements Comparator<MedicineBox>{
        String problem;
        String tablet;

        MedicineBoxComparatorDemo(String problem, String tablet){
            this.problem = problem;
            this.tablet = tablet;
        }

public int compare(MedicineBox m,MedicineBox n){
    return m.problem.compareTo(n.problem);

}

    }   
