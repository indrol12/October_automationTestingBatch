package test.Selenium_automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class basicdriver_methods {

	public static void main(String[] args) throws InterruptedException {
		
		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		
		//maximize browser
		driver.manage().window().maximize();
		
		//launch m
		
		driver.get("https://unipune.ac.in/?pp.aspx");
		Thread.sleep(1000);
		//navigate webapp
		driver.navigate().to("https://www.fortunecloudindia.com/");
		Thread.sleep(1000);
	     //navigate back
		driver.navigate().back();
		Thread.sleep(1000);
		//navigate forward
		driver.navigate().forward();
		Thread.sleep(1000);
		//refresh page
		driver.navigate().refresh();

	}
}
