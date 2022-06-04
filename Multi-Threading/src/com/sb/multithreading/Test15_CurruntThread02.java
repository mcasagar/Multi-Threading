package com.sb.multithreading;

class Example1 {
	void m1() {
		Thread th = Thread.currentThread();
		String name = th.getName();
		System.out.println("m1 is executed in " + name + " thread");
	}
}

class MyThread11 extends Thread{
	@Override
	public void run() {
		System.out.println("run start");
		Example1 e1 = new Example1();
		e1.m1();
		System.out.println("run end");
	}
}

public class Test15_CurruntThread02 {

	public static void main(String[] args) {
		System.out.println("main start");
		Example1 ex = new Example1();
		ex.m1();
		
		MyThread11 mt = new MyThread11();
		mt.start();
		
		System.out.println("main end");

	}

}
