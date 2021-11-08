package com.sonata;

public class Staff extends Employee1 {
	String title;
	
	public Staff(int empId, String empName, String title, double basicPay) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.title = title;
		this.basicPay = basicPay;
	}
	
	@Override
	public double calculateSalary() {
		return basicPay+(basicPay*0.18);
	}
	
	public String toString() {
		return "Staff [empId=" + empId + ", empName=" + empName + "]";
	}

	public static void main(String[] args) {
		Staff s1 = new Staff(102, "John", "Security", 15000);
		System.out.println(s1);
		System.out.println("Title : "+s1.title);
		System.out.println("Total Salary = "+s1.calculateSalary());

	}

}
