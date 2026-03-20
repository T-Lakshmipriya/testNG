package practice;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserBaseClass {
         WebDriver driver;
@BeforeSuite
public void beforeSuit() {
	Reporter.log("---Exceuting before Suite---", true);
	}
@BeforeTest
public void beforeTest() {
Reporter.log("---Exceuting before Test---", true);
}
@Parameters("browser")
@BeforeClass
public void beforeClass(String browser) {
	ChromeOptions copt =new ChromeOptions();
	copt.addArguments("--incognito");
	copt.addArguments("--headless");
	EdgeOptions copt1 =new EdgeOptions();
	copt1.addArguments("--inprivate");
	copt.addArguments("--headless");
	FirefoxOptions copt2 =new FirefoxOptions();
	copt.addArguments("--headless=new");
	copt2.addArguments("--private");
Reporter.log("-----Exceuting Before Class-----" ,true);

        if(browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
@Test
public void logIn() {
	    driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		WebElement SwagLab = driver.findElement(By.xpath("//div[ . = 'Swag Labs']"));
		if (SwagLab.isDisplayed()) {
			Reporter.log("Swag Labs Page : Pass", true);
		} else {
			Reporter.log("Swag Labs Page : Fail" , true);
		}
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("---Exceuting before Method---", true);

	}
@AfterSuite
	public void afterSuit() {
		Reporter.log("---Exceuting after Suite---", true);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("---Exceuting after Test---", true);
	}
	@AfterClass
	public void afterClass() {
		Reporter.log("---Exceuting after Class---", true);
	}
	@AfterMethod
	public void afterMethod() {
		Reporter.log("---Exceuting after Method---", true);
	}
}