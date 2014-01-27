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
public class A05_KeywordPage  {
	

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
	//driver.quit();

	}
	 
	@Test
	public void YellowPage_KeywordPage()throws Exception{
		
		driver.get("http://yellowpages.sulekha.com/air-ticket-booking_bangalore_contacts");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfseltype"))).selectByVisibleText("Domestic Air Travel Agents");
	    driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtFromCity")).clear();
	    driver.findElement(By.id("lcftxtFromCity")).sendKeys("bangalore");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtToCity")).clear();
	    driver.findElement(By.id("lcftxtToCity")).sendKeys("chennai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftacomment")).clear();
	    driver.findElement(By.id("lcftacomment")).sendKeys("chennam testing");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtname")).clear();
	    driver.findElement(By.id("lcftxtname")).sendKeys("saivadurai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtmobile")).clear();
	    driver.findElement(By.id("lcftxtmobile")).sendKeys("9380835000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Get Quotes")).click();
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtcode")).clear();
	    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.findElement(By.cssSelector("img[alt=\"Close\"]")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Air Ticket Booking in Bangalore")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[contains(@href, '#divreqcallpopup')]")).click();
	    //driver.findElement(By.xpath("//div[@id='listingtabcontent']/div[2]/div[4]/div[3]/a")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restxtname")).clear();
	    driver.findElement(By.id("restxtname")).sendKeys("saivadurai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restxtmobile")).clear();
	    driver.findElement(By.id("restxtmobile")).sendKeys("9380835000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restacomment")).clear();
	    driver.findElement(By.id("restacomment")).sendKeys("chennam testing");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Send")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restxtcode")).clear();
	    driver.findElement(By.id("restxtcode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("achResponseSubmit")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("a.modal_close > img")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.navigate().refresh();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[contains(@href, '#divsendtoph')]")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtname")).clear();
	    driver.findElement(By.id("txtname")).sendKeys("saivadurai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtmobile")).clear();
	    driver.findElement(By.id("txtmobile")).sendKeys("9380835000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Save")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtverifycode")).clear();
	    driver.findElement(By.id("txtverifycode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("#divthankcall > div > a.modal_close > img")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Get Best Quotes")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //Select the frame
	    driver.switchTo().frame("frmlcf");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfseltype"))).selectByVisibleText("Domestic Air Travel Agents");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtFromCity")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtFromCity")).clear();
	    driver.findElement(By.id("lcftxtFromCity")).sendKeys("bangalore");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtToCity")).clear();
	    driver.findElement(By.id("lcftxtToCity")).sendKeys("chennai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftacomment")).clear();
	    driver.findElement(By.id("lcftacomment")).sendKeys("chennam testing");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtname")).clear();
	    driver.findElement(By.id("lcftxtname")).sendKeys("saivadurai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtmobile")).clear();
	    driver.findElement(By.id("lcftxtmobile")).sendKeys("9380835000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Get Best Quotes")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtcode")).clear();
	    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	/*  //Close the browser
	    driver.close();    
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	*/    
	    //Launch Browser

	    //driver = new FirefoxDriver();
	    //Maximize the Browser
		driver.manage().window().maximize();
	    
	    
	    driver.get("http://yellowpages.sulekha.com/bedroom-interior-design_mumbai_contacts");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("mkoh")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtOther")).clear();
	    driver.findElement(By.id("txtOther")).sendKeys("Chennam Testing");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtcity")).clear();
	    driver.findElement(By.id("txtcity")).sendKeys("Chennai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtname")).clear();
	    driver.findElement(By.id("lcftxtname")).sendKeys("Chennam Testing");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtmobile")).clear();
	    driver.findElement(By.id("lcftxtmobile")).sendKeys("9380835000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtadditional")).clear();
	    driver.findElement(By.id("txtadditional")).sendKeys("Chennam Testing");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Get Responses")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtcode")).clear();
	    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    
	    driver.findElement(By.linkText("Bedroom Interior Design in Mumbai")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[contains(@href, '#divreqcallpopup')]")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restxtname")).clear();
	    driver.findElement(By.id("restxtname")).sendKeys("saivadurai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restxtmobile")).clear();
	    driver.findElement(By.id("restxtmobile")).sendKeys("9380835000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restacomment")).clear();
	    driver.findElement(By.id("restacomment")).sendKeys("chennam testing");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Send")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restxtcode")).clear();
	    driver.findElement(By.id("restxtcode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("achResponseSubmit")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("a.modal_close > img")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//a[contains(@href, '#divsendtoph')]")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtname")).clear();
	    driver.findElement(By.id("txtname")).sendKeys("saivadurai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtmobile")).clear();
	    driver.findElement(By.id("txtmobile")).sendKeys("9380835000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Save")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtverifycode")).clear();
	    driver.findElement(By.id("txtverifycode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("#divthankcall > div > a.modal_close > img")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Get Best Quotes")).click();
	    //Select the frame
	    driver.switchTo().frame("frmlcf");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfseltype"))).selectByVisibleText("Home Interior Designers");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftacomment")).clear();
	    driver.findElement(By.id("lcftacomment")).sendKeys("chennam testing");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtname")).clear();
	    driver.findElement(By.id("lcftxtname")).sendKeys("saivadurai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtmobile")).clear();
	    driver.findElement(By.id("lcftxtmobile")).sendKeys("9380835000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfselzone"))).selectByVisibleText("South Mumbai");
	    driver.findElement(By.linkText("Get Best Quotes")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtcode")).clear();
	    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	/*    //Close the browser
	    driver.close();    
	    //Wait for seconds
	    Thread.sleep(3000);
	*/    
	    //Launch Browser
	    //driver = new FirefoxDriver();
	    
	    //Maximize the Browser
		//driver.manage().window().maximize();
	    
	    driver.get("http://yellowpages.sulekha.com/showroom-interiors_chennai_contacts");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.name("designerfor")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtname")).clear();
	    driver.findElement(By.id("lcftxtname")).sendKeys("saivadurai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtmobile")).clear();
	    driver.findElement(By.id("lcftxtmobile")).sendKeys("9380835000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtadditional")).clear();
	    driver.findElement(By.id("txtadditional")).sendKeys("chennam testing");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Get Responses")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtcode")).clear();
	    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	    
	    driver.findElement(By.linkText("Showroom Interiors in Chennai")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[contains(@href, '#divreqcallpopup')]")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restxtname")).clear();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restxtname")).sendKeys("saivadurai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restxtmobile")).clear();
	    driver.findElement(By.id("restxtmobile")).sendKeys("9380835000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restacomment")).clear();
	    driver.findElement(By.id("restacomment")).sendKeys("chennam testing");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Send")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restxtcode")).clear();
	    driver.findElement(By.id("restxtcode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("achResponseSubmit")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("a.modal_close > img")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[contains(@href, '#divsendtoph')]")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtname")).clear();
	    driver.findElement(By.id("txtname")).sendKeys("saivadurai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtmobile")).clear();
	    driver.findElement(By.id("txtmobile")).sendKeys("9380835000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Save")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtverifycode")).clear();
	    driver.findElement(By.id("txtverifycode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("#divthankcall > div > a.modal_close > img")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Get Best Quotes")).click();
	    //Select the frame
	    driver.switchTo().frame("frmlcf");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfseltype"))).selectByVisibleText("Office Interior Designers");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftacomment")).clear();
	    driver.findElement(By.id("lcftacomment")).sendKeys("chennam testing");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtname")).clear();
	    driver.findElement(By.id("lcftxtname")).sendKeys("saivadurai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtmobile")).clear();
	    driver.findElement(By.id("lcftxtmobile")).sendKeys("9380835000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfselzone"))).selectByVisibleText("South Chennai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Get Best Quotes")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtcode")).clear();
	    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	/*    //Close the browser
	    driver.close();    
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	*/    
	    //Launch Browser
	    //driver = new FirefoxDriver();
	    //Maximize the Browser
		driver.manage().window().maximize();
	    

	    driver.get("http://yellowpages.sulekha.com/modular-kitchen-cost_mumbai_contacts");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("#turnon > img")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("spmk")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("comk")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.name("kitchsize")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.name("budget")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtname")).clear();
	    driver.findElement(By.id("lcftxtname")).sendKeys("saivadurai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtmobile")).clear();
	    driver.findElement(By.id("lcftxtmobile")).sendKeys("9380835000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtadditional")).clear();
	    driver.findElement(By.id("txtadditional")).sendKeys("chennam testing");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Get Responses")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtcode")).clear();
	    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	    driver.findElement(By.linkText("Modular Kitchen Cost in Mumbai")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[contains(@href, '#divreqcallpopup')]")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restxtname")).clear();
	    driver.findElement(By.id("restxtname")).sendKeys("saivadurai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restxtmobile")).clear();
	    driver.findElement(By.id("restxtmobile")).sendKeys("9380835000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restacomment")).clear();
	    driver.findElement(By.id("restacomment")).sendKeys("chennam testing");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Send")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restxtcode")).clear();
	    driver.findElement(By.id("restxtcode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("achResponseSubmit")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("a.modal_close > img")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[contains(@href, '#divsendtoph')]")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtname")).clear();
	    driver.findElement(By.id("txtname")).sendKeys("saivadurai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtmobile")).clear();
	    driver.findElement(By.id("txtmobile")).sendKeys("9380835000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Save")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtverifycode")).clear();
	    driver.findElement(By.id("txtverifycode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("#divthankcall > div > a.modal_close > img")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Get Best Quotes")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //Select the frame
	    driver.switchTo().frame("frmlcf");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftacomment")).sendKeys("chennam testing");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtname")).clear();
	    driver.findElement(By.id("lcftxtname")).sendKeys("saivadurai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtmobile")).clear();
	    driver.findElement(By.id("lcftxtmobile")).sendKeys("9380835000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfselzone"))).selectByVisibleText("South Mumbai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Get Best Quotes")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtcode")).clear();
	    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  	    
	/*    //Close the browser
	    driver.close();    
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    //Launch Browser
	    //driver = new FirefoxDriver();
	    //Maximize the Browser
		driver.manage().window().maximize();
	*/    

	    driver.get("http://yellowpages.sulekha.com/computer-contract-services_contacts");
	    //driver.findElement(By.cssSelector("img[alt=\"Close\"]")).click();

	    //Wait for Seconds
	    Thread.sleep(3000);
	    
	    new Select(driver.findElement(By.id("lcfseltype"))).selectByVisibleText("Computer AMC Services");

	    //Wait for Seconds
	    Thread.sleep(3000);
	    
	    driver.findElement(By.id("txtcity")).sendKeys("Mumbai");
	    //new Select(driver.findElement(By.id("lcfselCity"))).selectByVisibleText("Mumbai");

	    //Wait for Seconds
	    //Thread.sleep(3000);
	    
	    //new Select(driver.findElement(By.id("lcfselzone"))).selectByVisibleText("South Mumbai");
	    
	    //Wait for Seconds
	    Thread.sleep(3000);
	    
	    driver.findElement(By.id("lcftacomment")).clear();
	    driver.findElement(By.id("lcftacomment")).sendKeys("chennam testing");
	    driver.findElement(By.id("lcftxtname")).clear();
	    driver.findElement(By.id("lcftxtname")).sendKeys("saivadurai");
	    driver.findElement(By.id("lcftxtmobile")).clear();
	    driver.findElement(By.id("lcftxtmobile")).sendKeys("9380835000");
	    
	    //Wait for Seconds
	    Thread.sleep(3000);
	    
	    driver.findElement(By.linkText("Get Quotes")).click();
	    
	    //Wait for Seconds
	    Thread.sleep(3000);
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtcode")).clear();
	    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	    
	    driver.findElement(By.linkText("Computer Contract Services")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[contains(@href, '#divreqcallpopup')]")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restxtname")).clear();
	    driver.findElement(By.id("restxtname")).sendKeys("saivadurai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restxtmobile")).clear();
	    driver.findElement(By.id("restxtmobile")).sendKeys("9380835000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restacomment")).clear();
	    driver.findElement(By.id("restacomment")).sendKeys("chennam testing");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Send")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restxtcode")).clear();
	    driver.findElement(By.id("restxtcode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("achResponseSubmit")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("a.modal_close > img")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[contains(@href, '#divsendtoph')]")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtname")).clear();
	    driver.findElement(By.id("txtname")).sendKeys("saivadurai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtmobile")).clear();
	    driver.findElement(By.id("txtmobile")).sendKeys("9380835000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Save")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtverifycode")).clear();
	    driver.findElement(By.id("txtverifycode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("#divthankcall > div > a.modal_close > img")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Get Best Quotes")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //Select the frame
	    driver.switchTo().frame("frmlcf");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfseltype"))).selectByVisibleText("Computer AMC Services");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftacomment")).clear();
	    driver.findElement(By.id("lcftacomment")).sendKeys("chennam testing");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtname")).clear();
	    driver.findElement(By.id("lcftxtname")).sendKeys("saivadurai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtmobile")).clear();
	    driver.findElement(By.id("lcftxtmobile")).sendKeys("9380835000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfselCity"))).selectByVisibleText("Mumbai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfselzone"))).selectByVisibleText("South Mumbai");
	    driver.findElement(By.linkText("Get Best Quotes")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtcode")).clear();
	    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
/*	    //Close the browser
	    driver.close();    
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    //Launch Browser
	    //driver = new FirefoxDriver();
	    //Maximize the Browser
		driver.manage().window().maximize();
	    
*/
	    /*driver.get("http://yellowpages.sulekha.com/ac-rental-price_chennai_contacts");
	    
	    //Wait for seconds
	    Thread.sleep(3000);
	        
	    driver.findElement(By.cssSelector("#turnon > img")).click();
	    
	    //Wait for seconds
	    Thread.sleep(3000);
	    
	    new Select(driver.findElement(By.id("lcfattr_605_0_0"))).selectByVisibleText("rent AC");
	    
	    //Wait for seconds
	    Thread.sleep(3000);
	    
	    driver.findElement(By.id("lcfattr_605_0_9")).click();
	    
	    //Wait for seconds
	    Thread.sleep(3000);
	    
	    new Select(driver.findElement(By.id("lcfattr_605_0_9"))).selectByVisibleText("1.5 ton");
	    
	    //Wait for seconds
	    Thread.sleep(3000);
	    
	    new Select(driver.findElement(By.id("lcfattr_605_0_10"))).selectByVisibleText("split AC");
	    
	    //Wait for seconds
	    Thread.sleep(3000);
	    
	    new Select(driver.findElement(By.id("lcfselCity"))).selectByVisibleText("Chennai");
	    
	    //Wait for seconds
	    Thread.sleep(3000);
	    
	    new Select(driver.findElement(By.id("lcfselzone"))).selectByVisibleText("South Chennai");
	    driver.findElement(By.id("lcftxtname")).clear();
	    driver.findElement(By.id("lcftxtname")).sendKeys("saivadurai");
	    
	    //Wait for seconds
	    Thread.sleep(3000);
	    
	    driver.findElement(By.id("lcftxtmobile")).clear();
	    driver.findElement(By.id("lcftxtmobile")).sendKeys("9380835000");
	    
	    //Wait for seconds
	    Thread.sleep(3000);
	    
	    driver.findElement(By.cssSelector("a.evpush.GAQ_F_PLCF2SM")).click();
	    
	    driver.findElement(By.id("lcftxtcode")).clear();
	    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
	    
	    driver.findElement(By.cssSelector("a.evpush.GAQ_C_LCF3-SUBMIT3 > img")).click();
	    
	    //Wait for seconds
	    Thread.sleep(3000);
	    
	    // Warning: verifyTextPresent may require manual changes
	    try {
	      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Thank you[\\s\\S]*$"));
	    } catch (Error e) {
	      verificationErrors.append(e.toString());
	    }
	    driver.findElement(By.linkText("AC Rental Price in Chennai")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//div[@id='listingtabcontent']/div[2]/div[4]/div[3]/a")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restxtname")).clear();
	    driver.findElement(By.id("restxtname")).sendKeys("saivadurai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restxtmobile")).clear();
	    driver.findElement(By.id("restxtmobile")).sendKeys("9380835000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restacomment")).clear();
	    driver.findElement(By.id("restacomment")).sendKeys("chennam testing");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Send")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restxtcode")).clear();
	    driver.findElement(By.id("restxtcode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("achResponseSubmit")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("a.modal_close > img")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//div[@id='listingtabcontent']/div[2]/div[4]/div[3]/a[2]")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtname")).clear();
	    driver.findElement(By.id("txtname")).sendKeys("saivadurai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtmobile")).clear();
	    driver.findElement(By.id("txtmobile")).sendKeys("9380835000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Save")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtverifycode")).clear();
	    driver.findElement(By.id("txtverifycode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("#divthankcall > div > a.modal_close > img")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Get Best Quotes")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //Select the frame
	    driver.switchTo().frame("frmlcf");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   	    new Select(driver.findElement(By.id("lcfseltype"))).selectByVisibleText("AC AMC Services");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftacomment")).clear();
	    driver.findElement(By.id("lcftacomment")).sendKeys("chennam testing");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtname")).clear();
	    driver.findElement(By.id("lcftxtname")).sendKeys("saivadurai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtmobile")).clear();
	    driver.findElement(By.id("lcftxtmobile")).sendKeys("93808350000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfselzone"))).selectByVisibleText("South Chennai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Get Best Quotes")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtcode")).clear();
	    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    //Close the browser
	    driver.close();    
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    //Launch Browser
	    driver = new FirefoxDriver();
	    //Maximize the Browser
		driver.manage().window().maximize();
	    */
		
	    driver.get("http://yellowpages.sulekha.com/moving-services_mumbai_contacts");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("img[alt=\"Close\"]")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfseltype"))).selectByVisibleText("Within City Packers and Movers");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfselzone"))).selectByVisibleText("South Mumbai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftacomment")).clear();
	    driver.findElement(By.id("lcftacomment")).sendKeys("chennam testing");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtname")).clear();
	    driver.findElement(By.id("lcftxtname")).sendKeys("saivadurai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtmobile")).clear();
	    driver.findElement(By.id("lcftxtmobile")).sendKeys("9380835000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Get Quotes")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtcode")).clear();
	    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    // Warning: verifyTextPresent may require manual changes
	   /* try {
	      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Thank you[\\s\\S]*$"));
	    } catch (Error e) {
	      verificationErrors.append(e.toString());
	    }*/
	    driver.findElement(By.linkText("Moving Services in Mumbai")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[contains(@href, '#divreqcallpopup')]")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restxtname")).clear();
	    driver.findElement(By.id("restxtname")).sendKeys("saivadurai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restxtmobile")).clear();
	    driver.findElement(By.id("restxtmobile")).sendKeys("9380835000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restacomment")).clear();
	    driver.findElement(By.id("restacomment")).sendKeys("chennam tetsting");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Send")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("restxtcode")).clear();
	    driver.findElement(By.id("restxtcode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("achResponseSubmit")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("a.modal_close > img")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[contains(@href, '#divsendtoph')]")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtname")).clear();
	    driver.findElement(By.id("txtname")).sendKeys("saivadurai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtmobile")).clear();
	    driver.findElement(By.id("txtmobile")).sendKeys("9380835000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Save")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtverifycode")).clear();
	    driver.findElement(By.id("txtverifycode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("#divthankcall > div > a.modal_close > img")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Get Best Quotes")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //Select the frame
	    driver.switchTo().frame("frmlcf");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfseltype"))).selectByVisibleText("Car Carriers");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftacomment")).clear();
	    driver.findElement(By.id("lcftacomment")).sendKeys("chennam testing");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtname")).clear();
	    driver.findElement(By.id("lcftxtname")).sendKeys("saivadurai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtmobile")).clear();
	    driver.findElement(By.id("lcftxtmobile")).sendKeys("9380835000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfselzone"))).selectByVisibleText("South Mumbai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Get Best Quotes")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtcode")).clear();
	    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.close();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   		
		}
	}    

	

