package WD_YP_Ecl;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
 

public class A10_AllSearch{
              
	public static WebDriver driver = new FirefoxDriver();      
      @Test(enabled=false)         
	public void searchfunction(String url,String id,String Id2, String keys, String display_value) throws Exception{
    	 
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id(id)).clear();
		driver.findElement(By.id(id)).sendKeys(keys);
		Thread.sleep(2000);
		//String Data = driver.findElement(By.xpath(Id2)).getText();
		//System.out.println(Data);
		if (driver.findElement(By.xpath(Id2)).isDisplayed())
		{
			System.out.println(display_value+ " Search is working");
		}
		else
		{
			driver.get("http://ypv2.sulekha.com/sendsms.aspx?mobileno=9962552141&message1="+display_value+" Search Not Working. Please check it immediately");// Yogesh
			driver.get("http://ypv2.sulekha.com/sendsms.aspx?mobileno=9840985909&message1="+display_value+" Search Not Working. Please check it immediately");// Chennam
			//driver.get("http://ypv2.sulekha.com/sendsms.aspx?mobileno=9500072189&message1="+display_value+" Search Not Working. Please check it immediately");// Malyadri
			driver.get("http://ypv2.sulekha.com/sendsms.aspx?mobileno=8056340638&message1="+display_value+" Search Not Working. Please check it immediately");// Saivadurai
			System.out.println("SEARCH NOT WORKING IN "+display_value);
			Assert.fail("SEARCH NOT WORKING IN "+display_value);
		}
		//driver.close();
	}

    @BeforeTest
    public void beforemethod(){
     //  	driver =      
    }
    
	@Test   
	public void Search_Yellowpages () throws Exception {
	    searchfunction("http://yellowpages.sulekha.com/", "sul_gblsearchi","//*[@id='frmSearch']/div/div/div[1]/div[2]/ul","1 BHK","SulekhaYP");    
	}
	
	/**@Test(enabled=false)   
	public void SearchReliabilityAndAvailabilityinproperty() throws Exception {
        searchfunction("http://property.sulekha.com/", "sul_gblsearchi","//html/body/ul", "House for","SulekhaProperty");
	} 
	@Test(enabled=false)   
	public void SearchReliabilityAndAvailabilityinRentals() throws Exception {
	    searchfunction("http://rentals.sulekha.com/", "sul_gblsearchi","//html/body/ul[3]","1 BHK","SulekhaRentals");	
	} 
	@Test(enabled=false)   
	public void SearchReliabilityAndAvailabilityinSulekhaMobiles() throws Exception {
		searchfunction("http://mobiles.sulekha.com", "iSrcTxt","//*[@id='cse-search-box']/div/ul", "Nokia","SulekhaMobiles");	
	}                                                           
	@Test(enabled=false)   
	public void SearchReliabilityAndAvailabilityinSulekhamovies() throws Exception {
		searchfunction("http://movies.sulekha.com", "SearchInput","//*[@id='ui-id-1']", "Theatres","SulekhaMovies");	
	}*/
    
    /**@Test
	public void SearchReliabilityAndAvailabilityinSulekhaHomePage() throws Exception {
	    searchfunction("http://sulekha.com/chennai", "SearchInput","//*[@id='ui-id-1']", "1 BHK","Sulekha");	
	}*/
    
    @AfterSuite
    public void quit()
    {
    	driver.close();
    }
	
}
