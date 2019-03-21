package helperClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;
	public static WebElement element;
	
	
	public static void launchApplication(String url){	
		
		System.setProperty("webdriver.chrome.driver", "c:/Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	public static boolean isLinkExists(WebDriver driver , By xpath){
		try{
			driver.findElement(xpath).isDisplayed();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		
		
	}
	
	public static String getProjectPath(){
		return System.getProperty("user.dir");
	}
	


}
