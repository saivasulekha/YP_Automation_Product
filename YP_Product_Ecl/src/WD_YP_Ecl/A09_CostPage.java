package WD_YP_Ecl;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
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
public class A09_CostPage  {
	

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
	
/*
	FirefoxProfile profile = new FirefoxProfile();
	profile.setPreference("general.useragent.override", "sulekha.test.agent");
	WebDriver driver = new FirefoxDriver(profile);
	
*/	}
	 
	// quit from WebDriver
	@AfterClass
	public void tearDown(){
	driver.quit();

	}
	 
	@Test
	public void YellowPage_CostPage()throws Exception{
		
		//Open the URL
		driver.get("http://yellowpages.sulekha.com/packers-and-movers_cost");
		//Wait for seconds
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		//Select value for Domestic travels
	    new Select(driver.findElement(By.id("typeDiv"))).selectByVisibleText("Within India Packers and Movers");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //Select value for From City
	    new Select(driver.findElement(By.id("costselCity"))).selectByVisibleText("Chennai");
		//Wait for seconds
	    Thread.sleep(4000);
	    //driver.findElement(By.id("txt_domestic-packers-and-movers_9")).clear();
	    //driver.findElement(By.id("txt_domestic-packers-and-movers_9")).sendKeys("Madurai");
	    //Select value for To City
	    driver.findElement(By.xpath("//div[2]/div[2]/div/input")).sendKeys("Madurai");
		//Wait for seconds
	    Thread.sleep(4000);
	    //Press Tab Key
	    driver.findElement(By.id("txt_domestic-packers-and-movers_9")).sendKeys(Keys.TAB);
		//Wait for seconds
	    Thread.sleep(4000);
	    //Click submit button
	    driver.findElement(By.id("submit")).click();
	    //driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		//Wait for seconds
	    Thread.sleep(4000);
	    //Click Get Best Quotes button
	    driver.findElement(By.linkText("Get Best Quotes")).click();
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //Select the frame
	    driver.switchTo().frame("frmlcf");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //Selecr value for Within City
	    new Select(driver.findElement(By.id("lcfseltype"))).selectByVisibleText("Within City Packers and Movers");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //Clear value for Comment 
	    driver.findElement(By.id("lcftacomment")).clear();
	    //Enter value for Comment
	    driver.findElement(By.id("lcftacomment")).sendKeys("chennam testing");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //Clear value for Name
	    driver.findElement(By.id("lcftxtname")).clear();
	    //Enter value for Name
	    driver.findElement(By.id("lcftxtname")).sendKeys("saivadurai");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //Clear value for Mobile number
	    driver.findElement(By.id("lcftxtmobile")).clear();
	    //Enter value for Mobile number
	    driver.findElement(By.id("lcftxtmobile")).sendKeys("9380835000");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //Select value for City
	    new Select(driver.findElement(By.id("lcfselCity"))).selectByVisibleText("Chennai");
		//Wait for seconds
	    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //Select value for Zone
	    //new Select(driver.findElement(By.id("lcfselzone"))).selectByVisibleText("Central Chennai");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //Click Get Best Quotes Button
	    driver.findElement(By.linkText("Get Best Quotes")).click();
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //Clear valeu for Code
	    driver.findElement(By.id("lcftxtcode")).clear();
	    //Enter value for Code
	    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //Click Verify button
	    driver.findElement(By.linkText("Verify")).click();
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //Close the Browser
	    driver.close();
		
		}
	}    

	

