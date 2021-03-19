package Automation;

import org.testng.annotations.Test;

public class HomePage extends base {
	
	@Test
	public void basePageNavigation()
	{
		driver = driverInitializer();
		driver.get("https://www.google.com/");
		
	}

}
