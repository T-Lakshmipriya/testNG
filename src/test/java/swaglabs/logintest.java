package swaglabs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import objectrepository.baseclass;
import objectrepository.loginpage;

public class logintest extends baseclass{
	
	@Test
	public void m1() throws InterruptedException {
	    loginpage p = new loginpage(driver);
	//   p.enterUrl("");
	    p.enterUsername("standard_user");
	    p.enterPassword("secret_sauce");
	    p.clicklogin();
	}
}