package test.Selenium_automation;

import org.testng.annotations.Test;

public class priority_intestng {

	
	@Test(priority=3)
	public void login()
	{
		System.out.println("login success");
	}
	@Test(priority=2)
	public void Credentials()
	{
		System.out.println("username and password");
	}
	@Test(priority=1)
	public void Launchwebsite()
	{
		System.out.println("fb login page launched!");
	}
	
}
