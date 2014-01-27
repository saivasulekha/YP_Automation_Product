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
import java.util.List;
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
public class A04_IndiaPage  {
	

	// create a WebDriver
	WebDriver driver;
	 
	// use the Firefox browser and go to the wikipedia site
	@BeforeClass
	public void setUp(){
		
		driver = new FirefoxDriver();
		
		// Now set the cookie. 
		Cookie cookie = new Cookie("sulypbuck", "7b418f9f-6");
		driver.manage().addCookie(cookie);
		
		driver.manage().window().maximize();
	    
	}
	 
	// quit from WebDriver
	@AfterClass
	public void tearDown(){
	driver.quit();

	}
	 
	@Test
	public void YellowPage_IndiaPage()throws Exception{
	  {		
		  	//Open the URL
		    driver.get("http://yellowpages.sulekha.com/air-travel-agents");
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Close the pop up window
		    driver.findElement(By.cssSelector("img[alt=\"Close\"]")).click();
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Select value for LCF Type
		    new Select(driver.findElement(By.id("lcfseltype"))).selectByVisibleText("Domestic Air Travel Agents");
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Select value for City
		    new Select(driver.findElement(By.id("lcfselCity"))).selectByVisibleText("Chennai");
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for From city
		    driver.findElement(By.id("lcftxtFromCity")).clear();
		    //Enter value for From city
		    driver.findElement(By.id("lcftxtFromCity")).sendKeys("chennai");
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for To city
		    driver.findElement(By.id("lcftxtToCity")).clear();
		    //Enter value for To city
		    driver.findElement(By.id("lcftxtToCity")).sendKeys("madurai");
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
		    //Click Get Quotes button
		    driver.findElement(By.linkText("Get Quotes")).click();
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		    //Clear value for Code
		    driver.findElement(By.id("lcftxtcode")).clear();
		    //Enter value for Code
		    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click Verify button
		    driver.findElement(By.linkText("Verify")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    // Warning: verifyTextPresent may require manual changes
		  /*  try {
		      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Thank you[\\s\\S]*$"));
		    } catch (Error e) {
		      verificationErrors.append(e.toString());
		    }*/
		    //Click Air Travel link
		    //driver.findElement(By.linkText("Air Travel Agents")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    
		    //Click Contact business button
		    driver.findElement(By.xpath("//div[4]/div[3]/a")).click();
		    //driver.findElement(By.xpath("//a[@onclick='getSendToMobile(\"\",\"anna-salai/travel-air-madras-pvt-ltd.htm\",\"single\",2158032);']")).click();
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Name
		    driver.findElement(By.id("restxtname")).clear();
		    //Enter value for Name
		    driver.findElement(By.id("restxtname")).sendKeys("saivadurai");
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Mobile number
		    driver.findElement(By.id("restxtmobile")).clear();
		    //Enter value for Mobile number
		    driver.findElement(By.id("restxtmobile")).sendKeys("9380835000");
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Comment
		    driver.findElement(By.id("restacomment")).clear();
		    //Enter value for Comment
		    driver.findElement(By.id("restacomment")).sendKeys("chennam testing");
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click send button
		    driver.findElement(By.linkText("Send")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Clear value for Code
		    driver.findElement(By.id("restxtcode")).clear();
		    //Enter value for Code
		    driver.findElement(By.id("restxtcode")).sendKeys("999999");
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click Submit button
		    driver.findElement(By.id("achResponseSubmit")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Close thank you screen
		    driver.findElement(By.cssSelector("a.modal_close > img")).click();
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    //Click save to mobile button
		    driver.findElement(By.xpath("//div[4]/div[2]/a")).click();
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
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click save button
		    driver.findElement(By.linkText("Save")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Clear value for Code
		    driver.findElement(By.id("txtverifycode")).clear();
		    //Enter value for Code
		    driver.findElement(By.id("txtverifycode")).sendKeys("999999");
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    		//Wait for seconds
		    Thread.sleep(3000);
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Close thank you screen
		    //driver.findElement(By.cssSelector("#divthankcall > div > a.modal_close > img")).click();
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    
		    //open the URL
		    driver.get("http://yellowpages.sulekha.com/home-interior-decorators");
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Close pop up window
		   // driver.findElement(By.cssSelector("#btnclose > img")).click();
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Select value for LCF City
		    new Select(driver.findElement(By.id("lcfselCity"))).selectByVisibleText("Chennai");
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Select value for Zone
		    new Select(driver.findElement(By.id("lcfselzone"))).selectByVisibleText("South Chennai");
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
		    //Click Get Quotes button
		    driver.findElement(By.linkText("Get Quotes")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Clear value for Code
		    driver.findElement(By.id("lcftxtcode")).clear();
		    //Enter value for Code
		    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click verify Link
		    driver.findElement(By.linkText("Verify")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    // Warning: verifyTextPresent may require manual changes
		   /* try {
		      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Thank you[\\s\\S]*$"));
		    } catch (Error e) {
		      verificationErrors.append(e.toString());
		    }*/
		    //Click Home Interior link
		    //driver.findElement(By.linkText("Interior Designers & Decorators")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Click Contact business button
		    //driver.findElement(By.xpath("//div[@id='listingtabcontent']/div/div[4]/a[2]/span/span[1]")).click();
		    driver.findElement(By.xpath("//div[4]/div[3]/a")).click();
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Name
		    driver.findElement(By.id("restxtname")).clear();
		    //Enter value for Name
		    driver.findElement(By.id("restxtname")).sendKeys("saivadurai");
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Mobile number
		    driver.findElement(By.id("restxtmobile")).clear();
		    //Enter value for Mobile number
		    driver.findElement(By.id("restxtmobile")).sendKeys("9380835000");
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Comment
		    driver.findElement(By.id("restacomment")).clear();
		    //Enter value for Comment
		    driver.findElement(By.id("restacomment")).sendKeys("chennam testing");
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click Send button
		    driver.findElement(By.linkText("Send")).click();
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Code
		    driver.findElement(By.id("restxtcode")).clear();
		    //Enter value for Code
		    driver.findElement(By.id("restxtcode")).sendKeys("999999");
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click submit button
		    driver.findElement(By.id("achResponseSubmit")).click();
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Close thank you screen
		    driver.findElement(By.cssSelector("a.modal_close > img")).click();
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click save to mobile button
		     driver.findElement(By.xpath("//div[4]/div[2]/a")).click();
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
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Close thank you screen
		    driver.findElement(By.cssSelector("#divthankcall > div > a.modal_close > img")).click();
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    //Open the URL
		    driver.get("http://yellowpages.sulekha.com/office-interior-decorators");
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click LCF Type
		    driver.findElement(By.id("lcfseltypewithrelcats")).click();
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Select value for City
		    new Select(driver.findElement(By.id("lcfselCity"))).selectByVisibleText("Chennai");
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Select value for Zone
		    new Select(driver.findElement(By.id("lcfselzone"))).selectByVisibleText("South Chennai");
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
		    //Enter value for Moblie number
		    driver.findElement(By.id("lcftxtmobile")).sendKeys("9380835000");
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    		//Click Get Quotes button
		    driver.findElement(By.linkText("Get Quotes")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Clear value for Code
		    driver.findElement(By.id("lcftxtcode")).clear();
		    //Enter value for code
		    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
    		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click Verify button
		    driver.findElement(By.linkText("Verify")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    // Warning: verifyTextPresent may require manual changes
		  /*  try {
		      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Thank you[\\s\\S]*$"));
		    } catch (Error e) {
		      verificationErrors.append(e.toString());
		    }*/
		    //Click Office interior Link
		    //driver.findElement(By.linkText("Office Interior Decorators")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Click Contact business button
		    //driver.findElement(By.xpath("//div[@id='listingtabcontent']/div/div[4]/a[2]/span/span[1]")).click();
		    driver.findElement(By.xpath("//div[4]/div[3]/a")).click();
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Name
		    driver.findElement(By.id("restxtname")).clear();
		    //Enter value for Name
		    driver.findElement(By.id("restxtname")).sendKeys("saivadurai");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Mobile number
		    driver.findElement(By.id("restxtmobile")).clear();
		    //Enter value for Mobile number
		    driver.findElement(By.id("restxtmobile")).sendKeys("9380835000");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for comment
		    driver.findElement(By.id("restacomment")).clear();
		    //Enter value for comment
		    driver.findElement(By.id("restacomment")).sendKeys("chennam testing");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click send button
		    driver.findElement(By.linkText("Send")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Clear value for Code
		    driver.findElement(By.id("restxtcode")).clear();
		    //Enter value for Code
		    driver.findElement(By.id("restxtcode")).sendKeys("999999");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click Submit button
		    driver.findElement(By.id("achResponseSubmit")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Close thank you screen
		    driver.findElement(By.cssSelector("a.modal_close > img")).click();
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click Save to mobile button
		     driver.findElement(By.xpath("//div[4]/div[2]/a")).click();
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
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click Save button
		    driver.findElement(By.linkText("Save")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
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
		    //Close thank you screen
		    driver.findElement(By.cssSelector("#divthankcall > div > a.modal_close > img")).click();
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    
		    //Open the URL
		    driver.get("http://yellowpages.sulekha.com/modular-kitchen");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Close thank you screen
		    //driver.findElement(By.cssSelector("#btnclose > img")).click();
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click the attribute
		    driver.findElement(By.name("kitchsize")).click();
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click tha attribute
		    driver.findElement(By.name("budget")).click();
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
		    //Clear value for City
		    driver.findElement(By.id("txtcity")).clear();
		    //Enter value for City
		    driver.findElement(By.id("txtcity")).sendKeys("chennai");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Additional info
		    driver.findElement(By.id("txtadditional")).clear();
		    //Enter value for Additional info
		    driver.findElement(By.id("txtadditional")).sendKeys("chennam testing");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click Get Response button
		    driver.findElement(By.linkText("Get Responses")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Clear value for Code
		    driver.findElement(By.id("lcftxtcode")).clear();
		    //Enter value for Code
		    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click verify button
		    driver.findElement(By.linkText("Verify")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    // Warning: verifyTextPresent may require manual changes
		  /*  try {
		      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Thank you[\\s\\S]*$"));
		    } catch (Error e) {
		      verificationErrors.append(e.toString());
		    }*/
	  		//Wait for seconds
		    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click Modular kitchen link
		    //driver.findElement(By.linkText("Modular Kitchens")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Click Contact business button
		    //driver.findElement(By.xpath("//div[@id='listingtabcontent']/div/div[4]/a[2]/span/span[1]")).click();
		    driver.findElement(By.xpath("//div[4]/div[3]/a")).click();
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Name
		    driver.findElement(By.id("restxtname")).clear();
		    //Enter value for Name
		    driver.findElement(By.id("restxtname")).sendKeys("saivadurai");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Mobile number
		    driver.findElement(By.id("restxtmobile")).clear();
		    //Enter value for Mobile number
		    driver.findElement(By.id("restxtmobile")).sendKeys("9380835000");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Comment
		    driver.findElement(By.id("restacomment")).clear();
		    //Enter value for Comment
		    driver.findElement(By.id("restacomment")).sendKeys("chennam testing");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click Send button
		    driver.findElement(By.linkText("Send")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Clear valuie for Code
		    driver.findElement(By.id("restxtcode")).clear();
		    //Enter value for Code
		    driver.findElement(By.id("restxtcode")).sendKeys("999999");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click submit button
		    driver.findElement(By.id("achResponseSubmit")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Close thank you screen
		    driver.findElement(By.cssSelector("a.modal_close > img")).click();
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click Save to mobile button
		     driver.findElement(By.xpath("//div[4]/div[2]/a")).click();
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear valeu for Name
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
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click save button
		    driver.findElement(By.linkText("Save")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
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
		    //Close thank you screen
		    driver.findElement(By.cssSelector("#divthankcall > div > a.modal_close > img")).click();
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    
		    //Open the URL
		    driver.get("http://yellowpages.sulekha.com/computer-amc-services");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Close the pop up window
		    //driver.findElement(By.cssSelector("#btnclose > img")).click();
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Select value for City
		    new Select(driver.findElement(By.id("lcfselCity"))).selectByVisibleText("Chennai");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Select value for Zone 
		    new Select(driver.findElement(By.id("lcfselzone"))).selectByVisibleText("South Chennai");
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
		    //Click Get Quotes button
		    driver.findElement(By.linkText("Get Quotes")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Clear value for Code
		    driver.findElement(By.id("lcftxtcode")).clear();
		    //Enter value for Code
		    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click Verify button
		    driver.findElement(By.linkText("Verify")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    // Warning: verifyTextPresent may require manual changes
		 /*   try {
		      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Thank you[\\s\\S]*$"));
		    } catch (Error e) {
		      verificationErrors.append(e.toString());
		    }*/
		    //Click Computer AMC link
		    //driver.findElement(By.linkText("Computer AMC Services")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Click save to mobile button
		    //driver.findElement(By.xpath("//div[@id='listingtabcontent']/div/div[4]/a[2]/span/span[1]")).click();
		    driver.findElement(By.xpath("//div[4]/div[3]/a")).click();
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Name
		    driver.findElement(By.id("restxtname")).clear();
		    //Enter vlaue for Name
		    driver.findElement(By.id("restxtname")).sendKeys("saivadurai");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Mobile number
		    driver.findElement(By.id("restxtmobile")).clear();
		    //Enter value for Mobile number
		    driver.findElement(By.id("restxtmobile")).sendKeys("9380835000");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Comment
		    driver.findElement(By.id("restacomment")).clear();
		    //Enter value for Comment
		    driver.findElement(By.id("restacomment")).sendKeys("chennam testing");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click Send button
		    driver.findElement(By.linkText("Send")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Clear value for Code
		    driver.findElement(By.id("restxtcode")).clear();
		    //Enter value for Code
		    driver.findElement(By.id("restxtcode")).sendKeys("999999");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click submit button
		    driver.findElement(By.id("achResponseSubmit")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Close thank you screen
		    driver.findElement(By.cssSelector("a.modal_close > img")).click();
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click Save to mobile button
		     driver.findElement(By.xpath("//div[4]/div[2]/a")).click();
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
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click save button
		    driver.findElement(By.linkText("Save")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Clear value for Code
		    driver.findElement(By.id("txtverifycode")).clear();
		    //Enter value for Code
		    driver.findElement(By.id("txtverifycode")).sendKeys("999999");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click Verify Button
		    driver.findElement(By.linkText("Verify")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Close thank you screen
		    driver.findElement(By.cssSelector("#divthankcall > div > a.modal_close > img")).click();
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    
		    //Open The URL
		    driver.get("http://yellowpages.sulekha.com/ac-dealers");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Close thank you screen
		    //driver.findElement(By.cssSelector("#btnclose > img")).click();
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Select value for LCF Type
		    new Select(driver.findElement(By.id("lcfseltype"))).selectByVisibleText("AC AMC Services");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Select value for City
		    new Select(driver.findElement(By.id("lcfselCity"))).selectByVisibleText("Chennai");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Select value for Zone
		    new Select(driver.findElement(By.id("lcfselzone"))).selectByVisibleText("South Chennai");
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
		    //Click Get Quotes button
		    driver.findElement(By.linkText("Get Quotes")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Clear value for Code
		    driver.findElement(By.id("lcftxtcode")).clear();
		    //Enter value for Code
		    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click verify button
		    driver.findElement(By.linkText("Verify")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    // Warning: verifyTextPresent may require manual changes
		 /*   try {
		      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Thank you[\\s\\S]*$"));
		    } catch (Error e) {
		      verificationErrors.append(e.toString());
		    }*/
		    //Click AC link
		    //driver.findElement(By.linkText("AC")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Click Contact business button
		    //driver.findElement(By.xpath("//div[@id='listingtabcontent']/div/div[4]/a[2]/span/span[1]")).click();
		    driver.findElement(By.xpath("//div[4]/div[3]/a")).click();
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Name
		    driver.findElement(By.id("restxtname")).clear();
		    //Enter value for Name
		    driver.findElement(By.id("restxtname")).sendKeys("saivadurai");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Mobile number
		    driver.findElement(By.id("restxtmobile")).clear();
		    //Enter value for Mobile number
		    driver.findElement(By.id("restxtmobile")).sendKeys("9380835000");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Comment
		    driver.findElement(By.id("restacomment")).clear();
		    //Enter value for Comment 
		    driver.findElement(By.id("restacomment")).sendKeys("chennam testing");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click Send button
		    driver.findElement(By.linkText("Send")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Clear value for Code
		    driver.findElement(By.id("restxtcode")).clear();
		    //Enter value for Code
		    driver.findElement(By.id("restxtcode")).sendKeys("999999");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click submit button
		    driver.findElement(By.id("achResponseSubmit")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Close thank you screen
		    driver.findElement(By.cssSelector("a.modal_close > img")).click();
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click save to mobile button
		     driver.findElement(By.xpath("//div[4]/div[2]/a")).click();
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
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click save button
		    driver.findElement(By.linkText("Save")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
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
		    //Close thank you screen 
		    driver.findElement(By.cssSelector("#divthankcall > div > a.modal_close > img")).click();
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    
		    //Open the URL
		    driver.get("http://yellowpages.sulekha.com/packers-and-movers");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Close pop up window
		    //driver.findElement(By.cssSelector("#btnclose > img")).click();
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Select value for wait for city
		    new Select(driver.findElement(By.id("lcfseltype"))).selectByVisibleText("Within City Packers and Movers");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Select value for City
		    new Select(driver.findElement(By.id("lcfselCity"))).selectByVisibleText("Chennai");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Select value for Zone
		   // new Select(driver.findElement(By.id("lcfselzone"))).selectByVisibleText("South Chennai");
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
		    //Click Get Quotes Button
		    driver.findElement(By.linkText("Get Quotes")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Clear value for Code
		    driver.findElement(By.id("lcftxtcode")).clear();
		    //Ente value for Code
		    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click Verify button
		    driver.findElement(By.linkText("Verify")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    // Warning: verifyTextPresent may require manual changes
		   /* try {
		      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Thank you[\\s\\S]*$"));
		    } catch (Error e) {
		      verificationErrors.append(e.toString());
		    }*/
		    //Click Packer and movers link
		    //driver.findElement(By.linkText("Packers and Movers")).click();
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click Contact business button
		    //driver.findElement(By.xpath("//div[@id='listingtabcontent']/div/div[4]/a[2]/span/span[1]")).click();
		    driver.findElement(By.xpath("//div[4]/div[3]/a")).click();
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Name
		    driver.findElement(By.id("restxtname")).clear();
		    //Enter value for Name
		    driver.findElement(By.id("restxtname")).sendKeys("saivadurai");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Mobile number
		    driver.findElement(By.id("restxtmobile")).clear();
		    //Enter value for Mobile number
		    driver.findElement(By.id("restxtmobile")).sendKeys("9380835000");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Comment 
		    driver.findElement(By.id("restacomment")).clear();
		    //Enter value for Comment 
		    driver.findElement(By.id("restacomment")).sendKeys("chennam testing");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click Send button
		    driver.findElement(By.linkText("Send")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Clear value for Code
		    driver.findElement(By.id("restxtcode")).clear();
		    //Enter value for Code
		    driver.findElement(By.id("restxtcode")).sendKeys("999999");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click submit button
		    driver.findElement(By.id("achResponseSubmit")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Close thank you screen
		    driver.findElement(By.cssSelector("a.modal_close > img")).click();
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click save to mobile button
		     driver.findElement(By.xpath("//div[4]/div[2]/a")).click();
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
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click save button
		    driver.findElement(By.linkText("Save")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Clear value for Code
		    driver.findElement(By.id("txtverifycode")).clear();
		    //Enter value for Code
		    driver.findElement(By.id("txtverifycode")).sendKeys("999999");
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click verify button
		    driver.findElement(By.linkText("Verify")).click();
    		//Wait for seconds
		    Thread.sleep(3000);
		    //Close thank you screen
		    driver.findElement(By.cssSelector("#divthankcall > div > a.modal_close > img")).click();
	  		//Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		  }

	}    

	
}
