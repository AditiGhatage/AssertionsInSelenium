package com.assertions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.testNG.BaseTest;

public class SoftAssertTest extends BaseTest
{
	private SoftAssertionExamples objsoftassert;
	
	
	public void initializeWebPage() {
		objsoftassert = new SoftAssertionExamples();
	}
	
	@BeforeClass
	public void initializeWebEnv() {
		this.initializeWebPage();
		objsoftassert.intializationDriver("https://www.amazon.in/");
	}

	@AfterClass
	public void tearDown() {
		objsoftassert.tearDown();
	}
	
	@Test(priority = 2)
	public void TC_01_verifysoftAssertion()
	{
		objsoftassert.verifySoftAssrt();
	}
	
	@Test
	public void TC_02_verifyAssertAll()
	{
		objsoftassert.getSoftAssertion();
	}
	
	@Test
	public void TC_03_verifyOpenBrowswer() 
	{
		objsoftassert.verifyOpenBrowser();
	}

}
