package selenium.testScripts;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import selenium.helperClasses.BaseClass;
import selenium.helperClasses.ReadXlsxDataHelper;
import selenium.pageObjects.TellAboutPO;

public class NaukriTestUsingParameters extends BaseClass{
	
	// Testng work with reflection api
	
	@Parameters({ "browserName"})
	@BeforeClass(groups = { "sanity", "regression" })
	public void beforeClassMethod(String browserName) throws Exception {
		launchapplication(browserName);
		
	}


	@Test(groups = {"sanity", "regression" })
	public void reg1() throws Exception {

		WebElement element =driver.findElement(TellAboutPO.buttonExp);
		element.click();
	}

	@Test(groups = {"regression" })
	public void reg2() throws Exception {

		HashMap hashMapObj	= ReadXlsxDataHelper.getXlsxRowDataAsMap("TestData", "Sheet1", 1);

		element = driver.findElement(By.id("fname"));
		element.sendKeys(hashMapObj.get("name").toString());	

	}


	@AfterClass(groups = { "sanity", "regression" })
	public void afterClassMethod() throws Exception {
		driver.quit();
	}
}
