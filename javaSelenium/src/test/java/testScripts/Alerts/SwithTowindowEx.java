package testScripts.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwithTowindowEx {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:/Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://hdfcbank.com");	
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		
		String windowhandleBefore= driver.getWindowHandle();

		
		driver.findElement(By.id("loginsubmit")).click();				
		Thread.sleep(5000);	
		
		for(String winhandle : driver.getWindowHandles()){
			driver.switchTo().window(winhandle);
		}			
		
		driver.findElement(By.xpath("(//a[text()='Continue to NetBanking'])[2]")).click();
		Thread.sleep(2000);	
		
		driver.close();
		
		driver.switchTo().window(windowhandleBefore);
		
		driver.findElement(By.id("loginsubmit")).click();	
		
		Thread.sleep(2000);	
		
		driver.quit();  //all windows it will close
		
		
		
	
		
		
		
		
	}

}
