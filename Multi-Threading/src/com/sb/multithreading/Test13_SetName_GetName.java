package com.sb.multithreading;

class MyThread8 extends Thread{
	MyThread8(){
		super();
	}
	
	MyThread8(String name){
		super(name);
	}
	
	public void run() {
		for(int i = 1; i<=10; i++)
			System.out.println(getName() + " run " + i);
	}
	
}

public class Test13_SetName_GetName {

	public static void main(String[] args) {
		MyThread8 mt1 = new MyThread8();
		MyThread8 mt2 = new MyThread8("child2");
		
		System.out.println("mt1 name : " + mt1.getName());
		System.out.println("mt1 priority : " + mt1.getPriority());
		System.out.println("mt2 name : " + mt2.getName() );
		System.out.println("mt2 priority : " + mt2.getPriority());
		
		mt1.setName("child1");
		
		mt1.setPriority(6);
		mt2.setPriority(9);
		
		System.out.println();
		
		System.out.println("mt1 name : " + mt1.getName());
		System.out.println("mt1 priority : " + mt1.getPriority());
		System.out.println("mt2 name : " + mt2.getName());
		System.out.println("mt2 priority : " + mt2.getPriority());
		
		mt1.start();
		mt2.start();
		
		System.out.println();
		
		System.out.println("main end"); 
			
	}

}
