package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class task1 {
	@Test
	public static void m1() {
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
		String title1 ="Swag Labs";
		String title=driver.getTitle();
		Assert.assertEquals(title1, title);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.cssSelector("[class='shopping_cart_link']")).click();
		WebElement pro=driver.findElement(By.cssSelector("[class=\"inventory_item_name\"]"));
		String product ="Sauce Labs Backpack";
		String product2="Sauce Labs Bike Light";
		WebElement pro1 =driver.findElement(By.xpath("(//div[contains(@class,'inventory_item_name')])[2]"));
		Assert.assertEquals(pro1.getText(), product2);
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("lakshmi");
		driver.findElement(By.id("last-name")).sendKeys("priya");
		driver.findElement(By.id("postal-code")).sendKeys("606200");
		driver.findElement(By.id("continue")).click();
		WebElement total =driver.findElement(By.cssSelector("[class=summary_total_label]"));
		String cost ="Total: $43.18";
		Assert.assertEquals(total.getText(),cost);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		driver.quit();
	}
}
