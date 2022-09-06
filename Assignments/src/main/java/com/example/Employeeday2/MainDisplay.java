package com.example.Employeeday2;

public class MainDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Manager m1 = new Manager();
			m1.empId=200;
			m1.empName="Dharma";
			m1.empSal=40000;
			m1.salCal();
			
			Developer d1 = new Developer();
			d1.empId=600;
			d1.empName="Raj";
			d1.empSal=25000;
			d1.salCal();
			
			Tester t1 = new Tester();
			t1.empId=800;
			t1.empName="Anirudh";
			t1.empSal=20000;
			t1.salCal();
	}

}
