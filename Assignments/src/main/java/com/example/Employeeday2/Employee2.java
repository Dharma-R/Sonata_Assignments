package com.example.Employeeday2;

public abstract class Employee2 {

	int empId;
	String empName;
    Address a1 = new Address();
	double basicPay;
	int availableLeaves;
	
	public abstract double calSal();
}
