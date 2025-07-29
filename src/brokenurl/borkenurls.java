package brokenurl;


import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
//import java.net.URL;
//import java.net.MalformedURLException;
//import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class borkenurls {
	
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException{
		
       System.setProperty("webdriver.chrome.driver", "../Testngproject/Browser Drivers/chromedriver.exe");
       
       WebDriver driver =new ChromeDriver();
       
       driver.get("https://www.hyrtutorials.com/");
       Thread.sleep(5000);
       
       
      List<WebElement> links=driver.findElements(By.tagName("a"));
      
      System.out.println(links.size());
      
      for(WebElement link : links) {
    	  
    	  String linkURL = link.getAttribute("href");
    	  
    	  try {
    	s	    @SuppressWarnings("deprecation")
			   URL url = new URL(linkURL);
    		   URLConnection urlconnect = url.openConnection();
    		  HttpURLConnection httpURLConnection =(HttpURLConnection) httpURLConnection;
    		  httpURLConnection.setConnectTimeout(5000);
    		  httpURLConnection.connect();
    		   
    		    
    	  
    	  }  
      }
		
	}


