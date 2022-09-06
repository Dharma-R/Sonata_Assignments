package com.sonata.two;

public class Simpleexample {
	
private int add(int a , int b) {
	return a+b;
}

 int sub(int a , int b) {
	return b-a;
}

protected int mul(int a, int b) {
	return a*b;
}

public int div(int a , int b) {
	return a/b;
}
public static void main(String[] args) {
	Simpleexample s1= new Simpleexample();
	System.out.println(s1.add(2,3));
	System.out.println(s1.sub(6,5));
	System.out.println(s1.mul(3, 4));
	System.out.println(s1.div(10, 2));
			
	
}
}
		
	

