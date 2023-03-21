package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMWebElements {
	
	public static WebDriver driver; 
	//Login Webelements for Testproject
	
	By username=By.id("user-name");
	
	By password=By.id("password");
	
	By login=By.id("login-button");
	
	
	 
	//Constructor to call the webelements
	public POMWebElements(WebDriver driver) {
		this.driver=driver; 
	}
	
	
	//PageMethods
	
	public void enterusername(String Uname) {
		driver.findElement(username).sendKeys(Uname); 
	}
	
	
	public void enterpassword(String Pwd) {
		driver.findElement(password).sendKeys(Pwd); 
	}
	
	public void clicklogin() {
		driver.findElement(login).click(); 
	}
	
	

}
