package testScripts.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import helperClasses.BaseClass;

public class PopupsHandling {
	
	@Test
	public void ExampleForConfirmBox() throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "c:/Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(BaseClass.getProjectPath()+"\\src\\test\\resources\\AlertEx2.html");		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@onclick='confirmFunction()']")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		
		alert.accept();
		
		Thread.sleep(2000);
		
		String xx= driver.findElement(By.id("confirmdemo")).getText();
		System.out.println(xx);
		
//		alert.dismiss();
	}
}