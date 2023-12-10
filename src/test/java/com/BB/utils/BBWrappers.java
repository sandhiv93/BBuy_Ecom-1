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
	public void Signupwrapper(String myname, String mylastname, String myemail, String mypwd, String mypwd2, String phnum) {
		try {
			SignUp_Page signUp = PageFactory.initElements(driver, SignUp_Page.class);
			signUp.clickUSpage();
			signUp.clickAccButton();
			signUp.clickCreateAcc();
			signUp.enterFirstname(myname);
			signUp.enterLastname(mylastname);
			signUp.enteremail(myemail);
			signUp.clicktoggle();
			signUp.enterpassword(mypwd);
			signUp.enterCopassword(mypwd2);
			signUp.enterPhonenum(phnum);
			Thread.sleep(2000);
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
			login.clickSignIn();
			login.enterEmail(myemailid);
			login.clicktoogle();
			login.enterPassword(mypwd);
			login.screenshot("LogIn_Valid");
			Thread.sleep(2000);
			login.clickLoginfinish();
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
			footpage.clickUSpage();
			footpage.footerLinks();
			screenshot("BottomValidate");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	public void searchItemwrapper(String myneed,String myFname,String myLname, String street, String city, String num,
			String code, String mymail,String mynum) {
		try {
			AddItem_Pay pay = PageFactory.initElements(driver, AddItem_Pay.class);
			//LogIn_Page login = PageFactory.initElements(driver, LogIn_Page.class);
			pay.clickUSpage();
			pay.clickSearchandEnter(myneed);
			Thread.sleep(2000);
			pay.clickIconSearch();
			Thread.sleep(2000);
			pay.clickandApplePencil();
			Thread.sleep(2000);
			pay.clickByBrand();
			Thread.sleep(2000);
			pay.clickMenu2();
			pay.shopByDepartment();			
			pay.enterDetails(myFname, myLname, street, city, num, code, mymail, mynum);
			screenshot("Payment");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void paymentWrapper( String cno, String cvvno, String pwd) {
		try {
			AddItem_Pay pay = PageFactory.initElements(driver, AddItem_Pay.class);
			pay.enterandPay(cno, cvvno, pwd);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	

}