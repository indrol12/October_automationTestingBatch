package test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathlocator {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demoqa.com/register");
	
	//1.xpath://tagname[@attribute='value']
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Karan");	
	driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("patil");
	
	//2.xpath://parenttagname/childtagname
	//driver.findElement(By.xpath("//div/input")).sendKeys("karan1234");
	
	//3.xpath://tagname[@attribute='value' and @attribute='value']
	driver.findElement(By.xpath("//input[@type='text' and @id='userName']")).sendKeys("patil122");
	Thread.sleep(1000);
	//4.xpath://tagname[contains(@attribute,'value')]
	driver.findElement(By.xpath("//input[contains(@pattern,'^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\\$%\\^&\\*])(?=.{8,})$')]")).sendKeys("1234");
	
	Thread.sleep(1000);
	driver.navigate().to("https://demoqa.com/login");
	//5.xpath://tagname[@text()='value']
	
	driver.findElement(By.xpath("//button[text()='Elements']")).click();
	
	//driver.findElement(By.xpath("//button[@id='register']")).click();
	
	//driver.findElement(By.xpath("//button[text()='Back to Login']")).click();
	
	
}
}
