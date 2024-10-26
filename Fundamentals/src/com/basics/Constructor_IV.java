package com.basics;
import java.util.Scanner;

class EmployeInfo{
	int empId;
	String empName;
	String empDept;
	String empComp;
  EmployeInfo(int id, String name ,String dept ,String comp){
		  empId=id;
		  empName=name;
		  empDept=dept;
		  empComp=comp;
		 
}
@Override
public String toString() {
	return "EmployeInfo [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empComp=" + empComp
			+ "]";
}

	 
 }

public class Constructor_IV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the employee id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the employee name");
		String name=sc.nextLine();
		System.out.println("enter the employee dept");
		String dept=sc.nextLine();
		System.out.println("enter the employee company");
		String comp=sc.nextLine();
		EmployeInfo d1= new EmployeInfo(id,name,dept,comp);
		System.out.println(d1);
		
		
		
		
		

	}

}
