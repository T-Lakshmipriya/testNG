package practice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class addtocart extends BaseClass{
//	WebDriver driver=null;
	
//@Test(priority=-1)
//public void launchingBrowser() {
	// driver=new ChromeDriver();
//	 ChromeOptions options=new ChromeOptions();
//	 options.addArguments("--disable-notification");
//	 options.addArguments("--Incognito");
//	 driver=new ChromeDriver(options);
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	}
@Test(priority=0)
public void login()
{
//	//login with valid credentials
//	driver.get("https://www.saucedemo.com/");
//	driver.findElement(By.id("user-name")).sendKeys("standard_user");
//	driver.findElement(By.id("password")).sendKeys("secret_sauce");
//	driver.findElement(By.id("login-button")).click();
//verification
	
	WebElement swagLagsText=driver.findElement(By.xpath("//div[text()='Swag Labs']"));
	if(swagLagsText.getText().contains("Swag Labs")) {
		//System.out.println("Login successfull");
		Reporter.log("Login successfull",true);
	}
	else {
		//System.out.println("Login failed");
		Reporter.log("Login failed",true);
	}
	
}
@Test(priority=1,dependsOnMethods="login")
public void addtocart() {
	//addingtocart
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
//verifying
	driver.findElement(By.id("shopping_cart_container")).click();
List<WebElement> productsinthecart=driver.findElements(By.xpath("//div[@class='cart_contents_container']"));
String result="";
	for(WebElement carProducts:productsinthecart) {
		result+=carProducts.getText();
	}
	if(result.contains("Sauce Labs Bike Light")&&result.contains("Sauce Labs Backpack")) {
		//System.out.println("verified");
		Reporter.log("verified",true);
	}else {
		//System.out.println("not verified");
		Reporter.log("not verified",true);
	}
}
//@Test(priority=2,dependsOnMethods="addtocart")
//public void logout() {
//	driver.findElement(By.xpath("//button[.='Open Menu']")).click();
//	driver.findElement(By.xpath("//a[.='Logout']")).click();
//}
//	

}