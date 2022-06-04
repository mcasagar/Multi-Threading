package com.sb.multithreading;

//Develop a multithreading program to execute two task concurrently
//Task 1 :  Display 1 to 20 numbers
//Task 2 : Display 20 to 1 numbers

class MyThread2 extends Thread{
	@Override
	public void run() {
		for(int i=1; i<=20; i++)
			System.out.println("run "+i);
	}
}

public class Test05_Assignment {

	public static void main(String[] args) {
			MyThread2 th = new MyThread2();
			th.start();
			
			for(int j=20; j>=1; j--) 
				System.out.println("main "+j);

	}

}
