package com.sb.multithreading;

class BankAccount {
	private long accNum;
	private String accHName;
	private double balance;
	
	public BankAccount(long accNum, String accHName, double balance) {
		this.accNum = accNum;
		this.accHName = accHName;
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposite(double amt) {
		this.balance = this.balance + amt;
	}
	
	public void withdraw(double amt) {
		this.balance = this.balance- amt;
	}
	
	public void currentBalance() {
		System.out.println(balance);
	}

}

class DepositerThread extends Thread {
	private BankAccount acc;
	private double amt;
	
	public DepositerThread(BankAccount acc, double amt) {
		this.acc = acc; 
		this.amt = amt;
	}
	@Override
	public void run() {
		acc.deposite(amt);
		System.out.println(acc + "acc balance : " + acc.getBalance());
	}
}

class WithDraweeThread extends Thread{
	private BankAccount acc;
	private double amt;
	
	public WithDraweeThread(BankAccount acc, double amt) {
		this.acc = acc;
		this.amt = amt;
	}
	
	@Override
	public void run() {
		acc.withdraw(amt);
		System.out.println(acc + " acc balance after with : " + acc.getBalance()); 
	}
}

public class Bank {
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount(1111, "Sagar", 80000);
		BankAccount acc2 = new BankAccount(1112, "Rucha", 70000);
		BankAccount acc3 = new BankAccount(1113, "Mrunal", 60000);
		
		System.out.println(acc1 + "acc balance " + acc1.getBalance());
		System.out.println(acc2 + "acc balance " + acc2.getBalance());
		System.out.println(acc3 + "acc balance " + acc3.getBalance());
		
		DepositerThread dt1 = new DepositerThread(acc1, 5000);
		WithDraweeThread wt1 = new WithDraweeThread(acc2, 500);
		
		DepositerThread dt2 = new DepositerThread(acc2, 4000);
		DepositerThread dt3 = new DepositerThread(acc3, 3000);
		
		dt1.start();
		wt1.start();
		
		dt2.start();
		dt3.start();
		System.out.println("main");
	}
}
