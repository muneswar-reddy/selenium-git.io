package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathLocators {
	public static void main(String[] args) {
		EdgeDriver driver =  new EdgeDriver();
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//*[@id='search']/input")).sendKeys("Dress");
//		xpath with single attribute
//		driver.findElement(By.xpath("//*[@placeholder=\"Search\"]")).sendKeys("Dress");
		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/input")).sendKeys("Dress");


	}
}




///html/body/header/div/div/div[2]/div/input // full xpath
////*[@id="search"]/input // partial xpath