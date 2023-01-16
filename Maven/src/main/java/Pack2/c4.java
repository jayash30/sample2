package Pack2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c4 {

	@Test(groups="two")
	public void implicit()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.google.com/");
		ob.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		ob.navigate().refresh();
		System.out.println(ob.getTitle());
		System.out.println(ob.getCurrentUrl());
		WebElement ele = ob.findElementByLinkText("Privacy");
		//WebElement ele = ob.findElementByLinkText("Pri");
		ele.click();
		ob.quit();
		
	}
}
