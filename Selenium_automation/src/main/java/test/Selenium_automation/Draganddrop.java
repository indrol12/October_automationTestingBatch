package test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//drag
		WebElement  drag= driver.findElement(By.id("draggable"));
		
		//drop
		WebElement drop=driver.findElement(By.id("droppable"));
		
		//Action class
		Actions ac=new Actions(driver);
		ac.dragAndDrop(drag, drop).build().perform();
		
		
		
	}
}
