package data_providers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class d3 {
	
	
	@DataProvider(name="mail")
	public static Object[] Dataset()
	
	{
		
		Object[] obj= {"j@gmal.com","jayash","js@gmail","jayashreer123@gmail.com"};
		
		return obj;
				
		}
	
	@Test(dataProvider="mail")
	public void login (String mailid) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      
        ChromeDriver ob = new ChromeDriver();
        ob.get("https://www.amazon.in/");
        
        ob.findElementByCssSelector("#nav-link-accountList-nav-line-1").click();
        ob.findElementByName("email").sendKeys(mailid);
        ob.findElementById("continue").click();
        
        Thread.sleep(2000);
        ob.quit();
	}
	
	
		
	}


