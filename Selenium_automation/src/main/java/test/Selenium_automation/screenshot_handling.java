package test.Selenium_automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class screenshot_handling {
public static void main(String[] args) throws IOException {
	
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://www.myntra.com/");
	
	//Takesscreenshot -interface
	//getscreenshotas -method
	
	

	
	File src=(File)driver.getScreenshotAs(OutputType.FILE);//screenshot captured!!
	
	//path of screenshot
	File Dest=new File("C:\\Users\\Admin\\git\\repository3\\Selenium_automation\\Screenshots\\myntra.png");
	
	Files.copy(src, Dest);
	//partial SCreenshot
//	WebElement fctlogo=driver.findElement(By.xpath(""));
//	File logo=(File)fctlogo.getScreenshotAs(OutputType.FILE);
	driver.close();
	
			
}
}
