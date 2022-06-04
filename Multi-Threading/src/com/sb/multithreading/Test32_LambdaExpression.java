package com.sb.multithreading;

public class Test32_LambdaExpression {

	public static void main(String[] args) {
		// via variable assignment approach
		Runnable r = ()->System.out.println("Hi");
		Thread th1 = new Thread(r);
		th1.start();
		
		//via directly argument approach
		Thread th2 = new Thread(()->System.out.println("Hello"));
		th2.start();
									//OR
		new Thread(()->System.out.println("OR Hello")).start();
	}

}
