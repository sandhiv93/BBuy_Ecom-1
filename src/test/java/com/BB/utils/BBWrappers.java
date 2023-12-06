package com.BB.utils;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

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
 }