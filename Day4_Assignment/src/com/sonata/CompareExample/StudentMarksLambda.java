package com.sonata.CompareExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMarksLambda {
	

	public static void main(String[] args) {
		ArrayList<Student> s1 = new ArrayList<>();
		s1.add(new Student(101, "Swathi", 92));
		s1.add(new Student(102, "Smith", 70));
	    s1.add(new Student(103, "John", 75));
		s1.add(new Student(104, "Mary", 60));
		s1.add(new Student(105, "Sowjanya", 95));
		
		Collections.sort(s1);
		for(Student s:s1) {
			System.out.println(s.getStdId()+" "+s.getStdName()+" "+s.getMarks());
		}

	}

}
