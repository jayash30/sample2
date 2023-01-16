package AutoIT;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class n2 {

	
	public static void main(String[] args) throws IOException {
		
		//excel File
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://www.filemail.com/share/upload-file");
		ob.findElementByCssSelector("#addBtn > span").click();
		Runtime.getRuntime().exec("\"G:\\Software Testing\\AutoIT\\s1.exe\"");
		
	}
}
