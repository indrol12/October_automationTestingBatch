package Stepdefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class opencart_registerandlogin {
EdgeDriver driver;
	@Given("Opencart website should be launched")
	public void opencart_launch()
	{
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
	}
	@When("click on register button on landing page")
	public void click_register()
	{
		driver.findElement(By.linkText("Register")).click();
		System.out.println("Title before Registration :"+driver.getTitle());
	}
	@And("enter username,firstname,lastname")
	public void enter_details()
	{
		driver.findElement(By.name("username")).sendKeys("Lalit#12");
		driver.findElement(By.id("input-firstname")).sendKeys("Lalit");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("patil");
	}
	@And("enter email,country,passsword")
	public void enter_moredetails()
	{
		driver.findElement(By.name("email")).sendKeys("lalit12@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("lalit@123");
	}
	@And("click on Register button")
	public void click_registerbtn()
	{
		driver.findElement(By.xpath("//input[text()='Register']")).click();
		
	}
	@Then("User should create account and register should be successfull")
	public void verifyreg()
	{
		System.out.println("Title after Registration :"+driver.getTitle());
	}
//	@Given("Opencart website should be launched")
//	void launch()
//	{
//		
//	}
//	@When("Click on login button on landing page")
//	void clicklogin()
//	{
//		
//	}
	
}
