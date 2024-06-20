package com.example.multithreading.counter;

public class Counter {

	// Instance variable candidate for race condition as it will be updated by multiple threads
	 private  int count = 0;

	 
	public void increment() {
    	   
		// Print a message to the console indicating which thread is running
      System.out.println("Thread " + Thread.currentThread().getName() + " is running");
      
      
     synchronized(this) {	 // synchronized  block to increment the value of count variable.
     
    	 count++;         // critical section  of code updated by multiple threads
      
     }  // End of synchronized block
      
      }
    
	
    public  int getCount() {
    	
    	
    	synchronized(this) {	// synchronized block to retrieve value of count variable
    	
    		return count;     // critical section  of code read by multiple threads
    	 
    	} // End of synchronized block 
    	
    }
	
}

// synchronized(this) means  the current instance of the class