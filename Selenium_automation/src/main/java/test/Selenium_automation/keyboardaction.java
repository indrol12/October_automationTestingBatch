package test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class keyboardaction {
//driver object
	//launch google
	//webelement refv
	//refv.sendkeys(Keys.Enter)
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");		
		WebElement search=driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));		
		search.sendKeys("Mobile");
		//enter
		search.sendKeys(Keys.ENTER);
		
		//copy paste
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		
		WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstname.sendKeys("Gauri");
		
		//select firstname
		firstname.sendKeys(Keys.CONTROL+"A");
		
		//copy firstname
		firstname.sendKeys(Keys.CONTROL+"C");
		
		WebElement lastname=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		
		//paste firstname in lastname
		lastname.sendKeys(Keys.CONTROL+"V");
	}
}
