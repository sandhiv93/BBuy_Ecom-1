package com.BB.pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BB.utils.SeWrappers;

public class AddItem_Pay extends SeWrappers{

	@FindBy(xpath ="//div[@lang='en']//img[@alt='Canada']")
	public WebElement canada; 
	public void clickUSpage() {
		actionsDoubleclickElement(canada);
	}
	
///////////////////////////////////////////////////////////////
	//Grooming Shaving Oil
	@FindBy(xpath = "//input[@placeholder='Search Best Buy']")
	public WebElement search;
	public void clickSearchandEnter(String myneed) {
		clickElement(search);
		typeText(search, myneed);
	}

///////////////////////////////////////////////////////////////
	
	@FindBy(xpath = "//button[@aria-label='Search']//*[name()='svg']")
	public WebElement iconSearch;
	public void clickIconSearch() {
		clickElement(iconSearch);
	}
	
///////////////////////////////////////////////////////////////
	
	@FindBy(xpath = "(//div[@class='sliderTarget_2Q87g'])[1]")
	public WebElement groomOil;
	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	public WebElement addCart;
	@FindBy(xpath = "//span[text()='View Cart']")
	public WebElement viewCart;
	
	public void clickandEntergroomOil() {
		clickElement(groomOil);
		clickElement(addCart);
		clickElement(viewCart);
	}

///////////////////////////////////////////////////////////////
	
	@FindBy(xpath = "//span[text()='Continue to Checkout']")
	public WebElement clicktoContinue;
	public void clickPaypal() {
		
	}
	
	
}
