package com.BB.test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.BB.utils.BBWrappers;
import com.BB.utils.Reports;
import com.BB.utils.SeWrappers;
public class SignUpTest_Nive extends SeWrappers{


	SeWrappers se = new SeWrappers();
	BBWrappers bb = new BBWrappers();
	Reports repo = new Reports();
	
	@Test()
	public void signupTestInvalid() {
		try {
			Reports.setTCDesc("Validating SignUp of BestBuy functionality with Invalid credentials");
			//launchBrowser();
			bb.Signupwrapper("Ramco","Pothys","abc@gmail.com", "qwerty", "qwerty", "0123456987");
			se.screenshot("SignUp_InValid");
			Assert.assertFalse(false);
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to SignUp");
			Reports.reportStep("FAIL", "Problem while SignUp");	
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