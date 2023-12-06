package com.BB.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.BB.utils.BBWrappers;
import com.BB.utils.Reports;
import com.BB.utils.SeWrappers;
public class LogInTest_Pive extends SeWrappers{

	SeWrappers se = new SeWrappers();
	BBWrappers bb = new BBWrappers();
	Reports repo = new Reports();
	
	@Test(priority=1)
	public void LogInValid(){
		try{
			Reports.setTCDesc(" Login of BestBuy with valid credentials");
			launchBrowser();
			bb.LogInwrappers("devanandh2902@gmail.com", "Batman12@#");
			Assert.assertFalse(false);
		}
		catch(Exception e){
			System.out.println("Fail to Login with Valid Credentials");
			Reports.reportStep("FAIL", "Problem while Login with valid Credentials");
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void closeBrowser(){
		try{
			driver.close();
			Reports.reportStep("PASS", "Browser closed successfully");
		}
		catch(Exception e){
			System.out.println("Problem in closing the browser");
			Reports.reportStep("FAIL", "Problem in closing the browser");
			e.printStackTrace();
		}
	}

}