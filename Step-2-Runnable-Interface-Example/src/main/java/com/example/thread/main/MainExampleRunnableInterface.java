package com.example.thread.main;

import com.example.thread.ThreadClass.MyRunnable;

public class MainExampleRunnableInterface {

	public static void main(String[] args) {
		
		
	  // Input strings
      String inputString1 = "Hello, World!";
      String inputString2 = "Java is amazing!";
		
	    // Step 4 : Create Runnable instances or we can say runnable objects
        Runnable myTask1 = new MyRunnable(inputString1);
        Runnable myTask2 = new MyRunnable(inputString2);

        // Error in code below as start() method is not there MyRunnable or we can say runnable class objects
        //  myTask1.start();
        //  myTask2.start();
        
        
        
        // Step 5 : Create Thread instances or objects and pass the Runnable objects in it
        Thread myThread1 = new Thread(myTask1);
        Thread myThread2 = new Thread(myTask2);

        // Step 6 - Start the threads
        myThread1.start();
        myThread2.start();
    
	
	}
	
	
	
}
