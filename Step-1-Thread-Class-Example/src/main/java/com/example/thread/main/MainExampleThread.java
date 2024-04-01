package com.example.thread.main;

import com.example.thread.ThreadClass.MyThread;

public class MainExampleThread {

	public static void main(String[] args) {
        
		
		
		  // Input strings
        String inputString1 = "Hello, World!";
        String inputString2 = "Java is amazing!";

        // Step 4 - Create instances of MyThread with the input strings
        
		MyThread t1 = new MyThread(inputString1);
		MyThread t2 = new MyThread(inputString2);
       
		
		// Step 5 - Start the Threads
		
		t1.start();
		t2.start();

      
       
    }
	
	
	
}
