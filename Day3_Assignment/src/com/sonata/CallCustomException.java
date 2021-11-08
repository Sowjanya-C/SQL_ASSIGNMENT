package com.sonata;

public class CallCustomException {

	public static void main(String[] args) throws MyOwnException {
		double salary = 5000;
		double annualSal = salary*12;
		if(annualSal<100000)
			throw new MyOwnException("Salary is less than 100000");
		else
			System.out.println("Accepted");

	}

}
