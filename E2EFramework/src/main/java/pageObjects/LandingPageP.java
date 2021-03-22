package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageP {
	
	public WebDriver driver;
	
	By acceptCookies = By.cssSelector("button[data-cookiebanner='accept_button']");
	By logIn = By.cssSelector("button[name='login']");
	By phoneEmail = By.cssSelector(".inputtext._55r1._6luy");
	By password = By.cssSelector(".inputtext._55r1._6luy._9npi");
	By forgotPassword = By.cssSelector("a[href*='recover']");
	By createPage = By.cssSelector("._8esh");	
	By title = By.cssSelector("._8eso");
	By logo = By.cssSelector(".fb_logo._8ilh.img");
	
	
	public LandingPageP(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement logo()
	{
		return driver.findElement(logo);
	}
	
	public WebElement LogIn()
	{
		return driver.findElement(logIn);
	}
	
	public WebElement AcceptCookies()
	{
		return driver.findElement(acceptCookies);
	}
	
	public WebElement phoneEmail()
	{
		return driver.findElement(phoneEmail);
	}

	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement forgotPassword()
	{
		return driver.findElement(forgotPassword);
	}
	
	public WebElement createPage()
	{
		return driver.findElement(createPage);
	}
	
	public WebElement title()
	{
		return driver.findElement(title);
	}
}
