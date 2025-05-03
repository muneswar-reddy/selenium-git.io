package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*lunch browser
 * open url(https://demo.opencart.com)
 * validate title should be "Your Store
 * close browser */
public class FirstTestCase {
	public static void main(String[] args) {
		
		//Load the browser
		WebDriver driver = new ChromeDriver();
//		 WebDriver driver = new EdgeDriver();
		
		
		//open url 
		driver.get("https://demo.opencart.com");
		
		//validate
		String title = driver.getTitle();
		if(title.equals("Your Store")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		//closes th driver
//		driver.close();
		driver.quit();
	}
		
}
