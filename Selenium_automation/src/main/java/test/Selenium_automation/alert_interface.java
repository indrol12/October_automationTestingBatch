package test.Selenium_automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_interface {

	public static void main(String[] args) throws InterruptedException {
	
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
			    
	    //simple alert
		 driver.findElement(By.id("alertBtn")).click();
	    Alert al=driver.switchTo().alert();		
	    System.out.println("Text of simple alert is:"+al.getText());	    
	    Thread.sleep(1000);
	    al.accept();
	    
	    //confirmation alert
	    driver.findElement(By.id("confirmBtn")).click();	    
	    Alert al2=driver.switchTo().alert();	    		
	    System.out.println("Text of simple alert is:"+al2.getText());
	    Thread.sleep(1000);
	    al2.dismiss();
	    
	    //prompt alert
	}

}
