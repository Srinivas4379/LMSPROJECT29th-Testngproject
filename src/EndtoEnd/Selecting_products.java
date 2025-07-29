package EndtoEnd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selecting_products {

	
	WebDriver driver;
	
	@BeforeTest
	
	public void initialize() {
		
		System.setProperty("webdriver.chrome.driver", "../Testngproject/Browser Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://training.openspan.com/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("admin123");
		driver.findElement(By.id("login_button")).click();
	
	}
	
	@Test
	public void drop_down() {
		
		WebElement dr=driver.findElement(By.id("productType"));
		
		Select select_product=new Select(dr);
		
		List<WebElement> list=select_product.getOptions();
		
	for(WebElement dropdownlist :list) {
		System.out.println(dropdownlist.getText());
	}
		
	WebElement default_Product=select_product.getFirstSelectedOption();
		
	System.out.println(default_Product.getText());
		
	select_product.selectByVisibleText("Seasonings");
	
	
	WebElement dr1=driver.findElement(By.id("productsList"));
	
	Select SP=new Select(dr1);
	
	List<WebElement> L1=SP.getOptions();
	
	for(WebElement dropdownlist : L1) {
		
		System.out.println(dropdownlist.getText());
	}
		
	WebElement SP1=SP.getFirstSelectedOption();
	
	System.out.println(SP1.getText());
	
	SP.selectByVisibleText("Aniseed Syrup");
	
	driver.findElement(By.id("viewButton")).click();
	driver.findElement(By.id("login_button")).click();
	driver.findElement(By.name("edit_your_cart")).click();
	driver.findElement(By.name("next")).click();
	driver.findElement(By.id("bfirst_name")).sendKeys("srinivas");
	driver.findElement(By.id("blast_name")).sendKeys("srinivas");
	driver.findElement(By.id("bstreet_address")).sendKeys("srinivas");
	driver.findElement(By.id("bzip_code")).sendKeys("521180");
	driver.findElement(By.id("barea_code")).sendKeys("020");
	driver.findElement(By.id("bprimary_phone")).sendKeys("90710620369");
	driver.findElement(By.id("next2_button")).click();
	}
	

}
