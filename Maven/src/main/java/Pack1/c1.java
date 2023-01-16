package Pack1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c1 {
	
	
	@Test(groups="one")
	public void im()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.google.com/");
		System.out.println("Title:"+ob.getTitle());
		
		ob.quit();
		
	}

}
