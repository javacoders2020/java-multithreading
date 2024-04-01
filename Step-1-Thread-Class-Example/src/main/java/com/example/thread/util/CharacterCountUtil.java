package com.example.thread.util;

public class CharacterCountUtil {

	// Step-1: Identify the task that you want the thread to perform   
	// Task --> Method to count characters in a string
    public static int characterCountTask(String inputString) {
        return inputString.length();
    }
	
}
