package com.sb.multithreading;

// Approach 1: extending from Thread class 
class MyThread17 extends Thread{
	@Override
	public void run() {
		System.out.println("run is execute from Outer Class extends Thread");
	}
}

//Approach 2: implementing from Runnable interface
class MyRunnable1 implements Runnable{
	@Override
	public void run() {
		System.out.println("run method is executes from Outer Class implements from runnable interface");
	}
}

public class Test32_AIC_CT {

	public static void main(String[] args) {
		MyThread17 mt = new MyThread17();
		mt.start();
		
		Thread th = new Thread(new MyRunnable1());
		th.start();

		// Approach 3: AIC extending from Thread class
		Thread th2 = new Thread() {
			@Override
			public void run() {
				System.out.println("run is executed from AIC extends Thread");
			}
		};
		th2.start();
		
		// Approach 4: AIC implements from runnable interface
		new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println("run is execute from AIC implements Runnable");
				}
			}
		).start();
		
		// Approach 5: Lambda Expression implements Runnable Interface
		new Thread( ()->System.out.println("run is executes from LE implements Runnable")
		).start();
		
		// Approach 6: Method Reference 
		new Thread(A::m1).start();						//static method reference
		new Thread(new A()::m2).start();		   //non static reference
		new Thread(A::new).start();					// constructor reference
		
	}

}

class A{
	static void m1() {
		System.out.println("Run is executed with static method reference");
	}
	void m2() {
		System.out.println("run is executed with non-static method reference");
	}
	A(){
		System.out.println("run is executed with constructor reference");
	}
}
