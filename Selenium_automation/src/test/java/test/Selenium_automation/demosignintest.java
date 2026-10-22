package test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class demosignintest {
	static ChromeDriver driver;
	@Test(groups= {"smoke"})
	void demolaunch()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/SignIn.html");
	}
	@Test
	void entercredentials()
	{
	driver.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys("pavan@gmail.com");
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("pavan@123");
	}
	@Test
	static void pressbutton()
	{
		driver.findElement(By.id("enterbtn")).click();
	}
}
