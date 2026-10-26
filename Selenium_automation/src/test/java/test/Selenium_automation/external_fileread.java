package test.Selenium_automation;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class external_fileread {

	@Test
	void filereadtest() throws IOException
	{
		//used for file reading
		FileReader fr=new FileReader("C:\\Users\\Admin\\git\\repository3\\Selenium_automation\\base.properties");
	//used to load file for properties reading
		Properties pr=new Properties();		
		pr.load(fr);
		
		EdgeDriver driver=new EdgeDriver();
		driver.get(pr.getProperty("cravita"));
		driver.close();
	
	}
}
