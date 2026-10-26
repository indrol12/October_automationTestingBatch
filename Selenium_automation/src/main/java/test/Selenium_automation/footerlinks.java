package test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class footerlinks {
public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
				
				driver.get("https://testautomationpractice.blogspot.com/");
				
				//footerlinks
				
				driver.findElement(By.linkText("Hidden Elements & AJAX")).click();
				
				driver.navigate().back();
			}
}
