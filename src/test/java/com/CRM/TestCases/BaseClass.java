package com.CRM.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.CRM.Pages.*;

public class BaseClass
{

	public WebDriver driver;
	public HomePage hp;
	public LoginPage lp;
	
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationplayground.com/crm/");
		hp=new HomePage(driver);
		lp=new LoginPage(driver);
				
	}
	
	@BeforeClass
	public void pageSetUp()
	{
		hp.getSignIn();
	}
	
	
	
	
	
	
	
	
	
}
