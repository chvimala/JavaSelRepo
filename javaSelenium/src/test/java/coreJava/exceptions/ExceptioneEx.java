package coreJava.exceptions;

public class ExceptioneEx {

	public static void main(String[] args) {
		
		System.out.println("Hi");
		
		try {
			
			System.out.println(5/0);
			
		} 
		catch (NullPointerException e) {  // we have to add here ArithmeticException
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("HII");
	}

}
