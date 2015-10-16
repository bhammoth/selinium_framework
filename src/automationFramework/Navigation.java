package automationFramework;

import org.openqa.selenium.WebDriver;

public class Navigation {
    public void Navigate(String url,WebDriver driver)
    {
    	if (driver.getCurrentUrl().toString().equals(""))
    	{
    		driver.get(url);
    	}
    	else
    	{
    	driver.navigate().to(url);
    	}
    	
    }
}
