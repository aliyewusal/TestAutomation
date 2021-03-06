package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop ; 
	
	public WebDriver driverInitializer() throws IOException 
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Vusal\\git\\repository\\E2EFramework\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vusal\\OneDrive\\Desktop\\1\\SoftWareTesting\\exeFiles\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if (browserName.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Vusal\\OneDrive\\Desktop\\1\\SoftWareTesting\\exeFiles\\msedgedriver.exe");  
			driver=new InternetExplorerDriver();
		}
		
		return driver;
	}
}
