package com.basics;
class StudentInfo{
	
	@Override
	public String toString() {
		return "StudentInfo [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	int studentId;
	String studentName;
	StudentInfo(int id,String name){
		studentId=id;
		studentName=name;
	}
	
	
}

public class Constructor_III {

	public static void main(String[] args) {
		StudentInfo s1=new StudentInfo(101,"Harsh");
		StudentInfo s2=new StudentInfo(102,"raksh");
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
