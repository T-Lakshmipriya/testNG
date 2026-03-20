package practice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	WebDriver driver=null;
	@BeforeSuite
	public void beforeSuit() {
		Reporter.log("---Exceuting before Suite---", true);
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("---Exceuting before Test---", true);
	}
	@BeforeClass
	public void beforeClass() {
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("--disable-notification");
		 options.addArguments("--Incognito");
		 driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Reporter.log("---Exceuting before Class---", true);
		
		//login with valid credentials
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("---Exceuting before Method---", true);
	}
	@AfterMethod
	public void afterMethod() {
		Reporter.log("---Exceuting after Method---", true);
	}
	@AfterClass
	public void afterClass() {
		driver.findElement(By.xpath("//button[.='Open Menu']")).click();
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		Reporter.log("---Exceuting after Class---", true);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("---Exceuting after Test---", true);
	}
	@AfterSuite
	public void afterSuit() {
		Reporter.log("---Exceuting after Suite---", true);
	}
	
	

	
}
