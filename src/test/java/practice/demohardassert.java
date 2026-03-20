package practice;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demohardassert {
@Test
public void testMethod() {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.google.com/");
	String expectedTitle ="Google";
	String ActualTitle =driver.getTitle();
	Assert.assertEquals(ActualTitle, expectedTitle);
	//compare boolean value
	Assert.assertTrue(expectedTitle.equals(ActualTitle),"comparing two values");
	Assert.assertEquals(expectedTitle.equals(ActualTitle), true);
	if(expectedTitle.equals(ActualTitle)) {
		System.out.println("passed");
	}else {
		System.out.println("failed");
	}
}
}
