package com.assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.testNG.BaseTest;

public class AssertionExamples extends BaseTest
{
	
	public void getassertequals()
	{
		//driver.navigate().to("https://www.vervesquare.com/");
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Verve Square Technologies – Faster to Market";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		//System.out.println("Different Titles.");
	}
	
	public void getassertNotEquals()
	{
		//driver.navigate().to("https://www.vervesquare.com/");
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Verve Square Technologies Faster to Market";
		Assert.assertNotEquals(ExpectedTitle, ActualTitle);
	}
	
	public boolean getassertTrue()
	{
		//driver.navigate().to("https://www.vervesquare.com/");
		Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Verve Square Technologies – Faster to Market");
		Assert.assertTrue(verifyTitle);
		System.out.println("Result is: "+verifyTitle);
		return true;
		
	}
	
	public boolean getassertFalse()
	{
		Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform");
		Assert.assertFalse(verifyTitle);
		System.out.println("Result is: "+verifyTitle);
		return true;
	}
	
	public void getassertNull()
	{
		String verifyAssertNull = null;
		Assert.assertNull(verifyAssertNull);
	}
	
	public boolean getassertNotNull()
	{
		Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Verve Square Technologies – Faster to Market");
		Assert.assertNotNull(verifyTitle);
		return true;
	}
	
	public void asertTrue()
	{
		driver.navigate().to("https://ebs4-qa2.simplifyhealthcare.com/");
		WebElement username = driver.findElement(By.name("UserName"));
		WebElement password = driver.findElement(By.name("Password"));
		Assert.assertTrue(username.isDisplayed());
		username.sendKeys("v-khushbut");
		System.out.println("Username: True");

		Assert.assertTrue(password.isDisplayed());
		password.sendKeys("Summer@2018#");
		System.out.println("Password: True");

	}
	
	public void asertFalse()
	{
		driver.navigate().to("https://www.facebook.com/");
		WebElement username = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("pass"));
		Assert.assertFalse(username.isDisplayed());
		username.sendKeys("xyz@gmail.com");
		System.out.println("False");

		Assert.assertFalse(password.isDisplayed());
		password.sendKeys("Summer@2018#");
		System.out.println("False");
	}
	
}
