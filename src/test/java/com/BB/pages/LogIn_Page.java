package com.BB.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BB.utils.SeWrappers;

public class LogIn_Page extends com.BB.utils.SeWrappers{

	@FindBy(xpath="//div[@class='country-selection']//h4[contains(text(),'United States')]")
	public WebElement US; 
	public void clickUSpage() {
		clickElement(US);
	}
	
	@FindBy(xpath="//button[@id='account-menu-account-button']//*[name()='svg']")
	public WebElement accButton; 
	public void clickAccButton() {
		clickElement(accButton);
	}
	
	@FindBy(xpath="//a[text()='Sign In']")
	public WebElement signInclick;
	public void clickSignIn() {
		clickElement(signInclick);
	}

	@FindBy(xpath="//input[@id='fld-e']")
	public WebElement mailId;
	public void enterEmail(String myemail) {
		typeText(mailId, myemail);
	}
	
	@FindBy(xpath="//span[@class='c-toggle-slider c-toggle-round']")
	public WebElement togglebutton;
	public void clicktoogle() {
		clickElement(togglebutton);
	}
	@FindBy(xpath="//input[@id='fld-p1']")
	public WebElement pwd;
	public void enterPassword(String mypwd) {
		typeText(pwd, mypwd);
	}
	
	@FindBy(xpath="//button[normalize-space()='Sign In']")
	public WebElement logInFinish;
	public void clickLoginfinish() throws InterruptedException {
		clickElement(logInFinish);
		Thread.sleep(5000);
	}
	
}
