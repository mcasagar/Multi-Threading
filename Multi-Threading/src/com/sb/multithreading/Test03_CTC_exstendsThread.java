package com.sb.multithreading;

// Step 1 : Create a class deriving from Thread class
// Step 2 : Override run() method and add logic you want to execute in custom thread 
// Step 3 : Create sub class obj and call start() by using this subclass obj

class MyThread extends Thread{									// step 1
	@Override
	public void run() {															// step 2
		System.out.println("run");
	}
}
public class Test03_CTC_exstendsThread {
	public static void main(String[] args) {
		MyThread mt = new MyThread();							// step 3
		mt.start();
		
		System.out.println("main");
	}
}
