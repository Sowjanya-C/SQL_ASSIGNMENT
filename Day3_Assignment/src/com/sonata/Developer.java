package com.sonata;

public class Developer extends Employee {
	
	@Override
	public double salCal() {
		return empSal+(empSal*0.1);
	}

	public static void main(String[] args) {
		Developer d1 = new Developer();
		d1.empId = 301;
		d1.empName = "Rachna";
		d1.empSal = 40000;
		d1.display();
		System.out.println("Total Salary = "+d1.salCal());

	}

}
