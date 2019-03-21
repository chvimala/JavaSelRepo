package coreJava.exceptions;

public class Calc2 extends Calc1{

	public static void main(String[] args) {
		
		Calc2 calc2obj = new Calc2();
		try {
			calc2obj.div(2, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
