package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
//username
	public WebDriver driver;
	public loginpage(WebDriver driver) {
		this.driver =driver;
	}
	By username = By.id("user-name");
	//password
	By password = By.id("password");
	//login btn
	By loginBtn =By.id("login-button");
	//busineess logic (logic action)
	public void enterUsername(String un) {
driver.findElement(username).sendKeys(un);
	}
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	public void clicklogin() {
		driver.findElement(loginBtn).click();
	}
}
