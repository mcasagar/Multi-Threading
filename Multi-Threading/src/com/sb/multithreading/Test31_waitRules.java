package com.sb.multithreading;

class Example2{
	synchronized void m1() throws InterruptedException{
		wait(5000);
	}
}
public class Test31_waitRules {

	public static void main(String[] args)throws InterruptedException {
		System.out.println("main start");
		Example2 e1 = new Example2();
		e1.m1();
		System.out.println("main end");

	}

}
