package tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import drivers.Driver;

public class BaseTest {
	
protected BaseTest() {
		
	}
	
	@BeforeMethod
	protected void setUp() throws Exception { //Map<String,String>
		Driver.initDriver();
	}
	
	@AfterMethod
	protected void tearDown() {		
		Driver.quitDriver();
	}

}
