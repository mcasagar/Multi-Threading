package com.sb.multithreading;

class MyThread16 extends Thread{
	public void run() {
		System.out.println("run start");
		
		try {Thread.sleep(5000);}
		catch(InterruptedException e) {
			System.out.println("IE raised in run");
		}
		
		System.out.println("run end");
	}
}

public class Test25_Interrupted_Method {

	public static void main(String[] args)throws InterruptedException {
		System.out.println("main start");
		MyThread16 mt = new MyThread16();
		mt.start();
		
		mt.sleep(2000);
		mt.interrupt();
		
		System.out.println("main end");

	}

}
