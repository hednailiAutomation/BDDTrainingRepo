package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class RegistrationPage {
	
	WebDriver driver;
	
	public RegistrationPage(WebDriver driver) {
	
	this.driver= driver ;
	}
	
	By btn_createAccount = By.linkText("Create an Account");
	By txt_firstname = By.xpath("//form[@class='form create account form-create-account']/descendant::input[@id='firstname']");
	By txt_lastname = By.xpath("//form[@class='form create account form-create-account']/descendant::input[@id='lastname']");
	By txt_email = By.xpath("//form[@class='form create account form-create-account']/descendant::input[@id='email_address']");
	By txt_password = By.xpath("//form[@class='form create account form-create-account']/descendant::input[@id='password']");
	By txt_passwordConfirm = By.xpath("//form[@class='form create account form-create-account']/descendant::input[@name='password_confirmation']");
	By btn_Submit = By.xpath("//form[@class='form create account form-create-account']/descendant::button[@class='action submit primary']");
	By validation_message = By.xpath("//*[@id='maincontent']/div[1]/div[2]/div/div");

	public void createAccoutn() {
		
		driver.findElement(btn_createAccount).click();
	}
	
	public void firstname(String firstname) {
		
		driver.findElement(txt_firstname).sendKeys(firstname);
	}
	
	public void lastname(String lastname) {
		
		driver.findElement(txt_lastname).sendKeys(lastname);
	}
	
	public void email(String email) {
		
		driver.findElement(txt_email).sendKeys(email);
	}
	
	public void password(String password) {
		
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void confirmPassword(String password) {
		
		driver.findElement(txt_passwordConfirm).sendKeys(password);
	}
	
	public void submit() {
		
		driver.findElement(btn_Submit).click();
	}
	
	public void validation() {
		
		Assert.assertEquals(driver.findElement(validation_message).getText(),"Thank you for registering with Main Website Store.");
	}
}
