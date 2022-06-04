package com.sb.multithreading;

public class Test16_ThreadGroup {

	public static void main(String[] args) {
		Thread th = new Thread();
		System.out.println(th.getThreadGroup());
		System.out.println(th.getThreadGroup().getName());
		System.out.println();
		
		System.out.println("Changing gourp name\n");
		
		ThreadGroup tg = new ThreadGroup("GourpA");
		Thread th1 = new Thread(tg, "child1");
		System.out.println(th1.getThreadGroup());
		System.out.println(th1.getThreadGroup().getName());
		System.out.println();
		
		System.out.println(th1.getName());
		System.out.println(th1.currentThread().getName());
		System.out.println(th1.getThreadGroup().getName());
		System.out.println();
		
		System.out.println(th.getName());
		System.out.println(th.currentThread().getName());
		System.out.println(th.getThreadGroup().getName());
		System.out.println();
		
		Thread th2 = Thread.currentThread();
		System.out.println(th2.getName());
		System.out.println(th2.currentThread().getName());
		System.out.println(th2.getThreadGroup().getName());
		System.out.println();
	}

}
