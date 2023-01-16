package Pack2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c3 {

	
	@Test(groups="two")
public void dragndrop() throws IOException

{

	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	ChromeDriver ob= new ChromeDriver();
	ob.get("https://jqueryui.com/droppable/");
	
	//id, name, index
	ob.switchTo().frame(0); //switch control to frame
	// for index check above and below and ensure its a 1st frame so index is 0.
	
	File f1 = ob.getScreenshotAs(OutputType.FILE);//screenshot
	FileUtils.copyFile(f1, new File("C:\\Users\\user\\eclipse-workspace\\Maven\\Screenshots\\b.png"));
	
	Actions ac= new Actions(ob);
	
	WebElement ele = ob.findElementById("draggable");
	WebElement ele1 = ob.findElementById("droppable");
	
	ac.dragAndDrop(ele, ele1).build().perform();
	
	File f2 = ob.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f2, new File("C:\\Users\\user\\eclipse-workspace\\Maven\\Screenshots\\a.png"));
	
	ob.quit();

}
}
