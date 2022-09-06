package com.sonata.four;

public class ParameterLambda {
	public static void main(String[] args) {
		CalTor c2 = (i1,i2) ->{return i1 - i2;};
		CalTor c3 = (i1,i2)->{
			if(i2<i1) {
				throw new RuntimeException("message");}
			else {return i2 - i1;}
		};
		
			
			
		
		System.out.println(c2.substract(20, 10));
		System.out.println(c3.substract(20, 30));
		
		
		
		
		}

	private static void less(int i) {
		// TODO Auto-generated method stub
		
	}
			}
		
	


