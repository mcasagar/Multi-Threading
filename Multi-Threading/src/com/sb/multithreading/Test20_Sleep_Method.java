package com.sb.multithreading;

class MyThread14 extends Thread{
	public void run () {
		System.out.println("run start");
		System.out.println("run end");		
	}
}

public class Test20_Sleep_Method {
	public static void main(String[] args)throws InterruptedException {
		System.out.println("main start");
		MyThread14 th = new MyThread14();
		th.start();
		
		Thread.sleep(5000);
		
		System.out.println("main end");

	}
}
