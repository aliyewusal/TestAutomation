package Automation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPasswordP;
import pageObjects.LandingPageP;
import resources.base;

public class HomePage extends base {
	
	@Test (dataProvider = "getData")
	public void basePageNavigation(String email, String password ,String text) throws IOException
	{
		driver = driverInitializer();
		
		driver.get(prop.getProperty("url"));
		
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
		
		mp.phoneEmail().sendKeys(email);
		mp.password().sendKeys(password);
		mp.LogIn().click(); //driver.findElement(By.cssSellector())	
		
		System.out.println(text);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//Row represent how many data types test should run
		//Column represents how many values per each test
		Object[][] data=new Object[2][3];
		
		data[0][0] = "example@gmail.com";
		data[0][1] = "123456";
		data[0][2] = "Valid credentials";
		
		data[1][0] = "invalidemal@gmail.com";
		data[1][1] = "654123";
		data[1][2] = "Invalid credentials";
				
		return data;
	}
	
	
	
	@Test
	public void forgotPassword() throws IOException
	{
		driver = driverInitializer();
		
		driver.get(prop.getProperty("forgotPassUrl"));
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		
		LandingPageP lp=new LandingPageP(driver);
		try 
		{
		lp.AcceptCookies().click();
		}
		catch(Exception e)
		{
			System.out.println("There is no Cookies");
		}
		
		ForgotPasswordP fp=new ForgotPasswordP(driver);
		
		fp.mobileNumber().sendKeys("+994515376895");
		fp.search().click();
	}
}	


