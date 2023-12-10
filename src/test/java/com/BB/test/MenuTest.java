package com.BB.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.BB.utils.BBWrappers;
import com.BB.utils.Reports;
import com.BB.utils.SeWrappers;

public class MenuTest extends SeWrappers{
	SeWrappers se = new SeWrappers();
	BBWrappers bb = new BBWrappers();
	Reports repo = new Reports();

	@Test(priority = 5)
	public void menuTest() {
		try{
			Reports.setTCDesc("Verify the Menu in BestBuy");
			bb.menuPageWrapper();
			Reports.reportStep("PASS", "BestBuy Menu all passed");
		}
		catch(Exception e){
			Reports.reportStep("FAIL", "Title page of Menu failed");
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
