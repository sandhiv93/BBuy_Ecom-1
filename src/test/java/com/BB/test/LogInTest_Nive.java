package com.BB.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.BB.utils.BBWrappers;
import com.BB.utils.Reports;
import com.BB.utils.SeWrappers;

public class LogInTest_Nive extends SeWrappers{

	SeWrappers se = new SeWrappers();
	BBWrappers bb = new BBWrappers();
	Reports repo = new Reports();
	
	@Test(priority=2)
	public void LogIn_InValid(){
		try{
			Reports.setTCDesc("Login of BestBuy functionality with Invalid_credentials");
			launchBrowser();
			bb.LogInwrappers("dev@mail.com", "qwerty");
			se.screenshot("LogIn_InValid");
			Assert.assertFalse(false);
		}
		
		catch(Exception ex){
			ex.printStackTrace();
			System.out.println("Fail to Login with InValid Credentials");
			Reports.reportStep("FAIL", "Problem while Login with Invalid Credentials");
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