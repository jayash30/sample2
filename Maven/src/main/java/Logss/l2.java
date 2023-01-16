package Logss;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class l2 {
	
	
	static Logger log= LogManager.getLogger(l2.class);
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
        ob.get("https://jqueryui.com/slider/");
        log.info("visited website");
		ob.switchTo().frame(0);
		
		Actions ac= new Actions(ob);
		log.info("clicking on scroller");
		WebElement ele = ob.findElementById("slider");
		ac.dragAndDropBy(ele, 40, 0).build().perform();
		log.info("moving scroller to a point");
		Thread.sleep(3000);
		log.info("closing");
		ob.quit();
		
	}


}
