package selenium.helperClasses;

import java.util.ResourceBundle;

public class ResourceBundleManager {

	public static String getProperty(String keyword) {
		ResourceBundle resource = ResourceBundle
				.getBundle("selenium.helperClasses.Automation");
		String propertyvalue = (String) resource.getObject(keyword);
		return propertyvalue;
	}
	

}