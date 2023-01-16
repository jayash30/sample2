package data_providers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class d1 {
	
	
	@DataProvider(name = "dhivya")
    public static Object[][] DataSet(){
        // arrayname[row][col]
        Object[][] obj = {
                {"valid", "Dhivyakarthi123", "12345"},//row   00   01  02
                {"invalid", "DDD", "555"},             //row   10   11  12
                {"in", "DEEPA","3456"},
                {"invalid","jayash","564"}
                };
        return obj;
    }
@Test(dataProvider = "dhivya")// we made the connection     
    //first    type=valid   username=Dhivyakarthi123   password=12345
    //second   type=invalid username=DDD               password=555
    //third    type=in      username=DEEPA             password=3456
    public void DataProvSampleTest(String type, String username, String password) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
      
        ChromeDriver ob = new ChromeDriver();

        ob.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        ob.get("https://www.facebook.com/");
//login (used for both valid and invalid case)
        ob.findElementById("email").sendKeys(username);
        ob.findElementById("pass").sendKeys(password);
       ob.findElementByName("login").click();
      
       /*
        if(type.equals("valid")){
            System.out.println("in home");
            ob.findElementByLinkText("Logout").click();
            
        }else
            System.out.println("invaliduser");
            */
            

        Thread.sleep(2000);
        ob.quit();
    }


}
