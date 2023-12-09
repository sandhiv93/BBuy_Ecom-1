package com.BB.pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BB.utils.SeWrappers;

public class BottomLink extends SeWrappers {

	@FindBy(xpath="//h4[text()='Canada']")
	public WebElement canada; 
	public void clickCanadapage() {
		actionsDoubleclickElement(canada);
	}

	@FindBy(xpath = "//a[@data-automation='fs-terms-conditions']")
	public WebElement footerLinks;
	public void footerLinks() {
		jsscrollDownBottom();
		clickElement(footerLinks);
	}
}
