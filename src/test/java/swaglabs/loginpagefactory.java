package swaglabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.LoginPagee;
import objectrepository.baseclass;

public class loginpagefactory extends baseclass{
	@Test
public void login() {
	//WebDriver driver = new ChromeDriver();
	LoginPagee lp = new LoginPagee(driver);
	//lp.enterUrl("https://www.saucedemo.com/");
	lp.enterCredentials("standard_user", "secret_sauce");
	lp.clicklogin();
}
}
