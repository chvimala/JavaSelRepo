package coreJava.exceptions;

public class Calc1 {
	
	public void div(int a, int b) throws ArithmeticException {
		
		if(b==0) {
			throw new ArithmeticException("With 0 we cannot divide any value");
		}else {
		System.out.println(a/b);
		}
	}

}
