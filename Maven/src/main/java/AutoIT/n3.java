package AutoIT;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class n3 {

	
	//word file
	
	public static void main(String[] args) throws IOException {
		
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://www.filemail.com/share/upload-file");
		ob.findElementByCssSelector("#addBtn > span").click();
		Runtime.getRuntime().exec("G:\\Software Testing\\AutoIT\\s2.exe");
		
	}
	
	
	
}
