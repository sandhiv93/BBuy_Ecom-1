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

	@FindBy(xpath = "(//footer[@class='_19pcD '])[1]")
	public List<WebElement> footerLinks;
	public void footerLinks() {
		jsscrollDownBottom();
		int count=footerLinks.size();
		System.out.println(count);
		for(WebElement link:footerLinks){
			String url=link.getAttribute("href");
			try {
				URL bottomurl = new URL(url);
				HttpURLConnection connection = (HttpURLConnection) bottomurl.openConnection();
				connection.setRequestMethod("HEAD");
				int responseCode=connection.getResponseCode();

				if(responseCode != HttpURLConnection.HTTP_OK) {	
					System.out.println("The URL '" + url + "' is novalidated.");
				} else {
					System.out.println("The URL '" + url + "' is validated.");
				}
			} catch (IOException e) {		
				System.out.println("An exception occurred, indicating a broken link.");
			}
		}
	}
}
