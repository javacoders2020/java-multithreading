package com.example.multithreading.counter;

public class Counter {

	// Instance variable candidate for race condition as it will be updated by multiple threads
	 private volatile int count = 0;

	 /*  Now, the count variable will have the visibility guarantee provided by the volatile keyword, 
	  * ensuring that changes made by one thread are immediately visible to other threads. */
	 
    
	 /* method to increment the value of count variable. 
        method called by multiple threads */	
	public void increment() {
    	   // Print a message to the console indicating which thread is running
      System.out.println("Thread " + Thread.currentThread().getName() + " is running");
    	count++;
    }
    
	// method to retrieve value of count variable
    public int getCount() {
        return count;
    }
	
}
