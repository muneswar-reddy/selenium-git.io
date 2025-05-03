package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocators {
	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
//		tag#id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirts");
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Shirts");
		
//		tag.classname
//		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-Shirts");
//		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-Shirts");
		
//		tag{Attribute = "value"]
//		driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("Shirts");
		
//		tag.class{Attribute = "value"]
//		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-Shirts");
//		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("Pants");
		
		
	}
}
