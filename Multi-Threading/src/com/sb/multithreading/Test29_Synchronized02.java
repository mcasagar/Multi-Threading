//Approach 2 : using synchronized block (this code incompleted)

package com.sb.multithreading;

class Addition1{
	private int x;
	private int y;
	
	public void add(int x, int y) {
		synchronized(this) {
			this.x = x;
			this.y = y;
		}
		
		Thread th = Thread.currentThread();
		
		System.out.println(th.getName() + " : is paused");
		try {Thread.sleep(5000);}
		catch(InterruptedException e) {}
		System.out.println(th.getName() + " : is resumed");
		
		int res = this.x + this.y;
		System.out.println(th.getName() +" : Addition of " + this.x + " and " + this.y + " is : " + res);	
	}
}

class MyThread20 extends Thread{
	Addition1 a;
	public MyThread20(Addition1 a) {
		this.a = a;
	}
	public void run() {
		a.add(50, 60);
	}
}

class MyThread21 extends Thread{
	Addition1 a;
	public MyThread21(Addition1 a) {
		this.a = a;
	}
	public void run() {
		a.add(70, 80);
	}
}

public class Test29_Synchronized02 {

	public static void main(String[] args) {
		Addition1 a = new Addition1();
		new MyThread20(a).start();
		new MyThread21(a).start();

	}

}
