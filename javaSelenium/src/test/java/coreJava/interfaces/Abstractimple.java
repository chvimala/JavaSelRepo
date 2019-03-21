package coreJava.interfaces;

public class Abstractimple extends AbstractEx{

	@Override
	public void frontcamera() {
		System.out.println("front cmaera  impl");	
	}
	
	public static void main(String[] args) {
		
		Abstractimple aobj = new Abstractimple();
		aobj.backCamera();
		aobj.frontcamera();
	}

}
