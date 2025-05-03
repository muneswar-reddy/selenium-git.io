package com.webdrivermethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://drives.thetapacademy.com/sign-in");
		driver.manage().window().maximize();
		
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		WebElement email =  myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Email']")));
		email.sendKeys("bhogalamuneswarreddy@gmail.com");

		WebElement password = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		password.sendKeys("Tapacademy@123");
		
		WebElement signIn = myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Sign In']")));
		signIn.click();
	}

}
