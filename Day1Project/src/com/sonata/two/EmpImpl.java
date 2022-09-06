package com.sonata.two;

public class EmpImpl extends Employee implements EmpIntf{
int salary = 1000;

	@Override
	public double skillBonus(int subjectUpgraded) {
		switch(subjectUpgraded) {
		case 1: subjectUpgraded= (int) (salary +(salary * 0.1));
		break;
		case 2: subjectUpgraded= (int) (salary +(salary * 0.2));
		break;
		case 3: subjectUpgraded= (int) (salary +(salary * 0.3));
		break;
		default : System.out.println("no more skill");
		
		}
		
		
		return subjectUpgraded;
	}

	@Override
	public void salcal() {
		// TODO Auto-generated method stub
		
	}
public static void main(String args[]) {
	EmpImpl e =new EmpImpl();
	//e.salary(2000);
	System.out.println("salary \t"+e.skillBonus(2));
}

}
