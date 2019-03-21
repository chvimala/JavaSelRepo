package coreJava;
public class FactorialEx {

	public static void main(String[] args) {
		
		
		// 4!=4*3*2*1
		
		int n=4;
		int fact=1;
		

		for(int i=2;i<=n;i++) {
			
			fact=fact*i;
			
		}
		System.out.println(fact);
	}

}
