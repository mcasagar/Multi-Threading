package com.sb.multithreadmodelprogramapplication;

public class Test09_SingeThreadModelApplication {

	public static void main(String[] args) {
		PrintNumbers pn = new PrintNumbers();
		long time1, time2;
		
		time1 = System.currentTimeMillis();
		
		pn.print1To50();
		pn.print50To1();
		
		time2 = System.currentTimeMillis();
		System.out.println("\nTime Taken " + (time2 - time1)/1000 + " sec");

	}

}
