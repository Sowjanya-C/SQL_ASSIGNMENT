package com.sonata;

public class Student {
	int stdID;
	String stdName;
	String stdClass;
	
	Student(){}
	
	Student(int id, String name, String cls){
		this.stdID = id;
		this.stdName = name;
		this.stdClass = cls;
	}
	public void display() {
		System.out.println(stdID);
		System.out.println(stdName);
		System.out.println(stdClass);
		System.out.println();
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.stdID = 101;
		s1.stdName = "Rachna";
		s1.stdClass = "10th";
        s1.display();
        
        Student s2 = new Student(102, "Mansa", "12th");
        s2.display();
	}

}
