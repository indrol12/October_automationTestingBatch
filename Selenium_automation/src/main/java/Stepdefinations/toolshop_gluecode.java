package Stepdefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class toolshop_gluecode {
	EdgeDriver driver;
	@Given("practice software testing should be launch")
	public void practice_software_testing_should_be_launch() {
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://practicesoftwaretesting.com/");
	}

	@When("user navigate to register page,enter firstname ,lastname")
	public void user_navigate_to_register_page_enter_firstname_lastname() {
	   driver.navigate().to("https://practicesoftwaretesting.com/auth/register");
	   driver.findElement(By.id("first_name")).sendKeys("amit");
	   driver.findElement(By.id("last_name")).sendKeys("shah");
	}

	@When("enter date of birth,enter country")
	public void enter_date_of_birth_enter_country() {
	 driver.findElement(By.id("dob")).sendKeys("2002-11-24");
	 Select sel=new Select(driver.findElement(By.id("country")));
	 sel.selectByValue("IN");
	}

	@When("click on register")
	public void click_on_register() {
	   driver.findElement(By.xpath("//button[text()='Register ']")).click();
	}

	@Then("Customer register should be successfull")
	public void customer_register_should_be_successfull() {
		System.out.println("after registration url is:"+driver.getCurrentUrl());
	}
	
	@When("user navigate to login page,enter Email ,Password")
	public void user_navigate_to_login_page_enter_email_password() {
	 driver.navigate().to("https://practicesoftwaretesting.com/auth/login");
	 driver.findElement(By.id("email")).sendKeys("amit@gmail.com");
	 driver.findElement(By.id("password")).sendKeys("amit@123");
	}

	@When("click on login button")
	public void click_on_login_button() {
	   driver.findElement(By.cssSelector("input[value='Login']")).click();
	}

	@Then("Customer login should be successfull")
	public void customer_login_should_be_successfull() {
		System.out.println("after Login url is:"+driver.getCurrentUrl());
	}
}
