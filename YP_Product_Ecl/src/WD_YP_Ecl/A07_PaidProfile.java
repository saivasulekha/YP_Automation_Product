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
public class A07_PaidProfile  {
	

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
	public void YellowPage_PaidProfile()throws Exception{
		
		//Open the URL
		driver.get("http://yellowpages.sulekha.com/delhi/zee-computers-malviya-nagar-delhi_contact-address");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Proceed")).click();
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfseltype"))).selectByVisibleText("Laptop");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfselzone"))).selectByVisibleText("South Delhi");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftacomment")).clear();
	    driver.findElement(By.id("lcftacomment")).sendKeys("Chennam Testing");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtname")).clear();
	    driver.findElement(By.id("lcftxtname")).sendKeys("Chennam testing");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtmobile")).clear();
	    driver.findElement(By.id("lcftxtmobile")).sendKeys("9380835000");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtemail")).clear();
	    driver.findElement(By.id("lcftxtemail")).sendKeys("");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Get Quotes")).click();
		//Wait for seconds
	    Thread.sleep(3000);
	    driver.findElement(By.id("lcftxtcode")).clear();
	    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
		//Wait for seconds
	    Thread.sleep(3000);
	    
	    //Contact Business
	    driver.findElement(By.xpath("//input[@id='enqrestxtname']")).clear();
	    driver.findElement(By.xpath("//input[@id='enqrestxtname']")).sendKeys("Chennam");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@id='enqrestxtmobile']")).clear();
	    driver.findElement(By.xpath("//input[@id='enqrestxtmobile']")).sendKeys("9380835000");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//textarea[@id='enqrestacomment']")).clear();
	    driver.findElement(By.xpath("//textarea[@id='enqrestacomment']")).sendKeys("Chennam Testing");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[@onclick=\"javascript:fnRESValidationenq('186');\"]")).click();
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@id='enqrestxtcode']")).clear();
	    driver.findElement(By.xpath("//input[@id='enqrestxtcode']")).sendKeys("999999");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[@id='enqachResponseSubmit']")).click();
		//Wait for seconds
	    Thread.sleep(3000);
	
	    
	    //Save to Mobile 
	    driver.findElement(By.xpath("//a[@id='savetomobile']")).click();
	    //driver.findElement(By.xpath("//a[@id='selbuspopup']")).click();
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@id='txtname']")).clear();
	    driver.findElement(By.xpath("//input[@id='txtname']")).sendKeys("Chennam");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@id='txtmobile']")).clear();
	    driver.findElement(By.xpath("//input[@id='txtmobile']")).sendKeys("9380835000");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@id='txtemail']")).clear();
	    driver.findElement(By.xpath("//input[@id='txtemail']")).sendKeys("");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[@onclick='return fnSendViaSMS();']")).click();
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@id='txtverifycode']")).clear();
	    driver.findElement(By.xpath("//input[@id='txtverifycode']")).sendKeys("999999");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("(//a[@onclick='return fnSendViaSMS();'])[2]")).click();
	    driver.findElement(By.cssSelector("#divthankcall > div > a.modal_close > img")).click();
	 
	    //Close the Browser
	    driver.close();
		}
	}    

	

