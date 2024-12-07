package steps;

import org.openqa.selenium.WebDriver;

import common.Base;
import common.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegistrationPage;

public class RegistrationStep extends Base {

	WebDriver driver = Hooks.driver ;
	RegistrationPage rp = new RegistrationPage(driver);

	@Given("user is on registration page")
	public void user_is_on_registration_page() {

		rp.createAccoutn();
	}

	@When("user enters firstname {string}")
	public void user_enters_firstname(String firstname) {
	
			rp.firstname(firstname);
		}

	

	@And("enters lastname {string}")
	public void user_enters_lastname(String lastname) {
		
			rp.lastname(lastname);
		}

	

	@And("user enters email {string}")
	public void user_enters_email(String email) {
		
			rp.email(email);
		}


	@And("enters password {string}")
	public void user_enters_password(String password) {
		
			rp.password(password);
		}


	@And("enters confirm password {string}")
	public void user_confirms_password(String password) {
		
			rp.confirmPassword(password);
		}

	@And("^hits submit$")
	public void user_hits_create_account_button() {

		rp.submit();
	}

	@Then("^a confirm registration message is displayed$")
	public void a_confirm_registration_message_is_displayed() {
		
		rp.validation();

	}



}
