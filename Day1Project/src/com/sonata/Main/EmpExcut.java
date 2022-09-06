package com.sonata.Main;

import com.sonata.Impl.*;
import com.sonata.two3.*;

public class EmpExcut {
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpID(123);
		e1.setEmpName("Dharma");
		e1.setEmpSal(100);
		EmpImpl e2 = new EmpImpl();
		System.out.println(e2.yearlySal(e1));
		System.out.println(e2.appSal(e1));
	}

}
