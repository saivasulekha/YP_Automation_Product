package WD_YP_Ecl;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.sql.Driver;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.hamcrest.core.IsEqual;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;



@SuppressWarnings("unused")
public class A03_ListingPage {
  @Test
public void Parameterization_ListingPage() throws InterruptedException, BiffException, Exception {
		//Excel Input Files 
		String filename="D:\\YP_LCF\\Parameterization_LCF.xls";
		
		//Get workbook 
		Workbook wk=Workbook.getWorkbook(new File(filename));
		
		//Get Sheet
		Sheet sh=wk.getSheet(0);
		
	    
	    //Loop for Untill Row Ends
		for(int i=1;i<sh.getRows();i++)
		{
			WebDriver driver = new FirefoxDriver();
			
/*			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
*/			
			//Work book sheet 
			Sheet sheet=wk.getSheet(0);
		
			//Import data for input
			Hashtable<String, String> input = importdata(sheet,i);

			//Maximize the browser
			driver.manage().window().maximize();

			
			//Launch Url
		    driver.get(input.get("YPUrls").trim());
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Close css screen
		    driver.findElement(By.cssSelector("img[alt=\"Close\"]")).click();
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Select the LCF type
		    new Select(driver.findElement(By.id(input.get("LCFType")))).selectByVisibleText(input.get("LCFTypeData"));
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    if((input.get("YPUrls").equals("http://yellowpages.sulekha.com/air-travel-agents_chennai"))){	
		    //Clear the from city
		    driver.findElement(By.id(input.get("LCFFrmCity"))).clear();
		    //Enter values for from city
		    driver.findElement(By.id(input.get("LCFFrmCity"))).sendKeys(input.get("LCFFrmCityData"));
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear To city
		    driver.findElement(By.id(input.get("LCFToCity"))).clear();
		    //Enter value for To City
		    driver.findElement(By.id(input.get("LCFToCity"))).sendKeys(input.get("LCFToCityData"));
		    }
		    
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear the comment
		    driver.findElement(By.id(input.get("LCFCmt"))).clear();
		    //Enter value for comment
		    driver.findElement(By.id(input.get("LCFCmt"))).sendKeys(input.get("LCFCmtData"));
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Name
		    driver.findElement(By.id(input.get("LCFName"))).clear();
		    //Enter value for Name
		    driver.findElement(By.id(input.get("LCFName"))).sendKeys(input.get("LCFNameData"));
		    //Wait for Seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Mobile
		    driver.findElement(By.id(input.get("LCFMobile"))).clear();
		    //Enter value for Name
		    driver.findElement(By.id(input.get("LCFMobile"))).sendKeys(input.get("LCFMobileData"));
		    //Wait for Seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Email
		    driver.findElement(By.id(input.get("LCFEmail"))).clear();
		    //Enter value for Email
		    driver.findElement(By.id(input.get("LCFEmail"))).sendKeys(input.get("LCFEmailData"));
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click Getquotes button
		    driver.findElement(By.linkText("Get Quotes")).click();
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		    //Clear verification code
		    driver.findElement(By.id(input.get("LCFCode"))).clear();
		    //Enter verification code
		    driver.findElement(By.id(input.get("LCFCode"))).sendKeys(input.get("LCFCodeData"));
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click verify link
		    driver.findElement(By.linkText("Verify")).click();
		   
		    //Wait for seconds
		    Thread.sleep(5000);
		    //Click Contact business button
		    driver.findElement(By.xpath(input.get("ContactBusiness"))).click();
		    //driver.findElement(By.xpath("//*[@id='listingtabcontent']/div[1]/div[3]/div[2]/a")).click();
		    //Wait for seconds
		    Thread.sleep(5000);
		    //Clear value for Name 
		    driver.findElement(By.id(input.get("CBTxtName"))).clear();
		    //Enter value for Name
		    driver.findElement(By.id(input.get("CBTxtName"))).sendKeys(input.get("CBTxtNameData"));
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for email
		    driver.findElement(By.id(input.get("CBTxtEmail"))).clear();
		    //Enter value for email
		    driver.findElement(By.id(input.get("CBTxtEmail"))).sendKeys(input.get("CBTxtEmailData"));
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for mobile number
		    driver.findElement(By.id(input.get("CBTxtMobile"))).clear();
		    //Enter value for mobile number
		    driver.findElement(By.id(input.get("CBTxtMobile"))).sendKeys(input.get("CBTxtMobileData"));
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for comments
		    driver.findElement(By.id(input.get("CBTxtCmt"))).clear();
		    //Enter value for comments
		    driver.findElement(By.id(input.get("CBTxtCmt"))).sendKeys(input.get("CBTxtCmtData"));
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click send button
		    driver.findElement(By.linkText("Send")).click();
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		    //Clear value for code
		    driver.findElement(By.id(input.get("CBTxtCode"))).clear();
		    //Enter value for code
		    driver.findElement(By.id(input.get("CBTxtCode"))).sendKeys(input.get("CBTxtCodeData"));
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		    //Click submit button
		    driver.findElement(By.id("achResponseSubmit")).click();
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Close the pop up window
		    driver.findElement(By.cssSelector("a.modal_close > img")).click();
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		    //Click Save to mobile
		    driver.findElement(By.xpath(input.get("SavetoMobile"))).click();
		    //driver.findElement(By.xpath("//*[@id='listingtabcontent']/div[1]/div[3]/div[2]/a[2]")).click();
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for name
		    driver.findElement(By.id(input.get("SMTxtName"))).clear();
		    //Enter value for name
		    driver.findElement(By.id(input.get("SMTxtName"))).sendKeys(input.get("SMTxtNameData"));
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for mobile number
		    driver.findElement(By.id(input.get("SMTxtMobile"))).clear();
		    //Enter value for mobile number
		    driver.findElement(By.id(input.get("SMTxtMobile"))).sendKeys(input.get("SMTxtMobileData"));
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Email
		    driver.findElement(By.id(input.get("SMTxtEmail"))).clear();
		    //Enter value for Email
		    driver.findElement(By.id(input.get("SMTxtEmail"))).sendKeys(input.get("SMTxtEmailData"));
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click the Save button.
		    driver.findElement(By.linkText("Save")).click();
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear verify code
		    driver.findElement(By.id(input.get("SMTxtCode"))).clear();
		    //Enter verify code
		    driver.findElement(By.id(input.get("SMTxtCode"))).sendKeys(input.get("SMTxtCodeData"));
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click verify link
		    driver.findElement(By.linkText("Verify")).click();
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		    //Close thank you message
		    driver.findElement(By.cssSelector("#divthankcall > div > a.modal_close > img")).click();
		    
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    //Click Get Best Quotes
		    driver.findElement(By.linkText(input.get("GetBestQuotes"))).click();
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		    //Select the frame
		    driver.switchTo().frame("frmlcf");
		    
		    //Wait for seconds
		    Thread.sleep(3000);
		    
		    //Select the LCF type
		    new Select(driver.findElement(By.id(input.get("LCFType")))).selectByVisibleText(input.get("LCFTypeData"));
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear the from city
		    driver.findElement(By.id(input.get("LCFFrmCity"))).clear();
		    //Enter values for from city
		    driver.findElement(By.id(input.get("LCFFrmCity"))).sendKeys(input.get("LCFFrmCityData"));
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear To city
		    driver.findElement(By.id(input.get("LCFToCity"))).clear();
		    //Enter value for To City
		    driver.findElement(By.id(input.get("LCFToCity"))).sendKeys(input.get("LCFToCityData"));
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear the comment
		    driver.findElement(By.id(input.get("LCFCmt"))).clear();
		    //Enter value for comment
		    driver.findElement(By.id(input.get("LCFCmt"))).sendKeys(input.get("LCFCmtData"));
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Name
		    driver.findElement(By.id(input.get("LCFName"))).clear();
		    //Enter value for Name
		    driver.findElement(By.id(input.get("LCFName"))).sendKeys(input.get("LCFNameData"));
		    //Wait for Seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Mobile
		    driver.findElement(By.id(input.get("LCFMobile"))).clear();
		    //Enter value for Name
		    driver.findElement(By.id(input.get("LCFMobile"))).sendKeys(input.get("LCFMobileData"));
		    //Wait for Seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Clear value for Email
		    driver.findElement(By.id(input.get("LCFFrmCity"))).clear();
		    //Enter value for Email
		    driver.findElement(By.id(input.get("LCFFrmCity"))).sendKeys(input.get("LCFFrmCityData"));
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click Getquotes button
		    driver.findElement(By.linkText("Get Best Quotes")).click();
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		    //Clear verification code
		    driver.findElement(By.id(input.get("LCFCode"))).clear();
		    //Enter verification code
		    driver.findElement(By.id(input.get("LCFCode"))).sendKeys(input.get("LCFCodeData"));
		    //Wait for seconds
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Click verify link
		    driver.findElement(By.linkText("Verify")).click();

		    //Wait for seconds
		    driver.manage().timeouts ().implicitlyWait(30, TimeUnit.SECONDS);
		    //Close the browser
		    driver.close();    
		}				
					   
		//System.out.println("MMP_HomeAppliances_Successfully_Executed");
		
	}

		@Test
		public static Hashtable<String, String> importdata(Sheet objsheet,int rownum){ 
	    Hashtable<String, String> htable = new Hashtable<String, String>();
	    for (int data=0;data<objsheet.getColumns();data++){
	            htable.put(objsheet.getCell(data, 0).getContents(),objsheet.getCell(data, rownum).getContents());
	    }
	    return htable;
		}

  

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
