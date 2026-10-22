package test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Multiple_file_upload {
	
	public static EdgeDriver driver;
	
	public static void main(String args[])
	{
		driver=new EdgeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement files=driver.findElement(By.id("multipleFilesInput"));
		files.sendKeys("C:\\Users\\Admin\\Downloads\\ASP.NET_Core_MVC_Notes (1).pdf\n" + "C:\\Users\\Admin\\Downloads\\Aspdotnetcore_EFcodefirst_setup (1).docx");
		
		
		
	}
}
