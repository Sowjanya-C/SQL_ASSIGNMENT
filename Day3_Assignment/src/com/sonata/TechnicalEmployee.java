package com.sonata;

public class TechnicalEmployee extends Employee1 {
	
	String skill;
	
	TechnicalEmployee(){}
	
	public TechnicalEmployee(int empId, String empName, String skill, double basicPay) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.skill = skill;
		this.basicPay = basicPay;
	}
	
	 double calculateSalary() {
		return basicPay+(basicPay*0.12);
	}
	 
	 @Override
		public String toString() {
			return "TechnicalEmployee [empId=" + empId + ", empName=" + empName + "]";
		}

	public static void main(String[] args) {
	
		
		TechnicalEmployee t1 = new TechnicalEmployee(101, "Sowjanya", "Java", 20000);
		System.out.println(t1);
		System.out.println("Skill :"+t1.skill);
		System.out.println("Total Salary = "+t1.calculateSalary());

	}

}
