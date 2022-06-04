package com.sb.multithreading;

class MyThread7 extends Thread{
	@Override
	public void run() {
		System.out.println("In run after start call : "+ getState() + " " +  isAlive());
		try {Thread.sleep(3000);}
		catch(InterruptedException e) {}
	}
}

public class Test12_isAlive {

	public static void main(String[] args) throws InterruptedException{
		MyThread7 mt = new MyThread7();
		System.out.println("In main after object creation : " + mt.getState() + " " + mt.isAlive());
		
		mt.start();
		System.out.println("In main After start call : " + mt.getState() + " " + mt.isAlive());
		
		Thread.sleep(2000);
		System.out.println("In main after start call : " + mt.getState() + " " + mt.isAlive());
		
		Thread.sleep(2000);
		System.out.println("In main after start call : " + mt.getState() + " " + mt.isAlive());
		

	}

}
