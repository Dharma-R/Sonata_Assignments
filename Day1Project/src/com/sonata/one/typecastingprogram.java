package com.sonata.one;
import java.util.ArrayList;


public class typecastingprogram {

	public static void main(String[] args) {
		 ArrayList<Integer> list = new ArrayList<>();

	     
	      list.add(5);
	      list.add(6);

	      System.out.println("ArrayList: " + list);

	      
	      int a = list.get(0);
	      System.out.println("Value at index 0: " + a); 

	}

}
