package testCases;

import org.testng.annotations.Test;

import Utilities.userData;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class T02_loginpageValidation {
	
	
  public static WebDriver driver;
  
  @BeforeMethod(groups=("regression"))
  
		
	public static void openbrowser() {
		
		
		//open browser
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Digitalpoint\\forumAutomation\\Digitalpoint.tech\\Drivers\\chromedriver.exe");
		
	  driver = new ChromeDriver();
				
		//maximixe the browser
	  driver.manage().window().maximize();
		
	  		
			//delete all cookies
	  driver.manage().deleteAllCookies();
		
		
			}
  
  	@Test(groups=("regression"))
	
	public static void loginpageValidation() throws InterruptedException 
	{
		//loading the application under test
		//driver.get("https://forum.digitalpoint.tech/user/index.php/login");
	
  		driver.get(userData.appURL);
		Thread.sleep(2000);
		//validation of login page
		String loginpageactualtitle = driver.getTitle();
		//String loginpageexpectedtitle ="Digital Point - Forum | User Login";
	AssertJUnit.assertEquals(loginpageactualtitle,userData.loginpageexpectedtitle);
		
		
		//sending value to un
		
	driver.findElement(By.name("email")).sendKeys(userData.uid);
	
		Thread.sleep(2000);
		//sending the value on pw
	
	driver.findElement(By.name("password")).sendKeys(userData.pw);
		
		
		
		//sending the value to check box
	
		
		
		
		//click on sign in button
	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div[2]/div[3]/div[2]/button")).click();
		
		
		
		//logout functionality validation
		
	driver.findElement(By.xpath("//*[@id='navbar-right']/li/a")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id='navbar-right']/li/ul/li/a")).click();
		
		
		
		
		
	}
	
   @AfterMethod(groups=("regression"))
	  
	   
	   public static void closeBrowser()
	{
		//closeing the browser
	 //  driver.close();
	   
	   
	   }
}
