package testScripts.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import helperClasses.BaseClass;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:/Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(BaseClass.getProjectPath()+"\\src\\test\\resources\\FrameEx.html");		
		Thread.sleep(2000);	
		
		
		driver.switchTo().frame("IF1");
		driver.findElement(By.id("userName")).sendKeys("rama.mullamgi");	
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("user")).sendKeys("dfdsfdfs");
		
		

	}

}
