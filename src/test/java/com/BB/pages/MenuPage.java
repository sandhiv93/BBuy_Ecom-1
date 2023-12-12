package com.BB.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BB.utils.Reports;
import com.BB.utils.SeWrappers;

public class MenuPage extends SeWrappers {

	@FindBy(xpath="//div[@class='country-selection']//h4[contains(text(),'United States')]")
	public WebElement US; 
	public void clickUSpage() {
		clickElement(US);
	}
	
	@FindBy(xpath="//a[text()='Top Deals']")
	public WebElement topDeal;
	public void menuValidate1(){				
		clickElement(topDeal);
		getCurrentUrl();
	}

	@FindBy(xpath="//a[text()='Deal of the Day']")
	public WebElement DealofDay;
	public void menuValidate2(){
		navigateBack();
		clickElement(DealofDay);
		getCurrentUrl();
	}

	//Due to UI updated in BestBuy application below  Credit card Automation is removed, so verifications has commented
	
//	@FindBy(xpath = "//a[normalize-space()='Credit Cards']")
//	public WebElement CreditCards;	
//	public void menuValidate3(){
//		navigateBack();
//		clickElement(CreditCards);
//		getCurrentUrl();
//	}
}
