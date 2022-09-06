package com.sonata.four2;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class BookServiceLambdaTest {

@Test
public void testAdd() {
BookServiceLambda obj1=new BookServiceLambda();
obj1.add(1);
obj1.add(2);
obj1.add(3);
obj1.add(4);
obj1.add(5);
obj1.add(6);

int size=obj1.getSize();
System.out.println(size);
assertEquals(0,size);
            
      }

}