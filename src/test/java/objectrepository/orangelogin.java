package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangelogin {
	 public WebDriver driver;

	    public orangelogin(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // ✅ Username textbox
	    @FindBy(name = "username")
	    WebElement userName;

	    // ✅ Password textbox
	    @FindBy(name = "password")
	    WebElement password;

	    // ✅ Login button
	    @FindBy(xpath = "//button[@type='submit']")
	    WebElement loginBtn;

	    // ✅ Enter credentials
	    public void enterCredentials(String un, String pwd) {
	        userName.sendKeys(un);
	        password.sendKeys(pwd);
	    }

	    // ✅ Click login
	    public void clicklogin() {
	        loginBtn.click();
	    }
}
