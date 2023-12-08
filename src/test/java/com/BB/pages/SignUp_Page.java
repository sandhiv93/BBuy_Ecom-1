package com.BB.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BB.utils.SeWrappers;

public class SignUp_Page extends SeWrappers{
	
	//xpath
	//img[@alt='Canada'])[1]
	//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/img[1]
	// /html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/img[1]
	//div[@lang='en']//img[@alt='Canada']
	//a[@class='canada-link']//img)[1]
	
	@FindBy(xpath ="//div[@lang='en']//img[@alt='Canada']")
	public WebElement canada; 
	public void clickUSpage() {
		actionsDoubleclickElement(canada);
	}
	
	@FindBy(xpath="//span[@data-automation='sign-in-text']")
	public WebElement accButton; 
	public void clickAccButton() {
		clickElement(accButton);
	}

	@FindBy(xpath="//span[normalize-space()='Create an account']")
	public WebElement createAcc; 
	public void clickCreateAcc() {
		//waitforelementExplicitwait(createAccButton, 10);
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
	
	@FindBy(xpath="//span[contains(text(),'Create Account')]")
	public WebElement createAccButton;
	public void clickCreateAccfinish() {
		clickElement(createAccButton);
	}
	
}
