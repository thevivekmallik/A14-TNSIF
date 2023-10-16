package org.cec.multithreading.synchronization.interthreadcommunication;

import java.util.ArrayList;

public class InterThreadCommunicationDemo {

	public static void main(String[] args) {
		Q obj=new Q();
		
		Producer p1=new Producer(obj); //Producer thread
		Consumer c1=new Consumer(obj); //Consumer thread
					
		try {
			//p1.join();
			c1.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		
		
	}

}
