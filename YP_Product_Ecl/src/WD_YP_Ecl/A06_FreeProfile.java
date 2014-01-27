package WD_YP_Ecl;

import org.openqa.selenium.By;
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
public class A06_FreeProfile  {
	

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
	public void YellowPage_FreeProfile()throws Exception{
		
		//LCF 
		driver.get("http://yellowpages.sulekha.com/chennai/a-v-thomas-tours-travels-thiruvanmiyur-chennai_contact-address");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("img[alt=\"Close\"]")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfseltype"))).selectByVisibleText("Domestic Air Travel Agents");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtFromCity")).clear();
	    driver.findElement(By.id("lcftxtFromCity")).sendKeys("chennai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtToCity")).clear();
	    driver.findElement(By.id("lcftxtToCity")).sendKeys("madurai");
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
	    driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtcode")).clear();
	    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    //Wait for seconds
	    Thread.sleep(3000);
	    
	    //Contact Business
	    driver.findElement(By.xpath("//input[@id='enqrestxtname']")).clear();
	    driver.findElement(By.xpath("//input[@id='enqrestxtname']")).sendKeys("Chennam Testing");
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
	    driver.findElement(By.xpath("//a[@onclick=\"javascript:fnRESValidationenq('525');\"]")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@id='enqrestxtcode']")).clear();
	    driver.findElement(By.xpath("//input[@id='enqrestxtcode']")).sendKeys("999999");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[@id='enqachResponseSubmit']")).click();
	    //Wait for seconds
	    Thread.sleep(3000);
	    
	    
	    //Save To Mobile
	    driver.findElement(By.xpath("//a[@id='savetomobile']")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtname")).clear();
	    driver.findElement(By.id("txtname")).sendKeys("saivadurai");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtmobile")).clear();
	    driver.findElement(By.id("txtmobile")).sendKeys("9380835000");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Save")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtverifycode")).clear();
	    driver.findElement(By.id("txtverifycode")).sendKeys("999999");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("#divthankcall > div > a.modal_close > img")).click();

	    
	    //LCF
	    driver.get("http://yellowpages.sulekha.com/chennai/st-joseph-decorators-designers-thiruvanmiyur-chennai_contact-address");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("img[alt=\"Close\"]")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfseltypewithrelcats"))).selectByVisibleText("Home Interior Designers");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfselzone"))).selectByVisibleText("South Chennai");
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
	    driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtcode")).clear();
	    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    //Wait for seconds
	    Thread.sleep(3000);
	    
	    //Contact Business
	    driver.findElement(By.xpath("//input[@id='enqrestxtname']")).clear();
	    driver.findElement(By.xpath("//input[@id='enqrestxtname']")).sendKeys("Chennam Testing");
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
	    driver.findElement(By.xpath("//a[@onclick=\"javascript:fnRESValidationenq('1376');\"]")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@id='enqrestxtcode']")).clear();
	    driver.findElement(By.xpath("//input[@id='enqrestxtcode']")).sendKeys("999999");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[@id='enqachResponseSubmit']")).click();
	    //Wait for seconds
	    Thread.sleep(3000);
	    
	    
	    //Save To Mobile
	    driver.findElement(By.xpath("//a[@id='savetomobile']")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtname")).clear();
	    driver.findElement(By.id("txtname")).sendKeys("saivadurai");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtmobile")).clear();
	    driver.findElement(By.id("txtmobile")).sendKeys("9380835000");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Save")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtverifycode")).clear();
	    driver.findElement(By.id("txtverifycode")).sendKeys("999999");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("#divthankcall > div > a.modal_close > img")).click();

	    //LCF
	    driver.get("http://yellowpages.sulekha.com/chennai/3-squarenetwork-interior-decorators-villivakkam-chennai_contact-address");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfseltypewithrelcats"))).selectByVisibleText("Home Interior Designers");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfselzone"))).selectByVisibleText("South Chennai");
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
	    driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtcode")).clear();
	    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    //Wait for seconds
	    Thread.sleep(3000);
	    
	    //Contact Business
	    driver.findElement(By.xpath("//input[@id='enqrestxtname']")).clear();
	    driver.findElement(By.xpath("//input[@id='enqrestxtname']")).sendKeys("Chennam Testing");
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
	    driver.findElement(By.xpath("//a[@onclick=\"javascript:fnRESValidationenq('1376');\"]")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@id='enqrestxtcode']")).clear();
	    driver.findElement(By.xpath("//input[@id='enqrestxtcode']")).sendKeys("999999");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[@id='enqachResponseSubmit']")).click();
	    //Wait for seconds
	    Thread.sleep(3000);
	    
	    
	    //Save To Mobile
	    driver.findElement(By.xpath("//a[@id='savetomobile']")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtname")).clear();
	    driver.findElement(By.id("txtname")).sendKeys("saivadurai");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtmobile")).clear();
	    driver.findElement(By.id("txtmobile")).sendKeys("9380835000");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Save")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtverifycode")).clear();
	    driver.findElement(By.id("txtverifycode")).sendKeys("999999");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("#divthankcall > div > a.modal_close > img")).click();

	    
	    //LCF
	    driver.get("http://yellowpages.sulekha.com/chennai/aaraa-woods-ramapuram-chennai_contact-address");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("#turnon > img")).click();
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
	    driver.findElement(By.id("txtcity")).clear();
	    driver.findElement(By.id("txtcity")).sendKeys("chennai");
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
	    //Wait for seconds
	    Thread.sleep(3000);
	    
	    //Contact Business
	    driver.findElement(By.xpath("//input[@id='enqrestxtname']")).clear();
	    driver.findElement(By.xpath("//input[@id='enqrestxtname']")).sendKeys("Chennam Testing");
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
	    driver.findElement(By.xpath("//a[@onclick=\"javascript:fnRESValidationenq('1378');\"]")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@id='enqrestxtcode']")).clear();
	    driver.findElement(By.xpath("//input[@id='enqrestxtcode']")).sendKeys("999999");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[@id='enqachResponseSubmit']")).click();
	    //Wait for seconds
	    Thread.sleep(3000);
	    
	    
	    //Save To Mobile
	    driver.findElement(By.xpath("//a[@id='savetomobile']")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtname")).clear();
	    driver.findElement(By.id("txtname")).sendKeys("saivadurai");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtmobile")).clear();
	    driver.findElement(By.id("txtmobile")).sendKeys("9380835000");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Save")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtverifycode")).clear();
	    driver.findElement(By.id("txtverifycode")).sendKeys("999999");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("#divthankcall > div > a.modal_close > img")).click();

	    //LCF
	    driver.get("http://yellowpages.sulekha.com/chennai/wintec-enterprises-t-nagar-chennai_contact-address");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("img[alt=\"Close\"]")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfseltype"))).selectByVisibleText("Computer AMC Services");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfselzone"))).selectByVisibleText("South Chennai");
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
	    driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtcode")).clear();
	    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //Wait for seconds
	    Thread.sleep(3000);
	    
	    //Contact Business
	    driver.findElement(By.xpath("//input[@id='enqrestxtname']")).clear();
	    driver.findElement(By.xpath("//input[@id='enqrestxtname']")).sendKeys("Chennam Testing");
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
	    driver.findElement(By.xpath("//a[@onclick=\"javascript:fnRESValidationenq('528');\"]")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@id='enqrestxtcode']")).clear();
	    driver.findElement(By.xpath("//input[@id='enqrestxtcode']")).sendKeys("999999");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[@id='enqachResponseSubmit']")).click();
	    //Wait for seconds
	    Thread.sleep(3000);
	    
	    
	    //Save To Mobile
	    driver.findElement(By.xpath("//a[@id='savetomobile']")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtname")).clear();
	    driver.findElement(By.id("txtname")).sendKeys("saivadurai");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtmobile")).clear();
	    driver.findElement(By.id("txtmobile")).sendKeys("9380835000");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Save")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtverifycode")).clear();
	    driver.findElement(By.id("txtverifycode")).sendKeys("999999");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("#divthankcall > div > a.modal_close > img")).click();

	    //LCF
	    driver.get("http://yellowpages.sulekha.com/chennai/best-aircon-vyasarpadi-chennai_contact-address");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("#turnon > img")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfattr_605_0_0"))).selectByVisibleText("rent AC");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfattr_605_0_9"))).selectByVisibleText("1.5 ton");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfattr_605_0_10"))).selectByVisibleText("split AC");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfselCity"))).selectByVisibleText("Chennai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfselzone"))).selectByVisibleText("South Chennai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtname")).clear();
	    driver.findElement(By.id("lcftxtname")).sendKeys("saivadurai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtmobile")).clear();
	    driver.findElement(By.id("lcftxtmobile")).sendKeys("9380835000");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("a.evpush.GAQ_F_PLCF2SM")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtcode")).clear();
	    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("a.evpush.GAQ_C_LCF3-SUBMIT3")).click();
	    //Wait for seconds
	    Thread.sleep(3000);
	    
	    //Contact Business
	    driver.findElement(By.xpath("//input[@id='enqrestxtname']")).clear();
	    driver.findElement(By.xpath("//input[@id='enqrestxtname']")).sendKeys("Chennam Testing");
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
	    driver.findElement(By.xpath("//a[@onclick=\"javascript:fnRESValidationenq('605');\"]")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@id='enqrestxtcode']")).clear();
	    driver.findElement(By.xpath("//input[@id='enqrestxtcode']")).sendKeys("999999");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[@id='enqachResponseSubmit']")).click();
	    //Wait for seconds
	    Thread.sleep(3000);
	    
	    
	    //Save To Mobile
	    driver.findElement(By.xpath("//a[@id='savetomobile']")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtname")).clear();
	    driver.findElement(By.id("txtname")).sendKeys("saivadurai");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtmobile")).clear();
	    driver.findElement(By.id("txtmobile")).sendKeys("9380835000");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Save")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtverifycode")).clear();
	    driver.findElement(By.id("txtverifycode")).sendKeys("999999");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("#divthankcall > div > a.modal_close > img")).click();

	    //LCF
	    driver.get("http://yellowpages.sulekha.com/chennai/all-india-packers-and-movers-madhavaram-chennai_contact-address");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("img[alt=\"Close\"]")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    new Select(driver.findElement(By.id("lcfseltype"))).selectByVisibleText("Within India Packers and Movers");
	    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //new Select(driver.findElement(By.id("lcfselzone"))).selectByVisibleText("South Chennai");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtToCity")).clear();
	    driver.findElement(By.id("lcftxtToCity")).sendKeys("bangalore");
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
	    driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	    driver.findElement(By.id("lcftxtcode")).clear();
	    driver.findElement(By.id("lcftxtcode")).sendKeys("999999");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //Wait for seconds
	    Thread.sleep(3000);
	    
	    //Contact Business
	    driver.findElement(By.xpath("//input[@id='enqrestxtname']")).clear();
	    driver.findElement(By.xpath("//input[@id='enqrestxtname']")).sendKeys("Chennam Testing");
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
	    driver.findElement(By.xpath("//a[@onclick=\"javascript:fnRESValidationenq('149');\"]")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@id='enqrestxtcode']")).clear();
	    driver.findElement(By.xpath("//input[@id='enqrestxtcode']")).sendKeys("999999");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[@id='enqachResponseSubmit']")).click();
	    //Wait for seconds
	    Thread.sleep(3000);
	    
	    
	    //Save To Mobile
	    driver.findElement(By.xpath("//a[@id='savetomobile']")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtname")).clear();
	    driver.findElement(By.id("txtname")).sendKeys("saivadurai");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtmobile")).clear();
	    driver.findElement(By.id("txtmobile")).sendKeys("9380835000");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Save")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtverifycode")).clear();
	    driver.findElement(By.id("txtverifycode")).sendKeys("999999");
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Verify")).click();
	    //Wait for seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("#divthankcall > div > a.modal_close > img")).click();


	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.close();

		
		}
	}    

	

