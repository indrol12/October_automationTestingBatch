package test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class datepicker2 {

	public static void main(String[] args) {
		
EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//datepicker2
		driver.findElement(By.id("txtDate")).click();
		
		WebElement monthdropdown=driver.findElement(By.className("ui-datepicker-month"));
		 Select month=new Select(monthdropdown);
		 month.selectByVisibleText("Jan");
		 
		 WebElement yeardropdown=driver.findElement(By.className("ui-datepicker-year"));
		 Select year=new Select(yeardropdown);
		 year.selectByVisibleText("2025");
		 
		 //select date
		 driver.findElement(By.xpath("//a[text()='14']")).click();
		 
		 
	}
}
