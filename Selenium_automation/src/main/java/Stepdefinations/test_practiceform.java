package Stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test_practiceform {

	@Given("practice form should launch")
	public void launch()
    {
		System.out.println("Launch practice form");
		}
	@When("enter name,surname and email")
	public void enterdata()
    {
		System.out.println(" enter data");
		}
	@Then("name,surname and email should inserted successfully")
	public void  verifyinserted_data()
    {
		System.out.println("verify data inserted successfully");
		}
}
