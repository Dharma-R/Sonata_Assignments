package com.example.Employeeday2;

public class Technicalengineer extends Employee2{
	String techSkill;
	
	public Technicalengineer(){
		
	}
	public Technicalengineer(String techSkill){
		this.techSkill = techSkill;
	}
	public double HRA() {
		return 0.12*this.basicPay;
	}
	@Override
	public double calSal() {
		// TODO Auto-generated method stub
		double Salary = this.basicPay+HRA();
		return Salary;
	}
	@Override
	public String toString() {
		return "Technicalengineer [techSkill=" + techSkill + ", empId=" + empId + ", empName=" + empName + ", a1=" + a1
				+ ", basicPay=" + basicPay + ", availableLeaves=" + availableLeaves + "]";
	}
	
	
}
