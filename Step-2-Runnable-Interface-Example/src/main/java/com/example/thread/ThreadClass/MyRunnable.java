package com.example.thread.ThreadClass;

import com.example.thread.util.CharacterCountUtil;


// Step 2 : Implement the runnable interface
// By implementing runnable interface we are creating task or unit of work that can be executed concurrently
public class MyRunnable implements Runnable {
   
	// String to count characters
    private String inputString;

    // Constructor to initialize inputString
    public MyRunnable(String inputString) {
        this.inputString = inputString;
    }

  //Step 3 : Override the run() method
    
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