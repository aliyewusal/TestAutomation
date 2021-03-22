package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordP {
	
	public WebDriver driver;
	
	By emailPhone = By.cssSelector("input[placeholder*='Email']");
	By password = By.cssSelector("input[placeholder*='Password']");
	By logIn = By.xpath("//div[@aria-label='Accessible login button']");
	By mobileNumber = By.cssSelector(".inputtext._9o1w");
	By search = By.xpath("//*[@name='did_submit']");
	
	
	public ForgotPasswordP(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement emailPhone()
	{
		return driver.findElement(emailPhone);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement logIn()
	{
		return driver.findElement(logIn);
	}
	
	public WebElement mobileNumber()
	{
		return driver.findElement(mobileNumber);
	}
	
	public WebElement search()
	{
		return driver.findElement(search);
	}
}
