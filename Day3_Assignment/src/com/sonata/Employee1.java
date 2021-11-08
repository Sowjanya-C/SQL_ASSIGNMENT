package com.sonata;


    abstract class Employee1 {
	int empId;
	String empName;
	double basicPay;
	Address obj;
	int availableLeave;
	public int getEmpId() {
		return empId;
	}
	
	Employee1(){}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public Address getObj() {
		return obj;
	}

	public void setObj(Address obj) {
		this.obj = obj;
	}

	public int getAvailableLeave() {
		return availableLeave;
	}

	public void setAvailableLeave(int availableLeave) {
		this.availableLeave = availableLeave;
	}

	
	abstract double calculateSalary();

	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", empName=" + empName + ", basicPay=" + basicPay + ", obj=" + obj
				+ ", availableLeave=" + availableLeave + "]";
	}

}


