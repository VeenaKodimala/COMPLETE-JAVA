package com.Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionsPriorityQueue {
   
    public Queue<Integer> priorityQueueAdd(){
        Queue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(78);
        pq.add(34);
        pq.add(2);

        System.out.println("Priority queue, following natural order:: "+pq);
        /*In above, the elements are in ascending order. So, internally a min heap is constructed. */

       


    return pq;
    }

    public void priorityQueueRemove(Queue<Integer> pq){
         System.out.println("-------Removing elementa in queue---------");
        while (!pq.isEmpty()) {
            int val = pq.poll();
            System.out.println("Removed values: "+val);
        }
        System.out.println("size of queue after removing all elements: "+pq.size());
    }


    public Queue<Integer> pqMaxHeap(){
        try{
            //in below, we are using lambda exp, where we are doing b-a. 
            Queue<Integer> maxPQ = new PriorityQueue<>((a,b) -> b-a);

            maxPQ.add(10);
            maxPQ.add(78);      
            maxPQ.add(5);
            maxPQ.add(34);
            maxPQ.add(2);
            System.out.println("Max heap priority queue:: "+maxPQ);
           /* In above, the elements are in descending order. So, internally a max heap is constructed. */



            return maxPQ;

        } catch(Exception e){
            System.err.println("Exception in pqMaxHeap: "+e);
            return null;
        }

    }

}
