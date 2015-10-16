/*The is the beginning of a selenium framework that just naviagtes to serach engines and search a given 
 *term. Will be adding verifies and more search engines and reporting tools. 
 * 
 */
package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SearchTest {

	public static void main(String[] args) {
		try
		{
	    WebDriver driver = new FirefoxDriver();

	    //Open Browser
		Navigation nav = new Navigation();
		//Navigate to Google
		nav.Navigate("http://google.com/",driver);
		System.out.println(driver.getCurrentUrl().toString());
		//Search google for term or search phrase
		ISearch g = new Google();
		g.Search(ISearch.search,driver);
		driver.navigate().to("http://www.bing.com/");
		System.out.println(driver.getCurrentUrl().toString());
		//Naviagte to Bing
		nav.Navigate("http://www.bing.com/",driver);
		System.out.println(driver.getCurrentUrl().toString());
		//Search Bing for search term
		ISearch b = new Bing();
		b.Search(ISearch.search,driver);
		//Close Browser
		driver.close();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

}
