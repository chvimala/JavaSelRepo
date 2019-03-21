package coreJava.interfaces;

public abstract class ChromeDriver implements WebDriver{

	@Override
	public void get(String url) {
		System.out.println("get  implementation");
		
	}

	@Override
	public void click() {
		System.out.println("click  implementation");
		
	}

	@Override
	public void sendKeys(String keys) {
		System.out.println("sendkeys  implementation");
		
	}
	
	public void display() {
		System.out.println("display");
	}

}
