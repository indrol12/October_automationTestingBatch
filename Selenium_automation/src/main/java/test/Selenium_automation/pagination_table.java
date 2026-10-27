package test.Selenium_automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pagination_table {
public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
				
				driver.get("https://testautomationpractice.blogspot.com/");
				
				//pagination table
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
				By tablelLocator= By.cssSelector("table#productTable");
				wait.until(d -> d.findElement(tablelLocator).isDisplayed());
				
				for(int  page =1;page <=4;page++) {
					
					System.out.println("testing  page"+page);
					
				 By pageButton = By.xpath("//ul[contains(@class,'pagination')]");
				 driver.findElement(pageButton).click();
				 // WebElement table = wait.until(n
				 List<WebElement>rows = driver.findElements(By.xpath("//tbody/tr"));
				 
				 for(int r=1;r<rows.size();r++) {
				
					WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
					 System.out.println(checkbox.getText());
					if(!checkbox.isSelected())
					 {
						 checkbox.click();
					 }
					 
				 }
				 System.out.println("page"+ page + "testing completed");
				 
				 }
				wait.until(d-> false);
			}
}
