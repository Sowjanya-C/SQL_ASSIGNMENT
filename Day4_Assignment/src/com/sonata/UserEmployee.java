package com.sonata;

public class UserEmployee extends Employee {

public static void main(String args[]) {

Employee e1= new Employee();
e1.setEid(111);
e1.setEname("Sowjanya");
e1.setEsal(20000);




EmployeeImpl l1= new EmployeeImpl();
// l1.addEmployee(e1);
//l1.addEmployee(e2);
l1.setEid(112);
l1.setEname("John");
l1.setEsal(1000);

System.out.println(l1);

System.out.println("calculated salary : "+ l1.yearSalary(l1));
System.out.println("incremented salary : " +l1.appSalary(l1));


System.out.println(e1);






}

}