package coreJava.toString;

public class Student {

	int rollno;  
	String name;  
	String city;  

	Student(int rollno, String name, String city){  
		this.rollno=rollno;  
		this.name=name;  
		this.city=city;  
	} 

	public String toString() {		
		return rollno+" , "+name+" , "+city;

	}

	//	public void setStudentData(int rollno, String name, String city) {
	//		this.rollno=rollno;  
	//		this.name=name;  
	//		this.city=city;  
	//	}

	public static void main(String args[]){  
		// if we dont use constructor the belwo two line of code we have to write and above setStudentData method is required	
		//		Student s1=new Student();
		//		s1.setStudentData(101,"Raj","lucknow");

		Student s1=new Student(101,"Raj","lucknow");  		
		Student s2=new Student(102,"Vijay","ghaziabad");

		System.out.println(s1);//compiler writes here s1.toString()  
		System.out.println(s2);//compiler writes here s2.toString()  
	}  
}  