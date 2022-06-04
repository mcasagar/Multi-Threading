package com.sb.multithreading;

class MyThread15 extends Thread{
	public void run() {
		System.out.println("run start");
		try {Thread.sleep(5000);}
		catch(InterruptedException e) {}
		System.out.println("run end");
	}
}

public class Test27_Join_Method {

	public static void main(String[] args)throws InterruptedException {
		System.out.println("main start");
		MyThread15 mt = new MyThread15();
		mt.start();
		
//		mt.join();
//		mt.join(3000);
		mt.join(7000);
		System.out.println("main end");

	}

}
