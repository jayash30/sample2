package ex1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test1 {
	
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ce=new ChromeDriver();
		
		ce.get("http://jqueryui.com/autocomplete/");
		
		ce.switchTo().frame(0);
		WebDriverWait wait= new WebDriverWait(ce,4);
		WebElement textelement = ce.findElementById("tags");
		textelement.sendKeys("a");
		//WebElement autoOptions = ce.findElement(By.id("ui-id-1"));
	
		WebElement autoOptions = ce.findElementById("ui-id-1");
		
		wait.until(ExpectedConditions.visibilityOf(autoOptions));

		List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
		for(WebElement option : optionsToSelect){
	        if(option.getText().equals("Java")) {
	        	System.out.println("Trying to select: "+"Java");
	            option.click();
	            break;
	}

		
	}
}

}
