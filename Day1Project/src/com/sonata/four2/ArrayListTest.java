package com.sonata.four2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayListTest {
	
	@Test
	public void testAdd() {
	ArrayList arrobj1 = new ArrayList();

	arrobj1.add(1);
	arrobj1.add(2);
	arrobj1.add(3);
	arrobj1.add(4);
	arrobj1.add(5);
	arrobj1.add(6);
	int size=arrobj1.getSize();
	System.out.println(size);
	assertEquals(6,size);
	

}
}