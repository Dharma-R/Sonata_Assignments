package com.example.Employeeday2;

public class UsingPeople {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Technicalengineer t1 = new 	Technicalengineer();
	 	t1.empId=001;
	 	t1.basicPay=50000;
	 	t1.empName="Dharma";
	 	t1.techSkill="Java";
	 	t1.availableLeaves = 20;
	  	Address techAddres = new Address(1,"chikkabanavara",560090,"Bangalore"); 
	 	t1.a1= techAddres;
		System.out.println(t1);	
	 	
		
		Staff s1 = new Staff();
	 	s1.empId = 501;
	 	s1.empName="Anirudh";
	 	s1.position="Sanitary staff";
	 	s1.availableLeaves= 10;
	 	s1.basicPay = 12500;
	 	Address staff1 = new Address(12,"Arkalgud",573102,"Hassan");
	    s1.a1  = staff1; 
	 	System.out.println(s1);
	}
}

