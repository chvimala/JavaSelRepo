package selenium.testScripts;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenium.helperClasses.BaseClass;
import selenium.helperClasses.ReadXlsxDataHelper;
import selenium.pageObjects.TellAboutPO;

public class NaukriTest extends BaseClass{

	
	// Testng work with reflection api

	@BeforeClass
	public void beforeClassMethod() throws Exception {
		launchapplication("chrome");		
	}


	@Test
	public void reg1() throws Exception {
		

		WebElement element =driver.findElement(tellAboutPOObj.buttonExp);
		element.click();
	}

	@Test
	public void reg2() throws Exception {

		HashMap hashMapObj	= ReadXlsxDataHelper.getXlsxRowDataAsMap("TestData", "Sheet1", 1);

		element = driver.findElement(By.id("fname"));
		element.sendKeys(hashMapObj.get("name").toString());	

	}


	@AfterClass
	public void afterClassMethod() throws Exception {
		driver.quit();
	}
}
