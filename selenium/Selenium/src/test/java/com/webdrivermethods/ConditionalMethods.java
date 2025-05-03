package com.webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		//isDisplayed()

		//		WebElement logo  = driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[1]/a/img"));
		//		boolean status = logo.isDisplayed();
		//		System.out.println(status);


		//isEnabled()
//				boolean status = driver.findElement(By.xpath("//*[@id=\"name\"]")).isEnabled();
//				System.out.println(status);
//				boolean status = driver.findElement(By.xpath("//*[@id=\"female\"]")).isEnabled();
//				System.out.println(status);

		//isSelected()
//		WebElement male = driver.findElement(By.xpath("//*[@id=\"male\"]"));
//		WebElement female = driver.findElement(By.xpath("//*[@id=\"female\"]"));
//
//		System.out.println("Before Selecting:...............");
//
//		System.out.println(male.isSelected());
//		System.out.println(female.isSelected());
//
//		male.click();
//
//		System.out.println("After Selecting:...............");
//
//		System.out.println(male.isSelected());
//		System.out.println(female.isSelected());
		
		//close() it will close one window among multiple......
		driver.findElement(By.linkText("Blogger")).click();
		Thread.sleep(3000);

		driver.close();
	 	System.out.println("Closed one window");
		
		
		//quit() it will close all window when multiple windows present......
//		driver.findElement(By.partialLinkText("Blog")).click();
//		Thread.sleep(3000);

//		driver.quit();
//		System.out.println("Closed all windows");

	}

}
