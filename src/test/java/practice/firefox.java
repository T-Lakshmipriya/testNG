package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class firefox {
	@Test
	public static void chrome() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
	}
}
