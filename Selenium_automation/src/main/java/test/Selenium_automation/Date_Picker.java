package test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Date_Picker {

	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		//DAte picker one
		driver.findElement(By.id("datepicker")).sendKeys("05/23/2026");
		
		
		//Datepicker two
		//driver.findElement(By.xpath("//a[text()='11']")).click();
		
		//Date picker three
		driver.findElement(By.id("start-date")).sendKeys("11-07-2020");

		driver.findElement(By.id("end-date")).sendKeys("10-31-2021");

		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		
	}

}
