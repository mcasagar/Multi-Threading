package com.sb.multithreading;

// Step 1 : Creating class deriving from Runnable Interface
// Step 2 : implements run() method with the logic you want to execute in custom thread
// Step 3 : Create this sub class object
// Step 4 : Create Thread class object by passing this Runnable implementation class object and then 
//				 class start() method by using this thread class object  
class MyRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("run");
	}
}

public class Test04_CTC_implementsRunnable {
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		//mr.start()
		
		Thread th = new Thread(mr);
		th.start();
		System.out.println("main");		
	}
}
