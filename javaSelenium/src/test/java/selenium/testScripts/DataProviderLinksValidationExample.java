package selenium.testScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import helperClasses.BaseClass;

public class DataProviderLinksValidationExample extends BaseClass{



	@BeforeClass
	public void startApp(){		
		launchApplication("https://Google.co.in");
	}


	@DataProvider(name = "test1")
	public static Object[][] linkValidation() {
		return new Object[][] {{"Gmail"}, {"Images"}};
	}


	@Test(dataProvider = "test1")
	public void validateLinks(String linkName){
		Assert.assertEquals(isLinkExists(driver, By.linkText(linkName)), true);
//		Assert.assertEquals(isLinkExists(driver, By.linkText("Gmail")), true);
//		Assert.assertEquals(isLinkExists(driver, By.linkText("Images")), true);
	}

}
