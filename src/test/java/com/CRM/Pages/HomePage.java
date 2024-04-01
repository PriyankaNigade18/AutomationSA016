package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.Utility;

public class HomePage 
{
	//Encapsulation=data+Method
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver)//base class
	{
		this.driver=driver;
	}
	
	//By locator 
	
	private By link=By.linkText("Sign In");
	
		
	//method
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public void getSignIn()
	{
		Utility.capture(driver);
		driver.findElement(link).click();
		Utility.capture(driver);
	}
	
	
	
	
	
	
	
	
	
	

}
