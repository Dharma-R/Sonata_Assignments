package com.sonata.one;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class banktest {
	
	@Test
	public void batest() {
		bank c1 = new bank();
		Assertions.assertEquals(100,c1.deposit(100));
	}
	
	@Test
	public void baltest() {
		bank c1 = new bank();
		Assertions.assertEquals(100,c1.deposit(50));
	
	}
	@Test
	public void witest() {
		bank c1 = new bank();
		Assertions.assertEquals(200,c1.withDraw(0));
		
	}
	@Test
	public void wittest() {
		bank c1 = new bank();
		Assertions.assertEquals(-50,c1.withDraw(50));
		
	}
	
}
