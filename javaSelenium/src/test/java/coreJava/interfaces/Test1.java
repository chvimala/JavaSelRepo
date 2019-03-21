package coreJava.interfaces;

public class Test1 {

	public static void main(String[] args) {

		String browser="chrome";
		ChromeDriver cobj=null;
		FirefoxDriver fobj=null;
		
		if("chrome".equalsIgnoreCase(browser)) {
			cobj = new ChromeDriver();
			cobj.get("https://google.co.in");

		}if("chrome".equalsIgnoreCase(browser)) {	
			fobj = new FirefoxDriver();
			fobj.get("https://google.co.in");

		}else if("ie".equalsIgnoreCase(browser)) {	
			
		}

		if("chrome".equalsIgnoreCase(browser)) {
			cobj.click();
		}else {
			fobj.click();
		}
		
		if("chrome".equalsIgnoreCase(browser)) {
			cobj.sendKeys("dfdsf");
		}else {
			fobj.sendKeys("dfdsf");
		}

	}

}
