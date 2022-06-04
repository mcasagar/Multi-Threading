package com.sb.multithreading;

class MyThread3 extends Thread{
	@Override
	public void run() {
		System.out.println("tun start");
		System.out.println("After start call in run  :  " + this.getState());
		System.out.println("run paused");
		try {Thread.sleep(1000);}
		catch(InterruptedException e) {}
		System.out.println("run resume  ");
		System.out.println("run end");
	}
}

public class Test11_getState {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread3 mt = new MyThread3();
		System.out.println("After mt object creation in main : " + mt.getState());
		
//		if(mt.getState().equals(Thread.State.NEW))
//			System.out.println("Hi");
//		else
//			System.out.println("Hello");
//		
		mt.start();
		System.out.println("After start call in main : " + mt.getState());
		
		Thread.sleep(100);
		System.out.println("After start call in main " + mt.getState());
		
		Thread.sleep(1000);
		System.out.println("After sleep call in main : " + mt.getState());
		
		

	}

}
