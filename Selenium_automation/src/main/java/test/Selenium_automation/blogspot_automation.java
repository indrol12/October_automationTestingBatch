package test.Selenium_automation;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class blogspot_automation {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter Name')]")).sendKeys("Mayuri");
	
		//1:cssSelector=tagname[attribute='value']
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("mayuri@gmail.com");
		
		//2.cssselector=tagname#idvalue
//		driver.findElement(By.cssSelector("input#phone")).sendKeys("9087654321");
//		
//		//3.cssselector=tagname
//		driver.findElement(By.cssSelector("textarea")).sendKeys("mg road camp pune 1");
//		
//		//4.cssselector=tagname[attribute='value' and  attribute='value']
//		driver.findElement(By.cssSelector("input[name='gender'][id='female']")).click();
//		
//		
//		
//		//handling multiple webelements
//		
//		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
//		
//		Iterator<WebElement> it=checkboxes.iterator();
//	
//		while(it.hasNext())
//		{
//			WebElement check=it.next();//sunday monday
//	        check.click();//clicked on sunday clicked
//	        Thread.sleep(1000);
//		}
//		
		
		
		
		//select class=used to handle dropdown
		
		Select sel=new Select(driver.findElement(By.id("country")));
		
		sel.selectByVisibleText("India");
		Thread.sleep(1000);
		sel.selectByIndex(2);
		Thread.sleep(1000);
		sel.selectByValue("brazil");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
