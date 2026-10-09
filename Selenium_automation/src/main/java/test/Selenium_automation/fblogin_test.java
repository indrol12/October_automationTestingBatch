package test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogin_test {
public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://secure.facebook.com/login/");
	//Locator:ID
	//findout the email textbox	
	driver.findElement(By.id("email")).sendKeys("ajay@gmail.com");
	
	driver.findElement(By.id("pass")).sendKeys("1234556");
	
	driver.findElement(By.id("loginbutton")).click();
	
	//Locator:name
	driver.findElement(By.name("email")).clear();
//	
//  driver.findElement(By.className("_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy")).click();
  //error message should display because both field empty
	
	driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
	
	driver.findElement(By.className("btn")).click();
	//error message should display
	
	
	driver.findElement(By.tagName("input")).sendKeys("pooja");//username
	
	driver.findElement(By.tagName("input")).sendKeys("12345");//password
	
	
	
}
}
