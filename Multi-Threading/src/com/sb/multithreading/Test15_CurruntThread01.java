package com.sb.multithreading;

class Example {
	static {
		Thread th = Thread.currentThread();
		System.out.println("Example static block is executed in : " + th.getName() + " Thread");
	}
	Example(){
		Thread th = Thread.currentThread();
		System.out.println("Ex Co Executed in : " + th.getName() + " Thread");
	}
	public static void m1() {
		Thread th = Thread.currentThread();
		System.out.println("Ex m1 Executed in : "+  th.getName() + " Thread");
	}
}

class MyThread9 extends Thread{
	public void run() {
		Example.m1();
	}
}

public class Test15_CurruntThread01 {

	public static void main(String[] args) {
		Example ex = new Example();
		
		MyThread9 mt = new MyThread9();
		mt.start();
		
		ex.m1();

	}

}
