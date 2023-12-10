package com.BB.pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BB.utils.SeWrappers;
import com.BB.utils.Reports;

public class AddItem_Pay extends SeWrappers{


	///////////////////////////////////////////////////////////////	

	//Shopping By search the product

	@FindBy(xpath="//div[@class='country-selection']//h4[contains(text(),'United States')]")
	public WebElement US; 
	public void clickUSpage() {
		clickElement(US);
	}

	//Apple Pencil
	@FindBy(xpath = "//input[@id='gh-search-input']")
	public WebElement search;
	public void clickSearchandEnter(String myneed) {
		clickElement(search);
		typeText(search, myneed);
	}

	@FindBy(xpath = "//span[@class='header-search-icon']")
	public WebElement iconSearch;
	public void clickIconSearch() {
		clickElement(iconSearch);
	}

	//Apple Pencil
	@FindBy(xpath = "//a[normalize-space()='Apple Pencil (USB-C) - White']")
	public WebElement ApplePencil;
	@FindBy(xpath = "//button[normalize-space()='Add to Cart']")
	public WebElement penciladdCart;

	public void clickandApplePencil() throws InterruptedException {
		clickElement(ApplePencil);
		clickElement(penciladdCart);
		Thread.sleep(3000);
		if (penciladdCart.isSelected()){
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
	@FindBy(xpath = "//button[normalize-space()='Menu']//*[name()='svg']")
	public WebElement MainMenu1;
	@FindBy(xpath = "//button[contains(text(),'Brands')]")
	public WebElement brand;
	@FindBy(xpath = "//*[@data-lid='ubr_shp_son']")
	public WebElement sony;
	@FindBy(xpath = "//a[normalize-space()='Sony headphones']")
	public WebElement headphones;
	@FindBy(xpath = "//a[normalize-space()='Sony - WIC100 Wireless In-ear Headphone - Black']")
	public WebElement neededProduct;
	@FindBy(xpath = "//button[normalize-space()='Add to Cart']")
	public WebElement addtoCart;

	//	@FindBy(xpath = "//span[@class='counter']")
	//	public WebElement cartButton;

	public void clickByBrand() throws InterruptedException {
		clickElement(MainMenu1);
		Thread.sleep(3000);
		clickElement(brand);
		Thread.sleep(3000);
		clickElement(sony);
		Thread.sleep(3000);
		clickElement(headphones);
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
		
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
	@FindBy(xpath = "//*[@id=\"attach-modal-drawer-overlay-backdrop\"]/div/div[1]/button")
	public WebElement clicktoShop;
	@FindBy(xpath = "//button[text()='Menu']")
	public WebElement MainMenu2;
	
	public void clickMenu2() {
		clickElement(clicktoShop);
		clickElement(MainMenu2);
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//Shopping By Department 
	@FindBy(xpath = "//button[normalize-space()='Home, Furniture & Office']")
	public WebElement HoemandOffc;
	@FindBy(xpath = "//button[normalize-space()='Furniture']")
	public WebElement Furn;
	@FindBy(xpath = "//a[normalize-space()='Home Theater Furniture']")
	public WebElement HTF;
	@FindBy(xpath = "//a[text()='Samsung - 43” The Frame Customizable Bezel - Modern Brown']")
	public WebElement clickFrame;
	@FindBy(xpath = "//button[@data-button-state='ADD_TO_CART']")
	public WebElement addtoCarts;

	public void shopByDepartment() throws InterruptedException {
		
		Thread.sleep(3000);
		clickElement(HoemandOffc);
		Thread.sleep(3000);
		clickElement(Furn);
		Thread.sleep(3000);
		clickElement(HTF);
		Thread.sleep(3000);
		clickElement(clickFrame);
		clickElement(addtoCarts);
		Thread.sleep(3000);
		if(addtoCarts.isSelected()){
			Reports.setTCDesc("Product is Added to Cart.");
		}
		else {
			Reports.setTCDesc("Product is out of stock and Product not added to Cart");
		}
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//Payment Sections

	@FindBy(xpath = "//a[contains(.,'Go to cart')]")
	public WebElement clickCartPayStart;
	@FindBy(xpath = "//button[normalize-space()='Checkout']")
	public WebElement Checkout;
	@FindBy(xpath = "//div[@class='button-wrap ']//button[text()='Continue as Guest']")
	public WebElement guest;
	@FindBy(xpath="//button[text()='Switch all to shipping']")
	public WebElement shipping;

	@FindBy(xpath="//input[@id='firstName']")
	public WebElement fname;
	@FindBy(xpath="//input[@id='lastName']")
	public WebElement lname;
	@FindBy(xpath="//input[@id='street']")
	public WebElement mystreet;
	@FindBy(xpath="//input[@id='city']")
	public WebElement mycity;
	@FindBy(xpath="//select[@class='tb-select']")
	public WebElement mystate;
	@FindBy(xpath="//input[@id='zipcode']")
	public WebElement myzipcode;
	@FindBy(xpath="//input[@id='save-for-billing-address-Map {}']")
	public WebElement mybilladd;
	@FindBy(xpath="//span[text()='Apply']")
	public WebElement apply;
	@FindBy(xpath = "//span[text()='Keep Address as Entered']")
	public WebElement continuebreak;

	@FindBy(xpath = "//input[@id='user.emailAddress']")
	public WebElement payemail;
	@FindBy(xpath = "//input[@id='user.phone']")
	public WebElement payphone;
	@FindBy(xpath="//div[@class='button--continue']//button")
	public WebElement payment;


	public void enterDetails(String myFname,String myLname, String street, String city, String num,
			String code, String mymail,String mynum) throws InterruptedException {

		clickElement(clickCartPayStart);
		clickElement(Checkout);
		clickElement(guest);
		clickElement(shipping);
		typeText(fname, myFname);
		typeText(lname, myLname);
		typeText(mystreet,street);
		typeText(mycity,city);
		selectByValueDropDown(mystate,num);
		typeText(myzipcode,code);
		Thread.sleep(4000);
		clickElement(apply);
		Thread.sleep(4000);
		Thread.sleep(2000);
		clickElement(continuebreak);
		typeText(payemail,mymail);
		typeText(payphone,mynum);
		clickElement(payment);
	}
	
	//dummy payment
	@FindBy(xpath="//input[@id='number']")
	public WebElement mycardno;
	@FindBy(xpath="//select[@id='expMonth']//option[4]")
	public WebElement myexpiremonth;
	@FindBy(xpath="//select[@id='expYear']//option[6]")
	public WebElement myexpireyear;
	@FindBy(xpath="//input[@id='cvv']")
	public WebElement mycvv;
	@FindBy(xpath="//input[@name='password']")
	public WebElement mypassword;

	//place your order
	@FindBy(xpath="//span[contains(text(),'Place Your Order')]")
	public WebElement Okayplaceorder;

	public void enterandPay(String cno, String cvvno, String pwd) throws InterruptedException {
		typeText(mycardno,cno);
		clickElement(myexpiremonth);
		clickElement(myexpireyear);
		typeText(mycvv,cvvno);
		typeText(mypassword,pwd);
		Thread.sleep(2000);
		clickElement(Okayplaceorder);
	}

}


