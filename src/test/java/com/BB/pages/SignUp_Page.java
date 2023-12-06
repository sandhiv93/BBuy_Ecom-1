package com.BB.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BB.utils.SeWrappers;

public class SignUp_Page extends SeWrappers{
	
	@FindBy(xpath="//h4[text()='Canada']")
	public WebElement canada; 
	public void clickUSpage() {
		clickElement(canada);
	}
	
	@FindBy(xpath="//span[@data-automation='sign-in-text']")
	public WebElement accButton; 
	public void clickAccButton() {
		clickElement(accButton);
	}

	@FindBy(xpath="//span[normalize-space()='Create an account']")
	public WebElement createAcc; 
	public void clickCreateAcc() {
		waitforelementExplicitwait(createAccButton, 10);
		clickElement(createAcc);
	}

	@FindBy(xpath="//input[@id='firstName']")
	public WebElement firstName;
	public void enterFirstname(String myname) {
		waitforelementExplicitwait(firstName, 5);
		typeText(firstName, myname);
	}

	@FindBy(xpath="//input[@id='lastName']")
	public WebElement lastName;
	public void enterLastname(String mylastname) {
		typeText(lastName, mylastname);
	}

	@FindBy(xpath="//input[@id='email']")
	public WebElement email; 
	public void enteremail(String myemail) {
		typeText(email, myemail);
	}
		
	@FindBy(xpath="//input[@id='password']")
	public WebElement pwd; 
	public void enterpassword(String mypwd) {
		waitforelementExplicitwait(pwd, 10);
		typeText(pwd, mypwd);
	}
	
	@FindBy(xpath="//button[contains(text(),'Create an Account')]")
	public WebElement createAccButton;
	public void clickCreateAccfinish() {
		clickElement(createAccButton);
	}
	
}
