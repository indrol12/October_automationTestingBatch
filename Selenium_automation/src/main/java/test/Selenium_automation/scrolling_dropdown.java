package test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class scrolling_dropdown {
public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
				
				driver.get("https://testautomationpractice.blogspot.com/");
				
			driver.findElement(By.id("comboBox")).click();
			WebElement item = driver.findElement(By.xpath("//div[@id='dropdown']//div[text()='Item 5']"));
			item.click();
}

}
