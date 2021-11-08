package com.sonata;

public class Employee {
	int empId;
	String empName;
	double empSal;
	
	Employee(){}
	
	Employee(int id, String name, double sal){
		this.empId = id;
		this.empName = name;
		this.empSal = sal;		
	}
	
	public void display() {
		System.out.println("Employee ID = "+empId);
		System.out.println("Employee Name = "+empName);
		System.out.println("Basic Salary = "+empSal);
	}
	
	public double salCal() {
		return empSal+(empSal*0.05);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Sowjanya",25000);
		e1.display();
		System.out.println("Total Salary = "+e1.salCal());
	}

}