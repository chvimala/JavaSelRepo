package coreJava.staticVariables;
public class Student1 {
	
	int rollNo;
	String name;
	final static String collegeName="GKRVM";
	
	Student1(int rollNo,String name){
		this.rollNo=rollNo;
		this.name=name;
	}

	public String toString() {		
		return rollNo+" , "+name+" , "+collegeName;

	}
	public static void main(String[] args) {
		
		Student1 s1 = new Student1(123, "Rama");
		Student1 s2 = new Student1(124, "Vimala");		
		
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
