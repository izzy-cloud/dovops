package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.browserEngine;
import Utilities.userData;

public class T03_regeistrationpageValidation {
	
	public static WebDriver driver;
	
	@BeforeMethod
	
	public static void openBrowser() {
		
		driver=browserEngine.browsersetup();
		
		
	}
	
	@Test
	
	public static void registerpageopensucssesfully() throws InterruptedException
	
	{
		driver.get("https://forum.digitalpoint.tech/index.php/home/userregistration");
		
		Thread.sleep(2000);
		
		String rpageactualtitle=driver.getTitle();
		//String rpageexpectedtitle="Digital Point Forum Registration";
		Assert.assertEquals(rpageactualtitle, userData.rpageexpectedtitle);
		
		//driver.findElement(By.name("fname")).sendKeys("izzy");
		driver.findElement(By.name("fname")).sendKeys("izzy");
		driver.findElement(By.name("lname")).sendKeys("geb");
		driver.findElement(By.name("email")).sendKeys("izzydigitalpoint@tech");
		driver.findElement(By.name("password")).sendKeys("abcdef1234");
		driver.findElement(By.name("phone")).sendKeys("0123456789");
		
		
		new Select (driver.findElement(By.name("language"))).selectByVisibleText("English");
	    new Select (driver.findElement(By.name("titles"))).selectByVisibleText("Mr");
	    new Select (driver.findElement(By.name("course"))).selectByVisibleText("Load Runner");
	    
	   
	    driver.findElement(By.xpath("//*[@id='home']/div/div[1]/div[6]/input")).click();
	   
	    driver.findElement(By.xpath("//*[@id='home']/div/div[2]/input")).click();
	    
		
		
		
		
	}
	
   @AfterMethod
	  
	   
	   public static void closeBrowser()
	{
		//closeing the browser
	 //  driver.close();
	   
	   
	   }

}
