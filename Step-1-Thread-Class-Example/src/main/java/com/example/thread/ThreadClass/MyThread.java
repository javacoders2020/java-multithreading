package com.example.thread.ThreadClass;

import com.example.thread.util.CharacterCountUtil;

//Step 2 : Extend the Thread Class

public class MyThread extends Thread {
	 
	// String to count characters
    private String inputString;

    // Constructor to initialize inputString
    public MyThread(String inputString) {
        this.inputString = inputString;
    }
    
    
  //Step 3 : Override the run method
    
    public void run() {
        try {
        
             // Print a message to the console indicating which thread is running
            System.out.println("Thread " + Thread.currentThread().getName() + " is running");

            // Call the characterCountTask() method from CharacterCountUtil to count characters
            int characterCount = CharacterCountUtil.characterCountTask(inputString);
           
            System.out.println("Number of characters in the string: " + characterCount);
        
        } catch (Exception e) {
            
        	// Catch any exceptions thrown in the thread
            System.out.println("An error occurred");
        }
    }
 
}