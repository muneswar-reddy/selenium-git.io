package day_34;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DatesPicker_3 {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		String month = "Jan";
		String year = "2023";
		String day = "1";
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement dateInput = driver.findElement(By.id("start-date"));
		js.executeScript("arguments[0].click();", dateInput);



	}

}
