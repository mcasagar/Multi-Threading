package com.sb.multithreading;

class MyThread10 extends Thread{
	@Override
	public void run(){
		System.out.println("run Executed");
	}
	
	@Override
	public void start() {
		System.out.println("run overriden start");
		super.start();
	}
}

public class Test08_StartOverriding {

	public static void main(String[] args) {
	
		MyThread10 mt10 = new MyThread10();
		mt10.start();
		System.out.println("run main");
	}

}
