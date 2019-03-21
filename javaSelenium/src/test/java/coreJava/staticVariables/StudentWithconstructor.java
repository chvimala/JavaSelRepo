package coreJava.staticVariables;
public class StudentWithconstructor {
	
	String name;
	static String college="GKRVM";
	
	
	StudentWithconstructor(String name){
		this.name=name;
	}
//	
//	public void setName(String name){
//		name1=name;
//	}
	
	public void studentData(){
		System.out.println(name);
		System.out.println(college);
	}
	


	public static void main(String[] args) {
		
		StudentWithconstructor rama=new StudentWithconstructor("Rama");
//		rama.setName("Rama");
		
	
		
	}

}
