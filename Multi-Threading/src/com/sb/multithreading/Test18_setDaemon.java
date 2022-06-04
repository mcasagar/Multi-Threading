//set daemon by implementing runnable interface

package com.sb.multithreading;

class DaemonDemo implements Runnable{
	public void run() {
		Thread th = Thread.currentThread();
		for(int i = 1; i<=20; i++)
			System.out.println(th.getName() + " run " + i);
	}
}

public class Test18_setDaemon {

	public static void main(String[] args) {
		DaemonDemo dd = new DaemonDemo();
		Thread th1 = new Thread(dd);
		th1.setDaemon(true);
		th1.start();
		
		
		DaemonDemo dd2 = new DaemonDemo();
		Thread th2 = new Thread(dd);
		th2.start();
		

	}

}
