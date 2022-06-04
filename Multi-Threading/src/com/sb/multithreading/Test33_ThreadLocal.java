package com.sb.multithreading;

public class Test33_ThreadLocal {

	public static void main(String[] args) {
		ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
		
		Thread th = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + " is started");
				
				threadLocal.set(5);
				
				try {sleep(3000);}
				catch(InterruptedException e) {}
				
				System.out.println(getName() + "value : " + threadLocal.get());
				
				try {sleep(8000);}
				catch(InterruptedException e) {}
				
				System.out.println(getName() + " value : " + threadLocal.get());
				System.out.println(getName() + " is End ");
			}
		};
		
		Thread th2 = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + " is started ");
				System.out.println(getName() + " value : " + threadLocal.get());
				
				try {sleep(2000);}
				catch(InterruptedException e) {}
				
				threadLocal.set(9);
				
				try {sleep(5000);}
				catch(InterruptedException e) {}
				
				System.out.println(getName() + " value : " + threadLocal.get());
				System.out.println(getName() + " is end ");
				
			}
		};
		
		th.start();
		th2.start();

	}

}
