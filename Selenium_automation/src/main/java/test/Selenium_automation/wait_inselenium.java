package test.Selenium_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait_inselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();

driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//driver.findElement(By.name("username")).sendKeys("Admin");

//xpath
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
driver.findElement(By.name("password")).sendKeys("admin123");

//explicit wait
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));

WebElement loginbtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button")));
loginbtn.click();
	}

}
