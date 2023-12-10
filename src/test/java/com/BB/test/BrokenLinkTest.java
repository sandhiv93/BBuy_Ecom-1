package com.BB.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.BB.utils.BBWrappers;
import com.BB.utils.Reports;
import com.BB.utils.SeWrappers;

public class BrokenLinkTest extends SeWrappers{
	SeWrappers se = new SeWrappers();
	BBWrappers bb = new BBWrappers();
	Reports repo = new Reports();
	
	@Test(priority = 1)
	public void verifyGivenURL() {
		try{
			Reports.setTCDesc("Verify Given Url of BestBuy functionality ");
			//launchBrowser();
			bb.Brokenlinkwrapper();
			se.getCurrentUrl();
			se.getTitle();
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Fail to verify and The given URL is BrokenLinkUrl");
			Reports.reportStep("FAIL", "Problem while login");
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
