package objectrepository;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swaglabs.loginpagefactory;
public class LoginPagee  {
	public WebDriver driver;
 public LoginPagee(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
 }
 @FindBy(id ="user-name")
 WebElement userName;
 @FindBy(id="password")
 WebElement password;
 @FindBy(id="login-button")
 WebElement loginBtn;
// public void enterUrl(String url) {
//	 driver.manage().window().maximize();
//	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	 driver.get(url);
// }
 public void enterCredentials(String un,String pwd) {
	 userName.sendKeys(un);
	 password.sendKeys(pwd);
 }
 public void clicklogin() {
		loginBtn.click();
	}
}
