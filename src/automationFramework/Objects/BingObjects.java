package automationFramework.Objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BingObjects {
	public static class SearchBar{
		public static WebElement txtbox_Search(WebDriver driver){
			 
			 WebElement element = null;

			// Write Code to find element here
			 element = driver.findElement(By.id("sb_form_q"));
			 return element;

			}
		
     }
	public static class SearchButton{
		public static WebElement btn_Search(WebDriver driver){
			 
			 WebElement element = null;

			// Write Code to find element here
			 element = driver.findElement(By.name("sb_form_go"));
			 return element;

			}
    }


}
