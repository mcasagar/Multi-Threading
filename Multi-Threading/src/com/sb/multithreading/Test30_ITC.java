// Inter Thread Communication 
package com.sb.multithreading;

class Factory{
	private int items;
	private boolean itemsAvailable;
	
	public synchronized void produce(int items) {
		if(itemsAvailable) 
			try {
				wait();
			}
			catch(InterruptedException e) {		
			}
		
		this.items = items;
		this.itemsAvailable = true;
		System.out.println("Produced items   : " + items);
		
		notify();		
	}
	
	public synchronized void consume(int items) {
		if(!itemsAvailable)
			try {
				wait();
			}catch(InterruptedException e) {}
		this.items = items;
		this.itemsAvailable = false;
		
		System.out.println("Consumed Items : " + items);
		
		notify();
	}
}

class Producer implements Runnable{
	private Factory factory;
	
	public Producer(Factory factory) {
		this.factory = factory;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			factory.produce(i);
		}
	}
}

class Consumer implements Runnable{
	private Factory factory;
	public Consumer(Factory factory) {
		this.factory = factory;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			factory.consume(i);
		}
	}
}

public class Test30_ITC {

	public static void main(String[] args) {
		Factory bajaj = new Factory();
		
		Producer prod = new Producer(bajaj);
		Consumer cons = new Consumer(bajaj);
		
		new Thread(prod).start();	
		new Thread(cons).start();
	}
}
