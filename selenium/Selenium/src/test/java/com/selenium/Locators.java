package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of Links: " + links.size());
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Number of images: " + images.size());
		
//		driver.findElement(By.linkText("Cart")).click();
//		driver.findElement(By.partialLinkText("rt")).click();
	}

}
