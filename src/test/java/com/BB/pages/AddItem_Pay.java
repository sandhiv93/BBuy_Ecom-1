package com.BB.pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BB.utils.SeWrappers;
import com.BB.utils.Reports;

public class AddItem_Pay extends SeWrappers{

	
///////////////////////////////////////////////////////////////	

	//Shopping By search the product
	
	@FindBy(xpath ="//div[@lang='en']//img[@alt='Canada']")
	public WebElement canada; 
	public void clickCanadapage() {
		actionsDoubleclickElement(canada);
	}

	
	//Grooming Shaving Oil
	@FindBy(xpath = "//input[@placeholder='Search Best Buy']")
	public WebElement search;
	public void clickSearchandEnter(String myneed) {
		clickElement(search);
		typeText(search, myneed);
	}



	@FindBy(xpath = "//button[@aria-label='Search']//*[name()='svg']")
	public WebElement iconSearch;
	public void clickIconSearch() {
		clickElement(iconSearch);
	}



	@FindBy(xpath = "(//div[@class='sliderTarget_2Q87g'])[1]")
	public WebElement groomOil;
	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	public WebElement addCart;
	//@FindBy(xpath = "//span[text()='View Cart']")
	//public WebElement viewCart;
	public void clickandEntergroomOil() throws InterruptedException {
		clickElement(groomOil);
		clickElement(addCart);
		Thread.sleep(3000);
		//clickElement(viewCart);
		if (addCart.isSelected()){
			Reports.setTCDesc("Product is Added to Cart.");
		}
		else {
			Reports.setTCDesc("Product is out of stock and Product not added to Cart");
		}
		Thread.sleep(3000);
		navigateBack();
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//Shopping By Brand
	
	@FindBy(xpath = "//span[@data-automation='x-shop']")
	public WebElement shop1;
	@FindBy(xpath = "//a[normalize-space()='Brands']")
	public WebElement brand;
	@FindBy(xpath = "//a[normalize-space()='P Q R S']")
	public WebElement pqrs;
	@FindBy(xpath = "//a[normalize-space()='Philips']")
	public WebElement philips;
	@FindBy(xpath = "//div[text()='Philips Series 5000 Wet & Dry Shaver with Quick Clean Pod (S5889/60)']")
	public WebElement neededProduct;
	@FindBy(xpath = "(//div[@class='addToCartLabel_YZaVX'])[1]")
	public WebElement addtoCart;
	
//	@FindBy(xpath = "//span[@class='counter']")
//	public WebElement cartButton;
	
	public void clickByBrand() throws InterruptedException {
		clickElement(shop1);
		clickElement(brand);
		Thread.sleep(3000);
		clickElement(pqrs);
		Thread.sleep(3000);
		clickElement(philips);
		Thread.sleep(3000);
		clickElement(neededProduct);
		Thread.sleep(3000);
		clickElement(addtoCart);
		Thread.sleep(3000);
		if (addtoCart.isSelected()){
			Reports.setTCDesc("Product is Added to Cart.");
		}
		else {
			Reports.setTCDesc("Product is out of stock and Product not added to Cart");
		}
		Thread.sleep(3000);
		navigateBack();
		//clickElement(cartButton);
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//Shopping By Department 
	
	@FindBy(xpath = "//span[@data-automation='x-shop']")
	public WebElement shop2;
	@FindBy(xpath = "//a[normalize-space()='Gift Cards']")
	public WebElement GiftCards;
	@FindBy(xpath = "//a[normalize-space()='Apple Gift Cards']")
	public WebElement AppleCard;
	@FindBy(xpath = "//div[text()='Apple Gift Card $100 - Digital Download (Email Delivery)']")
	public WebElement clickAppleCard;
	@FindBy(xpath = "//div[@class='productActionContainer_1F_KM']//button[@type='submit']")
	public WebElement appleCardCart;
	
	public void shopByDepartment() throws InterruptedException {
		clickElement(shop2);
		Thread.sleep(3000);
		clickElement(GiftCards);
		Thread.sleep(3000);
		clickElement(AppleCard);
		Thread.sleep(3000);
		clickElement(clickAppleCard);
		Thread.sleep(3000);
		clickElement(appleCardCart);
		if(appleCardCart.isSelected()){
			Reports.setTCDesc("Product is Added to Cart.");
		}
		else {
			Reports.setTCDesc("Product is out of stock and Product not added to Cart");
		}
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//Payment Sections
	@FindBy(xpath = "//span[@class='label']")
	public WebElement clickcartforPay;
	@FindBy(xpath = "//span[text()='Continue to Checkout']")
	public WebElement clicktoContinue;
	@FindBy(xpath = "//input[@id='firstName']")
	public WebElement enterFname;
	@FindBy(xpath = "//input[@id='lastName']")
	public WebElement enterLname;
	@FindBy(xpath = "//input[@id='phoneNumber']")
	public WebElement enterPhnnum;
	@FindBy(xpath = "//input[@id='addressLine1']")
	public WebElement address;
//	@FindBy(xpath = "//input[@id='city']")
//	public WebElement city;
//	@FindBy(xpath = "//select[@id='regionCode']")
//	public WebElement region;
//	@FindBy(xpath = "//input[@id='postalCode']")
//	public WebElement pincode;
	@FindBy(xpath = "//span[text()='Continue']")
	public WebElement clicktoContinue2;

	public void clickandPay() throws InterruptedException {
		Thread.sleep(3000);
		clickElement(clicktoContinue);
	}
	public void enterFirstname(String myname) {
		typeText(enterFname, myname);	
	}
	public void enterLastname(String myLname) {
		typeText(enterLname, myLname);	
	}
	public void enterPhnNum(String mynum) throws InterruptedException {
		Thread.sleep(3000);
		typeText(enterPhnnum, mynum);	
	}
	public void enterAddress(String myAdd) throws InterruptedException {
		Thread.sleep(3000);
		typeText(address, myAdd);
	}
//	public void enterCity(String mycity) throws InterruptedException {
//		Thread.sleep(2000);
//		typeText(city, mycity);
//	}
//	public void clickReigion(int num) throws InterruptedException {
//		clickElement(region);
//		Thread.sleep(2000);
//		selectByindexDropDown(region, num);
//	}
//	public void enterPincode(String myPincode) throws InterruptedException {
//		Thread.sleep(2000);
//		typeText(pincode, myPincode);
//	}
	public void clickandPay2() throws InterruptedException {
		Thread.sleep(4000);
		clickElement(clicktoContinue2);
	}

	///////////////////////////////////////////////////////////////


	@FindBy(xpath = "//input[@id='shownCardNumber']")
	public WebElement cardNumber;
	@FindBy(xpath = "//select[@id='expirationMonth']")
	public WebElement cardMonth;
	@FindBy(xpath = "//select[@id='expirationYear']")
	public WebElement cardYear;
	@FindBy(xpath = "//input[@id='cvv']")
	public WebElement cardCVV;
	@FindBy(xpath = "//span[text()='Continue']")
	public WebElement clicktoContinue3;
	@FindBy(xpath = "(//span[normalize-space()='Place Order'])[1]")
	public WebElement placeOrder;
	public void enterDetailsandPay(String carnum, int month, int year, String CVV) throws InterruptedException {
		typeText(cardNumber, carnum);
		Thread.sleep(4000);
		clickElement(cardMonth);
		selectByindexDropDown(cardMonth, month);
		Thread.sleep(2000);
		clickElement(cardYear);
		Thread.sleep(4000);
		selectByindexDropDown(cardYear, year);
		typeText(cardCVV, CVV);
		Thread.sleep(4000);
		clickElement(clicktoContinue3);
		clickElement(placeOrder);
	}

}
