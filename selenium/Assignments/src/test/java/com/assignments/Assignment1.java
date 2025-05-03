package com.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();


//..................................................open url...........................................................................
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();


// .......................................provide string to search ..................................................

		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selinium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		myWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='wikipedia-search-results']/descendant::a")));

//.................................................. Count the no.of links ..................................................
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='wikipedia-search-results']/descendant::a"));

		int linkCount = links.size();
		System.out.println("No.of Links: " + linkCount);

//.................................................. Click on each link ..................................................
		for(WebElement link : links) {
			link.click();
		}


//.................................................. Get each window id ..................................................
		Set<String> windowIds = driver.getWindowHandles();
		//Approach1
		//		 List<String> windowList = new ArrayList(windowIds);
		//		 
		//		 for(String id : windowList) {
		//			 System.out.println("Each Window Id: " + id);
		//		 }

		//Approach2
		for(String id : windowIds) {
			System.out.println("Each Window Id: " + id);
		}
//Switching Window........................................................................
		System.out.println("Cuuent Window: " + driver.getTitle());
		for(String id : windowIds) {
			String title = driver.switchTo().window(id).getTitle();
			if(title.equals("Selenium in biology - Wikipedia") ){
				System.out.println("Current Window: " + driver.getTitle());				
			}
		}

// .................................................. close Specific Window ..................................................
		for(String id : windowIds) {
			String title = driver.switchTo().window(id).getTitle();
			
			if(title.equals("Selenium in biology - Wikipedia")) {
				driver.close();
			}
		}

	}
}
