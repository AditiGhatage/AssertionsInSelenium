package com.assertions;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.testNG.BaseTest;

public class SoftAssertionExamples extends BaseTest
{
	public static WebDriver driver;
	public void verifySoftAssrt()
	{
		String strcurrentUrl = "https://www.facebook.com";
        String strcurrentTitle = "Facebook";
 
        String strActualUrl = "https://www.vervesquare.com/";
        String strActualTitle = "Verve Square Technologies – Faster to Market";
 
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(strcurrentUrl, strActualUrl);
        softAssert.assertNotEquals(strcurrentTitle, strActualTitle);
        softAssert.assertNull(driver.getCurrentUrl(), "Null Object Found\n");
        softAssert.assertSame((driver.getCurrentUrl()), "https://www.lambdatest.com","Expected and Current URL are not same");
        //softAssert.assertAll();
        
        System.out.println("SoftAssert Test Passed\n");
	}
	
	public void getSoftAssertion()
	{
		driver.get("https://www.amazon.in/");
		SoftAssert objsoftAssert = new SoftAssert();
		String ActualTitle = driver.getTitle();
		System.out.println("Actual Title :"+ActualTitle);
		String ExpectedTitle = "cameras, books, watches, apparel, shoes and e-Gift Cards. Free Shipping &amp; Cash on Delivery Available.";
		         
		//Soft assert applied to verify title
		objsoftAssert.assertEquals(ActualTitle, ExpectedTitle);
		//If failed, this line gets printed and execution is not halted
		System.out.println("Assertion 1 is executed");
		 
		objsoftAssert.assertAll();
		 
	}
	
	public void verifyOpenBrowser()
	{
		driver.navigate().to("https://demoqa.com/");
		SoftAssert softassert = new SoftAssert();
		String expectedTitle = "Free QA Automation Tools For Everyone";
		String originalTitle = driver.getTitle();
		softassert.assertEquals(originalTitle, expectedTitle);

	}
}
