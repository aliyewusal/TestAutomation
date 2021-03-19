package Automation;

import java.io.IOException;

import org.testng.annotations.Test;

public class HomePage extends base {
	
	@Test
	public void basePageNavigation() throws IOException
	{
		driver = driverInitializer();
		driver.get("https://www.google.com/");
		
	}

}
