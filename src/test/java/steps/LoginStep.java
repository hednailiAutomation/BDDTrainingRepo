package steps;

import org.openqa.selenium.WebDriver;

import common.Base;
import common.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStep  extends Base {
	
	WebDriver driver = Hooks.driver;
	LoginPage lp = new LoginPage(driver);
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		lp.login();	
	}
	
	@When("user enters email{string}")
	public void enters_email(String email) {
		
		lp.email(email);
	}
	
	@And("enters password{string}")
	public void enters_password(String password) {
		
		lp.password(password);
	}
	
	@And("hits login button")
	public void hits_login_button() {
		
		lp.signin();
	}
	
	@Then("his is navigated to account page")
	public void  his_is_navigated_to_account_page() {
		
		
	}
	
	
	

}
