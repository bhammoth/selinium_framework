package automationFramework.Objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleObjects{
	public static class SearchBar{
		public static WebElement txtbox_Search(WebDriver driver){
			 
			 WebElement element = null;

			// Write Code to find element here
			 element = driver.findElement(By.name("q"));
			 return element;

			}
		
     }
	public static class SearchButton{
		public static WebElement btn_Search(WebDriver driver){
			 
			 WebElement element = null;

			// Write Code to find element here
			 element = driver.findElement(By.name("btnK"));
			 return element;

			}
		public static WebElement btn_Search1(WebDriver driver){
			 
			 WebElement element = null;

			// Write Code to find element here
			 element = driver.findElement(By.name("btnG"));
			 return element;

			}
    }

}
