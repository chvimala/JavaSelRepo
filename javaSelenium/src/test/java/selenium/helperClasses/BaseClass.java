package selenium.helperClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import selenium.pageObjects.TellAboutPO;

public class BaseClass {

	public TellAboutPO tellAboutPOObj=null;
	
	@BeforeSuite
	public void setupObjectFactory() {
		
		 tellAboutPOObj = PageFactory.initElements(driver, TellAboutPO.class);
	}
	public  WebDriver driver=null;	
	public  WebElement element=null;

	public  void launchapplication(String browserType){		

		if("chrome".equalsIgnoreCase(browserType)){
			WebDriverManager.chromedriver().setup();	
			driver = new ChromeDriver();			
		}else if("firefox".equalsIgnoreCase(browserType)){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.get("https://my.naukri.com/account/createaccount");
		driver.manage().window().maximize();
	}


	public static String getCurrentDirecorty(){
		return System.getProperty("user.dir");
	}
	
	@AfterSuite
	public void aftersetupObjectFactory() {
		
		// we need to kill tellAboutPOObj usng garbage collector
	}

}
