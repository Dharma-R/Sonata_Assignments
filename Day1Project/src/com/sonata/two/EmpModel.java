package com.sonata.two;

public class EmpModel {
	private int empID;
	private String empName;
	private double empSal;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "EmpModel [empID=" + empID + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	
	
	


}
