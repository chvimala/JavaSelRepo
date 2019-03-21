package coreJava.staticVariables;

public class StudentWithStatic {
	
	String name="Rama";
	public final static String college="GKRVM";
	
	
	StudentWithStatic(String name){
		this.name=name;
	}
	
	public void studentData(){
		System.out.println(name);
		System.out.println(college);
	}
	


	public static void main(String[] args) {
		
		
		StudentWithStatic ramaobj=new StudentWithStatic("Rama");
		ramaobj.studentData();
		StudentWithStatic dainaobj=new StudentWithStatic("Rama");
		dainaobj.studentData();	
	
	}

}
