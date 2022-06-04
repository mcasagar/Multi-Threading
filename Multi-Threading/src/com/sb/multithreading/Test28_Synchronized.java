//Approach 1 : synchronized method
package com.sb.multithreading;

class Addition{
	private int x;
	private int y;
	
	public synchronized void add(int x, int y) {
		this.x = x;
		this.y = y;
		
		Thread th = Thread.currentThread();
		
		System.out.println(th.getName() + " : is paused");
		try {Thread.sleep(5000);}
		catch(InterruptedException e) {}
		System.out.println(th.getName() + " : is resumed");
		
		int res = this.x + this.y;
		System.out.println(th.getName() +" : Addition of " + this.x + " and " + this.y + " is : " + res);	
	}
}

class MyThread18 extends Thread{
	Addition a;
	public MyThread18(Addition a) {
		this.a = a;
	}
	public void run() {
		a.add(50, 60);
	}
}

class MyThread19 extends Thread{
	Addition a;
	public MyThread19(Addition a) {
		this.a = a;
	}
	public void run() {
		a.add(70, 80);
	}
}

public class Test28_Synchronized {

	public static void main(String[] args) {
		Addition a = new Addition();
		new MyThread18(a).start();
		new MyThread19(a).start();

	}

}
