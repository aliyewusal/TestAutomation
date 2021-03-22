package Automation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPageP;
import resources.base;

public class validateTitle extends base{

		@Test 
		public void getTitle() throws IOException
		{
			driver = driverInitializer();
			driver.get("https://www.facebook.com/");
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
			
			//There are two ways to access to the other class:
			//1) Inheritance 
			//2) Creating object for that class and invoke methods of it
			
			LandingPageP mp = new LandingPageP(driver);
			
			try 
			{
			mp.AcceptCookies().click();
			}
			catch(Exception e)
			{
				System.out.println("There is no Cookies");
			}
			
			Assert.assertEquals(mp.title().getText(),"Connect with friends and the world around you on Facebook."); 
//			System.out.println(mp.title().getText());
			
			Assert.assertTrue(mp.logo().isDisplayed());
	
		
			
			mp.driver.quit();
		}

}
