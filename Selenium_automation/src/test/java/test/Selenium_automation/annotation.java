package test.Selenium_automation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation {

	@AfterTest
	public void name()
	{
		System.out.println("@AfterTest");
	}
	@Test
	public void email()
	{
		System.out.println("@Test");
	}
	@BeforeTest
	public void surname()
	{
		System.out.println("@BeforeTest");
	}
}
