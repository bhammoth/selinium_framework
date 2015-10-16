package automationFramework;

import org.openqa.selenium.WebDriver;
import automationFramework.Objects.BingObjects;

public class Bing implements ISearch{
	public void Search(String search,WebDriver driver){
	BingObjects.SearchBar.txtbox_Search(driver).sendKeys(search);
       if(BingObjects.SearchButton.btn_Search(driver).isDisplayed()==true)
       {
	       BingObjects.SearchButton.btn_Search(driver).click();

       }
	}
}


