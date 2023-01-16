package data_providers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class d5 {
	
	
	@DataProvider(name="mail")
	public static Object[][] Dataset()
	
	{
		Object[][] obj= {
				
				{"invalid","j@gmal.com","555"},
				{"invalid","jayash","555"},
				{"invalid","js@gmail","555"},
				{"valid","jayashreer123@gmail.com","555"}
		};
		return obj;
				
		}
	
	@Test(dataProvider="mail")
	public void login (String type,String mailid,String pass) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      
        ChromeDriver ob = new ChromeDriver();
        ob.get("https://www.amazon.in/");
        
        ob.findElementByCssSelector("#nav-link-accountList-nav-line-1").click();
        ob.findElementByName("email").sendKeys(mailid);
        ob.findElementById("continue").click();
        
		if (type.equals("vaild"))
        {
        	ob.findElementByName("password").sendKeys(pass);
           	ob.findElementById("signInSubmit").click();
        }
		else
			System.out.println("invalid email");
        
        Thread.sleep(2000);
        ob.quit();
	}

}
