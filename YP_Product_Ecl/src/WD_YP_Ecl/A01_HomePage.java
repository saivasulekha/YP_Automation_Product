package WD_YP_Ecl;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import com.thoughtworks.selenium.Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;


import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.Selenium;



@SuppressWarnings("unused")
public class A01_HomePage  {
	

	// create a WebDriver
	WebDriver driver;
	 
	// use the Firefox browser and go to the wikipedia site
	@BeforeClass
	public void setUp(){

	driver = new FirefoxDriver();
	
	// Now set the cookie. 
	Cookie cookie = new Cookie("sulypbuck", "7b418f9f-6");
	driver.manage().addCookie(cookie);

	//Maximize the Browser
	driver.manage().window().maximize();
	
	/*//Open New Browser in firefox
	WebDriver driver = new FirefoxDriver();
	*/
	/*
	FirefoxProfile profile = new FirefoxProfile();
	profile.setPreference("general.useragent.override", "sulekha.test.agent");
	*/
	
	
	
	}
	 
	// quit from WebDriver
	@AfterClass
	public void tearDown1(){
	//driver.quit();

	}
	 
    @Test
	  public void YellowPage_Homepage() throws Exception {
    		
/*			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
*/
    			
			//Maximize the Browser
			driver.manage().window().maximize();
		
    		//Open Yellow page home page 
    		driver.get("http://yellowpages.sulekha.com/");

    		//Wait for seconds
    		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
    	    
    		driver.findElement(By.id("txtlcfcategoryajax")).sendKeys("pest control services");
    		//Wait for seconds
    		Thread.sleep(3000);
    		driver.findElement(By.id("txtlcfcategoryajax")).sendKeys(Keys.DOWN);
    		driver.findElement(By.id("txtlcfcategoryajax")).sendKeys(Keys.TAB);
    		//Wait for seconds
    		Thread.sleep(4000);
    		
    	    //new Select(driver.findElement(By.id("txtlcfcategoryajax"))).selectByVisibleText("pest control services");
    	    
    	    //driver.findElement(By.id("ui-active-menuitem")).click();
    		driver.findElement(By.id("lcfseltype")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.id("lcfseltype")).sendKeys("Residential Pest Control");
    		driver.findElement(By.id("lcfseltype")).sendKeys(Keys.TAB);
    		//Wait for seconds
    		Thread.sleep(4000);

    		//new Select(driver.findElement(By.id("lcfseltype"))).selectByVisibleText("Residential Pest Control");
    		
    		//Wait for seconds
    		Thread.sleep(3000);

    	    driver.findElement(By.id("txtcity")).clear();
    	    driver.findElement(By.id("txtcity")).sendKeys("Delhi");
    		Thread.sleep(3000);
    		driver.findElement(By.id("txtcity")).sendKeys(Keys.DOWN);
    		driver.findElement(By.id("txtcity")).sendKeys(Keys.TAB);
    		//Wait for seconds
    		Thread.sleep(3000);
    		
    	    new Select(driver.findElement(By.id("lcfselzone"))).selectByVisibleText("South Delhi");

    		//Wait for seconds
    		Thread.sleep(3000);

    	    driver.findElement(By.id("lcftxtname")).clear();
    	    driver.findElement(By.id("lcftxtname")).sendKeys("Chennam Testing");

    	    //Wait for seconds
    		Thread.sleep(3000);
    	    
    		driver.findElement(By.id("lcftxtmobile")).clear();
    	    driver.findElement(By.id("lcftxtmobile")).sendKeys("9380835000");

    	    //Wait for seconds
    		Thread.sleep(3000);

    	    driver.findElement(By.id("lcftacomment")).clear();
    	    driver.findElement(By.id("lcftacomment")).sendKeys("Chennam Testing");
    	    
    		//Wait for seconds
    		Thread.sleep(3000);

    	    driver.findElement(By.id("lcfsubmit")).click();
    	    
    		//Wait for seconds
    		Thread.sleep(3000);

    	    driver.findElement(By.id("lcftxtcode")).clear();
    	    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");

    		//Wait for seconds
    		Thread.sleep(3000);

    	    driver.findElement(By.linkText("Verify")).click();
    	    
    		//Wait for seconds
    	    Thread.sleep(3000);
  
    		driver.quit();
    		
		    }
	}    

	

