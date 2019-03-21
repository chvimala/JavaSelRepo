package coreJava.interfaces;

public class Test2 {

	public static void main(String[] args) {

		String browser="chrome";
		
		WebDriver wobj =null;
		if("chrome".equalsIgnoreCase(browser)) {
			wobj = new ChromeDriver();
			wobj.get("https://google.co.in");

		}else if("firefox".equalsIgnoreCase(browser)) {		
			wobj = new FirefoxDriver();
			wobj.get("https://google.co.in");

		}
		wobj.click();
		wobj.sendKeys("");
		
	}

}
