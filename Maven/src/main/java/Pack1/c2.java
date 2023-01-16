package Pack1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c2 {
	
	
	@Test(groups="one")
	public void slider() throws InterruptedException
	
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://jqueryui.com/slider/");
		
		ob.switchTo().frame(0);
		
		Actions ac= new Actions(ob);
		
		WebElement ele = ob.findElementById("slider");
		ac.dragAndDropBy(ele, 40, 0).build().perform();
		
		Thread.sleep(2000);
		
		ob.quit();
		
		
	}

}
