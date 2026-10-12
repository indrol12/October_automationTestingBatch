package test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_upload {
public static void main(String []args)
{
	ChromeDriver driver =new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Register.html");
	
	//fileupload
	driver.findElement(By.cssSelector("input[type='file']")).sendKeys("C:\\Users\\Admin\\Downloads\\Entity_Framework_Complete (1).pdf");
}
}
