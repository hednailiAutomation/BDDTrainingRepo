package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver =driver;
	}
	
	By btn_login = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");
	By txt_email = By.xpath("//form[@class='form form-login']/descendant::input[@id='email']");
	By txt_password = By.xpath("//form[@class='form form-login']/descendant::input[@id='pass']");
	By btn_signin = By.xpath("//form[@id='login-form']/descendant::button[@class='action login primary']");
	By btn_Account = By.className("logged-in"); 
	public void login() {
		
		driver.findElement(btn_login).click();
	}
	
	public void email(String email) {
		
		driver.findElement(txt_email).sendKeys(email);
	}
	
	public void password(String password) {
		
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void signin() {
		
		driver.findElement(btn_signin).click();
	}
	
	public void validateLogin() {
		
		Assert.assertTrue(driver.findElement(btn_Account).isDisplayed());
	}
	

}
