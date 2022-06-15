package com.assertions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.testNG.BaseTest;

public class AssertionTest extends BaseTest {

	private AssertionExamples objassert;
	
	public void initializeWebPage() {
		objassert = new AssertionExamples();
	}
	
	@BeforeClass
	public void initializeWebEnv() {
		this.initializeWebPage();
		objassert.intializationDriver("https://www.vervesquare.com/");
	}

	@AfterClass
	public void tearDown() {
		objassert.tearDown();
	}
	
	
	@Test
	public void TCID_101_verifyAsserEquals()
	{
		objassert.getassertequals();
	}

	@Test
	public void TCID_102_verifyAssertNotEquals()
	{
		objassert.getassertNotEquals();
	}
	
	@Test
	public void TCID_103_verifyAssertTrue()
	{
		objassert.getassertTrue();
	}
	
	@Test
	public void TCID_104_verifyAssertFalse()
	{
		objassert.getassertFalse();
	}
	
	@Test
	public void TCID_105_verifyAssertNull()
	{
		objassert.getassertNull();
		objassert.getassertNotNull();
	}
}
