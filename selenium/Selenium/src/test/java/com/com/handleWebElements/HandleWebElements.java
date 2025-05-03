package com.com.handleWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleWebElements {


	public static void main(String[] args) {
		WebDriver driver =  new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		List<WebElement> checkBoxes =  driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
// select checkboxes.................. 
		for(int i =0;i <checkBoxes.size();i++) {
			checkBoxes.get(i).click();
		}
		myWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@class='form-check-input' and @type='checkbox']")));
//deselect checkboxes...................
		for(int i =0;i <checkBoxes.size();i++) {
			checkBoxes.get(i).click();
		}
		
// select radiobox.................. 
		
//		myWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@class='form-check-input' and @type='radio']")));
//		List<WebElement> radioBoxes =  driver.findElements(By.xpath("//input[@class='form-check-input' and @type='radio']"));
//		for(int i =0;i <radioBoxes.size();i++) {
//			radioBoxes.get(i).click();
//		}
//selecting specific radiobox
		driver.findElement(By.xpath("//input[@id='female']")).click();
		
	}

}
