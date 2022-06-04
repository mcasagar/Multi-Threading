package com.sb.multithreadmodelprogramapplication;

public class Test10_MultiThreadModelApplication extends Thread {

	static PrintNumbers pn = new PrintNumbers();
	
	public void run() {
		pn.print50To1();
	}
	
	public static void main(String[] args) {
		Test10_MultiThreadModelApplication mt = new Test10_MultiThreadModelApplication();
		mt.start();
		
		long time1, time2;
		time1 = System.currentTimeMillis();
		
		pn.print50To1();
		
		time2 = System.currentTimeMillis();
		System.out.println("\tTime Taken : " + (time2 - time1)/1000 + "sec");
	}

}
