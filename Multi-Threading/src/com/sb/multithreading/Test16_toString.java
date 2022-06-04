package com.sb.multithreading;

public class Test16_toString {

	public static void main(String[] args) {
		Thread th = new Thread();
		System.out.println(th);
		
		Thread th2 = new Thread("child2");
		System.out.println(th2);
		
		Thread th3 = Thread.currentThread();
		System.out.println(th3);
		
		th3.setPriority(8);
		System.out.println(th3);

	}

}
