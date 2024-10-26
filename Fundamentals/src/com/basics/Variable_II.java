package com.basics;
class Vehicle{
	static String companyName= "TataMotors";
}
public class Variable_II {

	public static void main(String[] args) {
		// ClassName.varName
		System.out.println(Vehicle.companyName);
		Vehicle v1= new Vehicle();
		Vehicle v2= new Vehicle();
		System.out.println(v1.companyName);
		System.out.println(v2.companyName);
		
		System.out.println("_______________________________");
		System.out.println("after modification");
		
		v1.companyName="Mahindra group";
		
		System.out.println(v1.companyName);
		System.out.println(v2.companyName);
		
		

	}

}
