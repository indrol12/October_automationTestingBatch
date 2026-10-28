package Stepdefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test_orangehrmlogin {
	EdgeDriver driver;
	@Given("Launch orangehrm website")
	public void launch_orangehrm_website() {
	  driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("enter username as {string} also enter password as {string}")
	public void enter_username_as_also_enter_password_as(String uname, String pass) {
	    driver.findElement(By.name("username")).sendKeys(uname);
	    driver.findElement(By.name("password")).sendKeys(pass);
	}
	
	@And("click on login button of orangehrm website")
	public void clicklogin()
	{
		driver.findElement(By.tagName("button")).click();
	}

	@Then("orangehrm Login should be successfull")
	public void orangehrm_login_should_be_successfull() {
	  System.out.println("after login dashboard Url is:"+driver.getCurrentUrl());
	  driver.quit();
	}


}
