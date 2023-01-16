package data_providers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class d4 {

@DataProvider(name="search")
	public static Object[][] Dataset()
	    {
		Object[][] obj= {
				{"books"},
				{"baby"},
				{"mobiles"},
				{"beauty"},
				{"toys"}
				};
		return obj;
		}
		
@Test(dataProvider="search")	
public void type(String s) throws InterruptedException

{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver ob = new ChromeDriver();
    ob.get("https://www.amazon.in/");
    
    ob.findElementById("twotabsearchtextbox").sendKeys(s);
    ob.findElementById("nav-search-submit-button").click();
    
    Thread.sleep(2000);
    ob.quit();
    

}
	
}
