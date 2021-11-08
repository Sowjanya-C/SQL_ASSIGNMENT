package com.sonata;

public class UsingPeople extends Employee1 {

	public static void main(String[] args) {
		Address a1 = new Address();
		a1.setDoorNo(56);
		a1.setStreet("VV puram");
		a1.setCity("Bangalore");
		a1.setPin(560091);
		
		Employee1 e1 = new UsingPeople() ;
		e1.setEmpId(101);
		e1.setEmpName("Sowjanya");
		e1.setObj(a1);
		e1.setBasicPay(20000);
		e1.setAvailableLeave(2);
		System.out.println(e1);
		System.out.println();
		
		TechnicalEmployee t1 = new TechnicalEmployee(104, "Smith", "Java", 21000);
		System.out.println(t1);
		System.out.println("Total Salary = "+t1.calculateSalary());
		System.out.println();
		
		TechnicalEmployee t2 = new TechnicalEmployee(105, "Ravi", "C++", 20000);
		System.out.println(t2);
		System.out.println("Total Salary = "+t2.calculateSalary());
		System.out.println();
		
		Staff s1 = new Staff(106,"Mary","Security",15000);
		System.out.println(s1);
		System.out.println("Total Salary = "+s1.calculateSalary());
		System.out.println();
		
		Staff s2 = new Staff(107,"Joseph","House Keeping",3000);
		System.out.println(s2);
		System.out.println("Total Salary = "+s2.calculateSalary());
		System.out.println();

	}

	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

}
