package com.BB.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.BB.utils.BBWrappers;
import com.BB.utils.Reports;
import com.BB.utils.SeWrappers;

public class BottomLinkTest extends SeWrappers{

	SeWrappers se = new SeWrappers();
	BBWrappers bb = new BBWrappers();
	Reports repo = new Reports();
	
	@Test()
	public void bottomLinksValid(){
		try{
			Reports.setTCDesc("Verifying Bottom Links functionality in BestBuy");
			launchBrowser();
			bb.bottomLinkswrapper();

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Fail to Verifying bottomLinks");
			Reports.reportStep("FAIL", "Problem while Verifying bottomLinks");
		}
	}
	
	@AfterMethod
	public void closeBrowser(){
		try{
			driver.close();
			Reports.reportStep("PASS", "Browser closed successfully");
		}
		catch(Exception ex){
			System.out.println("Problem in closing the browser");
			Reports.reportStep("FAIL", "Problem in closing the browser");
			ex.printStackTrace();
		}
	}
}
