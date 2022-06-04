
// this program is show you that the JVN not waiting for daemon thread once
//all non daemon thread execution is completed then it will terminated

package com.sb.multithreading;

class MyThread12 extends Thread{
	public void run() {
		for(int i = 1; i <= 10; i++)
			System.out.println(i);
	}
}

public class Test17_isDaemon {

	public static void main(String[] args) {
		System.out.println("main start");
		MyThread12 th = new MyThread12();
		th.setDaemon(true);
		th.start();
		
		System.out.println("main end");

	}

}
