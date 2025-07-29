package mouse_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameter {

	WebDriver driver;
	
	@Parameters({"username","password"})
		
	@Test
	
	public void verify_login(String username,String password) {
	
	System.setProperty("webdriver.chrome.driver", "../Testngproject/Browser Drivers/chromedriver.exe");

	driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://training.openspan.com/login");
	driver.findElement(By.id("user_name")).sendKeys(username);
	driver.findElement(By.id("user_pass")).sendKeys(password);
	driver.findElement(By.id("login_button")).click();
	
	driver.close();

	}

}
