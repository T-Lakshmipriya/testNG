package demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginUsingJsonOr {
	@Test
	public void login() throws IOException {
		String data = new String(Files.readAllBytes(Paths.get("./src/test/resources/objectrepository/login.json")));
		JSONObject obj = new JSONObject(data);
         JSONObject loginpage = obj.getJSONObject("login");
         //Extracting the data to check 
        String userTextField =loginpage.getString("un");
        String passwordTextField =loginpage.getString("pass");
        String loginBtn =loginpage.getString("loginbtn");
        //splitting the string values to use in locator
        String [] userLoc=userTextField.split(":");
        String [] passLoc=passwordTextField.split(":");
        String [] loginBtnLoc=loginBtn.split(":");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        //username
        if(userLoc[0].equals("name")) {
        	driver.findElement(By.name(userLoc[1])).sendKeys("Admin");
        }
        //password
        if(passLoc[0].equals("name")) {
        	driver.findElement(By.name(passLoc[1])).sendKeys("admin123");
        }
        
        if(loginBtnLoc[0].equals("cssSelector")) {
        	driver.findElement(By.cssSelector(loginBtnLoc[1])).click();
        }
	}
}
