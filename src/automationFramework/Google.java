package automationFramework;


import org.openqa.selenium.WebDriver;
import automationFramework.Objects.GoogleObjects;

public class Google implements ISearch{
	public void Search(String search, WebDriver driver)
	{
		//WebDriver driver = new FirefoxDriver();

		GoogleObjects.SearchBar.txtbox_Search(driver).sendKeys(search);
	       if(GoogleObjects.SearchButton.btn_Search(driver).isDisplayed()==true)
	       {
		       GoogleObjects.SearchButton.btn_Search(driver).click();

	       }
	       if(GoogleObjects.SearchButton.btn_Search1(driver).isDisplayed()==true)
	       {
		       GoogleObjects.SearchButton.btn_Search1(driver).click();

	       }
	}

}
