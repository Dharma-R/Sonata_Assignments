package com.sonata.two3;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.sonata.Impl.EmpImpl;




public class SalTest {


@Test
public void Saltest() {
	Employee e3 = new Employee();
	EmpImpl e4=new EmpImpl();
	e3.setEmpSal(100);
	
	Assertions.assertEquals(1200,e4.yearlySal(e3));
}
@Test
public void Saltest1() {
	Employee e3 = new Employee();
	EmpImpl e4=new EmpImpl();
	e3.setEmpSal(100);
	
	Assertions.assertEquals(1000,e4.yearlySal(e3));


}
}