package com.sonata.one;

public class Currentaccount extends bank {
	Currentaccount(){}
	Currentaccount (int a , String n , double b){
	super(a,n,b);
	}
	Currentaccount(int b,String s){}
	public static void main(String args[]) {

	Currentaccount c1 = new Currentaccount(234, "abc",0);
	c1.accNo = 124;
	c1.deposit(100);
	c1.withDraw(0);
	System.out.println(c1.deposit(100));
	System.out.println(c1.withDraw(0));
	
	

	}

}
