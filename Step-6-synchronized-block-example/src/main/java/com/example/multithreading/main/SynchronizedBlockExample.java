package com.example.multithreading.main;

import com.example.multithreading.counter.Counter;
import com.example.multithreading.task.CounterTask;

public class SynchronizedBlockExample {

	public static void main(String[] args) {
		
		//Counter Object that will be shared by multiple threads
		Counter mycounter = new Counter();

        // Create threads with CounterTask
        Thread thread1 = new Thread(new CounterTask(mycounter));
        Thread thread2 = new Thread(new CounterTask(mycounter));
        Thread thread3 = new Thread(new CounterTask(mycounter));
        Thread thread4 = new Thread(new CounterTask(mycounter));
      
        // Start 4 threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        
        // Wait for all 4 threads to finish
        try {
             
            thread1.join(); /* join() method causes the program to wait until thread on which it is called 
                               completes its execution before proceeding to the next line of code */
            thread2.join(); 
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display the final value of count which is class level Variable 
        System.out.println("Final Count: " + mycounter.getCount()); // Expected value: 40000
        

	}

}
