package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserEngine {

	public static WebDriver driver;
	
	public static WebDriver browsersetup() 
	{
		
				//open Chrome browser
		
				System.setProperty("webdriver.chrome.driver","C:\\Digitalpoint\\forumAutomation\\Digitalpoint.tech\\Drivers\\chromedriver.exe");
				
				driver = new ChromeDriver();
			
       //  System.setProperty("webdriver.gecko.driver","C:\\Digitalpoint\\forumAutomation\\Digitalpoint.tech\\Drivers\\geckodriver.exe");
				
			//	driver = new FirefoxDriver();
			
				
				//maximixe the browser
				
				driver.manage().window().maximize();
				
				//delete all cookies
				
				driver.manage().deleteAllCookies();
				
		return driver;
		
		
		
	}
	
	
}
