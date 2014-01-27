package WD_YP_Ecl;

import com.thoughtworks.selenium.*;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YP_Results {
	

	@SuppressWarnings("unused")
	private Selenium selenium;

	@BeforeMethod
	public void setUp() throws Exception {
		//selenium = new DefaultSelenium("localhost", 4444, "*firefox","http://yellowpages.sulekha.com/");
		// selenium.addCustomRequestHeader("User-Agent", "sulekha.test.agent");
		//selenium.start();
	}

	
	private static final String JavaMail = null;
	
	@Test
	public void YellowPageResults() throws Exception {
		
		JavaMail javamailobject = new JavaMail();
		javamailobject.main("Send Mail",JavaMail);
		
		//System.out.println("Automation Results");

	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		//selenium.stop();
		
	}

}
