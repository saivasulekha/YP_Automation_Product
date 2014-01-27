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
public class A08_FreePage  {
	

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
	public void YellowPage_FreePage()throws Exception{
		
		//Open the URL
		driver.get("http://yellowpages.sulekha.com/chennai/escape-cinemas-royapettah-chennai_contact-address");
		//Wait for seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Click save to mobile
	    //driver.findElement(By.xpath("//a[@id='savetomobile']")).click();
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //Clear value for Name
	    driver.findElement(By.id("txtname")).clear();
	    //Enter value for Name
	    driver.findElement(By.id("txtname")).sendKeys("saivadurai");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //Clear value for Mobile number
	    driver.findElement(By.id("txtmobile")).clear();
	    //Enter value for Mobile number
	    driver.findElement(By.id("txtmobile")).sendKeys("9380835000");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    //Click save button
	    driver.findElement(By.linkText("Save")).click();
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //Clear value for Code
	    driver.findElement(By.id("txtverifycode")).clear();
	    //Enter value for Code
	    driver.findElement(By.id("txtverifycode")).sendKeys("999999");
		//Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //Click Verify button
	    driver.findElement(By.linkText("Verify")).click();
		//Wait for seconds
	    Thread.sleep(3000);
	    //Close the Browser
	    driver.close();
		
		}
	}    

	

