package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMTestcases {
	WebDriver driver; 
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Testing/Automation/DataLinkSampleProject/UpdateDrivers/chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); 
		
		driver=new ChromeDriver(options);   
		driver.get("https://www.saucedemo.com/");   

	}
	
	
	@Test
	public void TestLogin() throws Exception {
		//Login with valid username and password
		POMWebElements pom=new POMWebElements(driver);
		pom.enterusername("standard_user");
		pom.enterpassword("secret_sauce");
		pom.clicklogin();   
		
		//Logout in the Homepage
		HomepageWebElements pomlogout=new HomepageWebElements(driver); 
		pomlogout.selectdropdown();
		Thread.sleep(5000); 
		pomlogout.clicklogout(); 
		Thread.sleep(5000); 

		
		//Login button verify after logout functionality
		pomlogout.verifyloginbutton(); 
		Thread.sleep(5000); 

		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit(); 
	}

}
