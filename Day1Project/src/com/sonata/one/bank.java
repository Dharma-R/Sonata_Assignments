package com.sonata.one;

public class bank {
	int accNo;
	String accName;
	double balance;
	bank(){}
	bank(int a , String n, double b){
		this.accNo = a;
		this.accName = n;
		this.balance = b;
	}
	public double deposit(double amount) {
		double totalbalance = balance + amount;
			return totalbalance;
		
		}
	public double withDraw(double amount) {
		double totalbalance = balance - amount;
			return totalbalance;

	}
}


