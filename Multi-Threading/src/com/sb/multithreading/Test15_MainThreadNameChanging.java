package com.sb.multithreading;

public class Test15_MainThreadNameChanging {
	static {
		System.out.println("SB is runnig in " + Thread.currentThread().getName() + " thread");
	}
	public static void main(String[] args) {
		Thread th = Thread.currentThread();
		
		System.out.println("\nmain thread details :- ");
		System.out.println("Name : " + th.getName());
		System.out.println("Priority : " + th.getPriority());
		
		System.out.println();
		System.out.println("Now we are changing main thread name and priority\n");
		
		
		th.setName("My Cute main Thread ");
		th.setPriority(9);
		
		System.out.println("new main thread name is     : " + th.getName());
		System.out.println("new main thread priority is : " + th.getPriority());
		
		
		

	}

}
