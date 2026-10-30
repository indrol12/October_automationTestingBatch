package Stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksTest {
	
	@Given("User is ion login page")
	public void user_is_ion_login_page() {
		 System.out.println("on login page");
	}

	@When("user enters valid credentials and clicks login button")
	public void user_enters_valid_credentials_and_clicks_login_button() {
		 System.out.println("entered");
	}

	@Then("Login should be successful")
	public void login_should_be_successful() {
	    System.out.println("success");
	}



}
