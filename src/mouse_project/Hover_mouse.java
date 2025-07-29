package mouse_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Hover_mouse {

		
	WebDriver driver;
	
	@Parameters({"username","password"})
	
	@BeforeMethod
	
	public void initialize(String username,String password) {
		
		System.out.println("Before Test");
		System.setProperty("webdriver.chrome.driver", "../Testngproject/Browser Drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://training.openspan.com/login");
		driver.findElement(By.id("user_name")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("login_button")).click();
						
		
	}
	
	@Test
	
	public void click_on_Beverages() {
		
		//Mousehoverover
		
		WebElement Products = driver.findElement(By.linkText("Products"));
		Actions action = new Actions(driver);
		action.moveToElement(Products).build().perform();
		driver.findElement(By.linkText("Beverages")).click();
	    System.out.println("Products");
	    
	    
		

	}

	/*
	 * @Test
	 * 
	 * public void click_on_orders() {
	 * 
	 * 
	 * driver.findElement(By.linkText("Cote de Blaye")).click();
	 * driver.findElement(By.id("login_button")).click();
	 * driver.findElement(By.xpath(
	 * "/html/body/div/div[1]/div[1]/div[2]/div/div[1]/ul/li/a/img")).click();
	 * driver.findElement(By.linkText("Sign Out")).click();
	 * 
	 * 
	 * }
	 */

	@Test
	public void click_on_Stores() {
				
		WebElement OD = driver.findElement(By.linkText("Order"));
		Actions actions = new Actions(driver);
		actions.moveToElement(OD).build().perform();
		driver.findElement(By.linkText("Previous Orders")).click();
		driver.findElement(By.xpath("//img[@alt='Settings']")).click();
		//driver.findElement(By.id("totalBtn")).click();
		driver.findElement(By.linkText("Sign Out")).click();
		
	}
	  
	  @AfterMethod
	  public void teardown() {
	  System.out.println("AfterTest");
	  driver.close();
  }
	
	}


