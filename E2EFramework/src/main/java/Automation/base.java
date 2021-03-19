package Automation;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	public WebDriver driver;

	public WebDriver driverInitializer() 
	{
		Properties prop = Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Vusal\\git\\repository\\E2EFramework\\src\\main\\java\\Automation\\data.properties");
		
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		
		if(browserName == "Chrome")
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vusal\\OneDrive\\Desktop\\1\\SoftWareTesting\\exeFiles\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if (browserName == "IE")
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Vusal\\OneDrive\\Desktop\\1\\SoftWareTesting\\exeFiles\\msedgedriver.exe");  
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
}
