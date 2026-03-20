package practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class task2 {
	@Test
	public static void m1() throws InterruptedException {
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("--disable-notification");
		 options.addArguments("--Incognito");
		 WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		WebElement element=driver.findElement(By.cssSelector("[class='product_sort_container']"));
		element.click();
		Thread.sleep(2000);
		element.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		element.sendKeys(Keys.ENTER);
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		driver.findElement(By.id("shopping_cart_container")).click();
		WebElement cart=driver.findElement(By.cssSelector("[class=\"inventory_item_name\"]"));
		String cheapproduct ="Sauce Labs Onesie";
		Assert.assertEquals(cart.getText(), cheapproduct);
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("lakshmi");
		driver.findElement(By.id("last-name")).sendKeys("priya");
		driver.findElement(By.id("postal-code")).sendKeys("606200");
		driver.findElement(By.id("continue")).click();
		String lowprize ="Sauce Labs Onesie";
		WebElement low =driver.findElement(By.cssSelector("[class=\"inventory_item_name\"]"));
		Assert.assertEquals(low.getText(), lowprize);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		driver.quit();
	}

}
