package com.BB.utils;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.BB.pages.AddItem_Pay;
import com.BB.pages.BottomLink;
import com.BB.pages.BrokenLink;
import com.BB.pages.LogIn_Page;
import com.BB.pages.SignUp_Page;

public class BBWrappers extends SeWrappers{


	//Account creation SignUp
	public void Signupwrapper(String myname, String mylastname, String myemail, String mypwd) {
		try {
			SignUp_Page signUp = PageFactory.initElements(driver, SignUp_Page.class);
			signUp.clickUSpage();
			signUp.clickAccButton();
			signUp.clickCreateAcc();
			signUp.enterFirstname(myname);
			signUp.enterLastname(mylastname);
			signUp.enteremail(myemail);
			signUp.enterpassword(mypwd);
			signUp.screenshot("SignUp_Valid");
			signUp.clickCreateAccfinish();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	//LogIn into My Acc BestBuy
	public void LogInwrappers(String myemailid, String mypwd) {
		try {
			LogIn_Page login = PageFactory.initElements(driver, LogIn_Page.class);
			login.clickUSpage();
			login.clickAccButton();
			login.enterEmail(myemailid);
			login.enterPassword(mypwd);
			login.screenshot("LogIn_Valid");
			login.clickLoginfinish();
			//login.mynameAfterlOGIN();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Verify the Given URL is Good or Not
	public void Brokenlinkwrapper() throws IOException {
		BrokenLink url = PageFactory.initElements(driver, BrokenLink.class);
		url.brokenLink();
	}


	//Verify the Bottom Links in Given URL
	public void bottomLinkswrapper(){
		try	{		
			BottomLink footpage= PageFactory.initElements(driver, BottomLink.class);
			footpage.clickCanadapage();
			footpage.footerLinks();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	public void searchItemwrapper(String myneed, String myFname, String myLname, String mynum, 
			String address, String carnum, int month, int year, String CVV) {
		try {
			AddItem_Pay pay = PageFactory.initElements(driver, AddItem_Pay.class);
			//LogIn_Page login = PageFactory.initElements(driver, LogIn_Page.class);
			pay.clickCanadapage();
			pay.clickSearchandEnter(myneed);
			Thread.sleep(2000);
			pay.clickIconSearch();
			Thread.sleep(2000);
			pay.clickandEntergroomOil();
			Thread.sleep(2000);
			pay.clickByBrand();
			Thread.sleep(2000);
			pay.shopByDepartment();			
			pay.clickandPay();
			Thread.sleep(2000);
			pay.enterFirstname(myFname);
			pay.enterLastname(myLname);
			pay.enterPhnNum(mynum);
			pay.enterAddress(address);
			//pay.enterCity(mycity);
			//pay.clickReigion(num);
			//pay.enterPincode(myPincode);
			pay.clickandPay2();
			pay.enterDetailsandPay(carnum, month, year, CVV);
			screenshot("Payment");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	

}