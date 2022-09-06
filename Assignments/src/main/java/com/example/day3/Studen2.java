package com.example.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Studen2 {
	public static void main(String args[]) {
	List<Student> stu = new ArrayList<>();
	stu.add(new Student(10,"Dharma",500));
	stu.add(new Student(11,"Anirudh",400));
	stu.add(new Student(12,"Balasurya",600));
	stu.add(new Student(13,"Gurukiran",550));
	
	System.out.println("Befotre sorting");
	stu.forEach(Student->System.out.println(Student));
	System.out.println();
	
	/* Tarditional Method*/
	/*Collections.sort(stu,new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
		
	});*/
	
	
	Collections.sort(stu,(s1,s2)->s1.getName().compareTo(s2.getName()));
	System.out.println("Sorting based on name");
	stu.forEach(System.out::println);
	System.out.println();
	
	
	stu.sort(Comparator.comparing( Student::getMarks,Comparator.reverseOrder()));
	System.out.println("After sorting based on marks in desc order");
	stu.forEach(System.out::println);
}
}
