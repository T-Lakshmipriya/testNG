package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class edge {
	@Test
	public static void chrome() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
	}
}
