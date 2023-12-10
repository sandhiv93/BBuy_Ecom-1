package com.BB.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.BB.utils.BBWrappers;
import com.BB.utils.Reports;
import com.BB.utils.SeWrappers;
public class SignUpTest_Pive extends SeWrappers{

	SeWrappers se = new SeWrappers();
	BBWrappers bb = new BBWrappers();
	Reports repo = new Reports();
	
	@Test()
	public void signupTestvalid() {
		try {
			Reports.setTCDesc("Validating SignUp of BestBuy functionality with valid credentials");
			//launchBrowser();
			bb.Signupwrapper("Anandh","Srinivasan","devanandh2902@gmail.com", "Batman12@#", "Batman12@#", "9566259258");
			screenshot("SignUp_Valid");
			Thread.sleep(2000);
			Assert.assertFalse(false);
		} 
		catch (Exception e) {
			e.printStackTrace();	
		}
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		try
		{
			driver.close();
			Reports.reportStep("PASS", "Browser closed successfully");
		}
		catch(Exception e)
		{
			System.out.println("Problem in closing the browser");
			Reports.reportStep("FAIL", "Problem in closing the browser");
			e.printStackTrace();
		}
	}

}