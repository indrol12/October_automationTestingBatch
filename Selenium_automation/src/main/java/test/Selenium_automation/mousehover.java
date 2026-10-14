package test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		WebElement pointmebtn=driver.findElement(By.xpath("//button[text()='Point Me']"));
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(pointmebtn).build().perform();
	}

}
