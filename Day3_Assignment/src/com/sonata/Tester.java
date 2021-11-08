package com.sonata;

public class Tester extends Employee {
	
	@Override
	public double salCal() {
		return empSal+(empSal*0.15);
	}

	public static void main(String[] args) {
		Tester t1 = new Tester();
		t1.empId = 301;
		t1.empName = "Rachna";
		t1.empSal = 40000;
		t1.display();
		System.out.println("Total Salary = "+t1.salCal());

	}

}
