package com.example.multithreading.task;

import com.example.multithreading.counter.Counter;

public class CounterTask implements Runnable {

    //Counter Class reference
	private Counter counter;

    
	// CounterTask constructor accepting Counter Class Object
	public CounterTask(Counter counter) {
        this.counter = counter;
    }

    // Incrementing value of counter instance variable  
	// Each thread will increment counter value by 10000 by using increment method
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}
