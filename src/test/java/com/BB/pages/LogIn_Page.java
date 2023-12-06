package com.BB.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BB.utils.SeWrappers;

public class LogIn_Page extends com.BB.utils.SeWrappers{

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

	@FindBy(xpath="//input[@id='username']")
	public WebElement mailId;
	public void enterEmail(String myemail) {
		typeText(mailId, myemail);
	}
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement pwd;
	public void enterPassword(String mypwd) {
		typeText(pwd, mypwd);
	}
	
	@FindBy(xpath="//span[@class='GSYpm']")
	public WebElement logInFinish;
	public void clickLoginfinish() throws InterruptedException {
		clickElement(logInFinish);
		Thread.sleep(5000);
	}
	
	@FindBy(xpath = "(//span[contains(text(),'Hi, Muruganandh!')])[2]")
	public WebElement myNamelogin;
	public void mynameAfterlOGIN() {
		getTextFromElement(myNamelogin);
		System.out.println("Succesfully Login and Hence I seen My Name After Login" + myNamelogin);
	}
	
	
}
