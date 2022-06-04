//set daemon by implementing runnable interface and constructor for common login to all objects

package com.sb.multithreading;

class DaemonDemo1 implements Runnable{
	
	DaemonDemo1(){
		Thread th1 = new Thread(this);
		th1.start();
	}
	
	public void run() {
		Thread th = Thread.currentThread();
		for(int i = 1; i<=20; i++)
			System.out.println(th.getName() + " run " + i);
	}
}

public class Test18_setDaemon02 {

	public static void main(String[] args) {
		DaemonDemo1 dd = new DaemonDemo1();		
		DaemonDemo1 dd2 = new DaemonDemo1();
		
		

	}

}
