package com.BB.pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BB.utils.SeWrappers;

public class BottomLink extends SeWrappers {

	@FindBy(xpath="//div[@class='country-selection']//h4[contains(text(),'United States')]")
	public WebElement US; 
	public void clickUSpage() {
		clickElement(US);
	}

	@FindBy(xpath = "//a[@class='body-copy-sm mr-200']")
	public WebElement footerLinks;
	@FindBy(xpath = "//h1[normalize-space()='Accessibility']")
	public WebElement Acesss;
	public void footerLinks() throws InterruptedException{
		jsscrollDownBottom();
		clickElement(footerLinks);
		getTextFromElement(Acesss);
		Thread.sleep(2000);
	}
}
