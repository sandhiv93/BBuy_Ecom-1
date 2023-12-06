package com.BB.pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import com.BB.utils.SeWrappers;

public class BrokenLink extends SeWrappers{

	public void brokenLink() throws IOException {	
		String urlToCheck = "https://www.bestbuy.com/";
		try {
			URL url = new URL(urlToCheck);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("HEAD");
			int responseCode = connection.getResponseCode();

			if (responseCode != HttpURLConnection.HTTP_OK) {
				System.out.println("The URL '" + urlToCheck + "' is broken.");
			}
			else{
				System.out.println("The URL '" + urlToCheck + "' is Okay Link and Verified ");
			}
		}
		catch (IOException e){
			System.out.println("An exception occurred, indicating a broken link.");
		}
	}
}
