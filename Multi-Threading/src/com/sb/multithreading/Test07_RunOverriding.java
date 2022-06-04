package com.sb.multithreading;

class MyThread4 extends Thread{
	
}

//class MyRunnable implements Runnable{}
class MyThread5 extends Thread implements Runnable{ }

class MyThread6 extends Thread{
	public void run() {
		System.out.println("run no-param");
	}
	public void run(String s) {
		System.out.println("run String - Param");
	}
}

public class Test07_RunOverriding {

	public static void main(String[] args) {
		MyThread4 mt4 = new MyThread4();
		mt4.start();

	}

}
