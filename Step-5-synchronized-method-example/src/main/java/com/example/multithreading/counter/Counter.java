package com.example.multithreading.counter;

public class Counter {

	// Instance variable candidate for race condition as it will be updated by multiple threads
	 private  int count = 0;

	 
    
	 /* synchronized method to increment the value of count variable. 
        method called by multiple threads */	
	public  synchronized void increment() {
    	   // Print a message to the console indicating which thread is running
      System.out.println("Thread " + Thread.currentThread().getName() + " is running");
    	count++;  // critical section  of code updated by multiple threads
    }
    
	// synchronized method to retrieve value of count variable
    public synchronized int getCount() {
        return count;
    }
	
}
