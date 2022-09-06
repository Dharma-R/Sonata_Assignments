package com.example.day1;


public class Student {
	int Studentid;
	String StudentName;
	char Studentclass;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.StudentName="Dharma";
		s1.Studentid=14;
		s1.Studentclass='A';
		
		Student s2 = new Student();
		s2.StudentName="Anirudh";
		s2.Studentid=10;
		s2.Studentclass='B';
		
		System.out.println(s1.StudentName+" "+s1.Studentid+" "+s1.Studentclass);
		System.out.println(s2.StudentName+" "+s2.Studentid+" "+s2.Studentclass);
	}

}
