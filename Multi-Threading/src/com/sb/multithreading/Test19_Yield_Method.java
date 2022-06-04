package com.sb.multithreading;

class MyThread13 extends Thread{
	public void run () {
		System.out.println("run start");
		System.out.println("run end");		
	}
}

public class Test19_Yield_Method {

	public static void main(String[] args) {
		System.out.println("main start");
		MyThread13 th = new MyThread13();
		th.start();
		
		Thread.yield();
		
		System.out.println("main end");

	}

}
