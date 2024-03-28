package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)//base class
	{
		this.driver=driver;
	}
	
	By email=By.id("email-id");
	By pas=By.id("password");
	By btn=By.id("submit-id");
	
	public void doLogin(String em,String ps)
	{
		driver.findElement(email).sendKeys(em);
		driver.findElement(pas).sendKeys(ps);
		driver.findElement(btn).click();
		
	}
	
	
}
