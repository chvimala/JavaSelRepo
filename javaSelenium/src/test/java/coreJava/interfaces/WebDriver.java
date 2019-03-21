package coreJava.interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface WebDriver {
	
	public void  get(String url);
	
	public void click();
	
	public void sendKeys(String keys);

	public WebElement findElement(By xpath);

}
