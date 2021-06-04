import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyTicket {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vusal\\OneDrive\\Desktop\\1\\SoftWareTesting\\exeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.skyscanner.com/");
		// driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector("button[class*='accept-button']")).click();

		driver.findElement(By.cssSelector("#fsc-trip-type-selector-one-way")).click();

		WebElement searchFrom = driver.findElement(By.xpath("//input[@name='fsc-origin-search']"));

		searchFrom.click();
		searchFrom.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		searchFrom.sendKeys("War");

		List<WebElement> options = driver
				.findElements(By.cssSelector("li[id*='react-autowhatever-fsc-origin-search'] section"));

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("Warszawa Modlin (WMI)")) {
//				System.out.println(option.getText());
				option.click();
				break;
			}
		}

		WebElement searchTo = driver.findElement(By.xpath("//input[@id='fsc-destination-search']"));

		searchTo.sendKeys("Baku");

		List<WebElement> options_ = driver
				.findElements(By.cssSelector("li[id*='react-autowhatever-fsc-destination-search'] section"));

		for (WebElement option : options_) {
			if (option.getText().equalsIgnoreCase("Baku Heydar Aliyev (GYD)")) {
				System.out.println(option.getText());
				option.click();
				break;
			}
		}

		// Covid-19 pop-up
		try {
			driver.findElement(By.cssSelector(".btn.ng-binding")).click();
		} catch (Exception e) {
			System.out.println("There is no Covid-19 warning");
		}

		driver.findElement(By.cssSelector(".DateInput_DateInput--text__-b97u")).click();

		driver.findElement(By.xpath(
				"//nav[@class='BpkMobileScrollContainer_bpk-mobile-scroll-container__inner__3PhG7']/div[1]/div/button"))
				.click();

		List<WebElement> dates = driver.findElements(By.className("BpkCalendarGrid_bpk-calendar-grid__date__3Dy_6"));
		// Grab common attribute//Put into list and iterate
		int count = driver.findElements(By.className("BpkCalendarGrid_bpk-calendar-grid__date__3Dy_6")).size();

		for (int i = 0; i < count; i++) {
			String text = dates.get(i)
					.getText();
			if (text.equalsIgnoreCase("21")) {
				driver.findElements(By.className("BpkCalendarGrid_bpk-calendar-grid__date__3Dy_6")).get(i).click();
				break;
			}

		}

		driver.findElement(By.cssSelector("button[aria-label='Szukaj']")).click();
		driver.findElement(By.id("")).click();
	}

}
