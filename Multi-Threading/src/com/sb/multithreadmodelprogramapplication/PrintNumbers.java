package com.sb.multithreadmodelprogramapplication;

public class PrintNumbers {
	void print1To50() {
		for(int i = 1; i<=50; i++) {
			System.out.println(i + "\t");
			try{Thread.sleep(100);}
			catch(InterruptedException e) {}
		}
	}
	
	void print50To1() {
		for(int j = 50; j >= 1;  j--) {
			System.out.println(j + "\t");
			try {Thread.sleep(100);}
			catch(InterruptedException e) {}			
		}
	}
}
