package Logss;

import java.util.List;

import org.apache.logging.log4j.LogManager;


import java.util.List;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class l3 {
	
	
	static Logger log= LogManager.getLogger(l3.class);
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
        ob.get("https://www.seleniumeasy.com/");
        log.info("visited website");
        ob.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        log.info("Scroll down");
		List<WebElement> ele = ob.findElementsByLinkText("JUnit Tutorials");
		
		log.warn("Linktext may not be visible");
		for(WebElement x: ele)
		{
			if(x.isDisplayed())
			{
			x.click();
			}
		}
		Thread.sleep(3000);
		log.info("closing");
		ob.quit();
        
		
		
	}

}
