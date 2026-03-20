package demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import objectrepository.LoginPagee;
import objectrepository.orangelogin;
public class orangehrmloginusingdataprovider {
	WebDriver driver;
	@DataProvider(name ="logindata")
	Object[][] getcredential(){
		return new Object[][] {
			{"Admin","admin123"}
		};
	}
@Test(dataProvider ="logindata")
public void enterCredentials(String user,String pass) {
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	orangelogin lp = new orangelogin(driver);
	lp.enterCredentials(user,pass);
	lp.clicklogin();
	
}
}
