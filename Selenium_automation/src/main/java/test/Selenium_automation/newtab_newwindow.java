package test.Selenium_automation;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class newtab_newwindow {
public static void main(String[] args) {
	
	FirefoxDriver driver=new FirefoxDriver();
	
	driver.get("https://www.fortunecloudindia.com/");
	System.out.println("Title of fct:"+driver.getTitle());
	//new tab
	driver.switchTo().newWindow(WindowType.TAB);
	
	driver.navigate().to("https://www.cravitaindia.com/");
	System.out.println("Title of cravita:"+driver.getTitle());

	
	EdgeDriver edriver=new EdgeDriver();
	edriver.get("https://github.com/");
	System.out.println("current url of Github:"+edriver.getCurrentUrl());
	//new window
	edriver.switchTo().newWindow(WindowType.WINDOW);
	
	edriver.navigate().to("https://www.programiz.com/");
	System.out.println("current url of online compiler:"+edriver.getCurrentUrl());

	driver.quit();//all firefox browser  window will be closed
	edriver.quit();// all edge browser window will be closed
}
}
