package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomepageWebElements {
	
	WebDriver driver; 
	//Webelements for LogOut Function
	
	By Dropdown=By.id("react-burger-menu-btn");
	
	By Logout=By.id("logout_sidebar_link"); 
	
	 //Verify Login button
	By Loginverify=By.id("login-button"); 
	
	
	
	//Constructor
	public HomepageWebElements(WebDriver driver) {
		this.driver=driver; 
	}
 
	
	//PageMethod for Logout Function
	 
	public void selectdropdown() {
		driver.findElement(Dropdown).click(); 
	}
	
	public void clicklogout() {
		driver.findElement(Logout).click(); 
	}
	
	public void verifyloginbutton() {
		Boolean loginvisible=driver.findElement(Loginverify).isDisplayed(); 
		
		if(loginvisible == true) {
			System.out.println("Logout of the application is completed");
		}
		else {
			System.out.println("Login button is not visible");
		}
	 
	}
	
	
	
}
