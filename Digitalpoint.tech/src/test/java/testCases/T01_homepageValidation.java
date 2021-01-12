package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import Utilities.browserEngine;
import Utilities.userData;

public class T01_homepageValidation {
	public static WebDriver driver;
	
	@BeforeMethod(groups=("smoke"))
	
	
	public static void openBrowser() 
	
	{
		
		driver =browserEngine.browsersetup();
		//open browser
		  
		 //System.setProperty("webdriver.chrome.driver","C:\\Digitalpoint\\forumAutomation\\Digitalpoint.tech\\Drivers\\chromedriver.exe");
			
		//  driver = new ChromeDriver();
					
			//Maximize the browser
		//  driver.manage().window().maximize();
			
		  		
				//delete all cookies
		//  driver.manage().deleteAllCookies();
			
	}

	@Test(groups=("smoke"))
	
	public static void homepageValidation() throws InterruptedException 
	{
		//load application under test
		
		//driver.get("https://forum.digitalpoint.tech/");
		driver.get(userData.homeURL);
		
		Thread.sleep(2000);
		//validate homepage title
		
   String hpactualtitle = driver.getTitle();
  // String hpexpectedtitle ="Digital Point Forum";
   AssertJUnit.assertEquals(hpactualtitle,userData.hpexpectedtitle);
   
	}

   @AfterMethod(groups=("smoke"))
   
   public static void closeBrowser()
{
	//closeing the browser
   driver.close();
   
   
   }
   
      }
