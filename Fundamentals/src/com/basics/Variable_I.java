package com.basics;
class Student{
	int studentId=101;//instance variable
 
	@Override
	public String toString() {
		return ""+ studentId;
	}
}

public class Variable_I {

	public static void main(String[] args) {
		Student s = new Student();//creating an object of type student
		Student s2 = new Student();
		System.out.println(s);
		System.out.println(s.studentId);
		System.out.println(s2.studentId);
		System.out.println("_______________________________");
		System.out.println("after modification");
		s.studentId=500;
		System.out.println(s.studentId);
		System.out.println(s2.studentId);

	}

}
