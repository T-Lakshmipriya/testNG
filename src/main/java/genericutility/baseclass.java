package genericutility;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
public class baseclass {
	
	@BeforeSuite
	
	public void beforeSuit() {
		System.out.println("Executing:beforesuit");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Executing:beforetest");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Executing:beforeclass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Executing:beforemethod");

	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Executing:aftermethod");

	}
	@AfterClass
	public void afterClass() {
		System.out.println("Executing:afterclass");

	}
	@AfterTest
	public void afterTest() {
		System.out.println("Executing:aftertest");

	}
	@AfterSuite
	public void afterSuit() {
		System.out.println("Executing:aftersuit");

	}
	
}