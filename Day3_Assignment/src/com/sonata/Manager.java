package com.sonata;

public class Manager extends Employee {
	
	@Override
	public double salCal() {
		return empSal+(empSal*0.2);
	}

	public static void main(String[] args) {
		Manager m1 = new Manager();
		m1.empId = 201;
		m1.empName = "Sowjanya";
		m1.empSal = 50000;
		m1.display();
		System.out.println("Total Salary = "+m1.salCal());
	}

}
