package com.BB.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.BB.utils.BBWrappers;
import com.BB.utils.Reports;
import com.BB.utils.SeWrappers;

public class PayTest extends SeWrappers{

	SeWrappers se = new SeWrappers();
	BBWrappers bb = new BBWrappers();
	Reports repo = new Reports();
	
	@Test(priority = 1)
	public void add_Items_toCart(){
		try{
			Reports.setTCDesc("Search product and add item to the cart");
			//launchBrowser();
			bb.searchItemwrapper("applepencil", "Anandh", "Srini", "10 1 Dr", "Johnson Lake", "NE" ,"68937", "devanandh2902@gmail.com",
					"9566259258");
			//bb.paymentWrapper( "5555555555554444", "554", "Batman12@#");
			//Reports.reportStep("PASS", "item added in the cart");
		}
		catch(Exception e){
			e.printStackTrace();
			Reports.reportStep("FAIL", "item not  added in the cart");
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
