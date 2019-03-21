package coreJava.array;

public class ArrayEx {

	public static void main(String[] args) {
	
		
		int x=10;
		
		int[] a = new int[4];
		
		a[0]=10;
		a[1]=3;
		a[2]=5;
		a[3]=6;
		
//		for(int i : a) {
//			 System.out.println(i);
//		}
		
		
		for(int i=0;i<a.length;i++) {
			 System.out.println(a[i]);
		}
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
		
		System.out.println(a.length);
		

	}

}
