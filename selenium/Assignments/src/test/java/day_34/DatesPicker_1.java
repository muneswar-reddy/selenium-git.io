package day_34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Element;

public class DatesPicker_1 {

	public static void selectPreviousDate(WebDriver driver,String Year, String month, String day) {
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		while(true) {
			String actualMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String actualYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if(actualMonth.equals(month) && actualYear.equals(Year)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}
		}

		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement dt : allDates) {
			if(dt.getText().equals(day)) {
				dt.click();
				break;
			}
		}
	}
	
	
	public static void selectFutureDate(WebDriver driver,String Year, String month, String day) {
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		while(true) {
			String actualMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String actualYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(actualMonth.equals(month) && actualYear.equals(Year)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}
		
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement dt : allDates) {
			if(dt.getText().equals(day)) {
				dt.click();
				break;
			}
		}
	}
	
	
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();

		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();


		driver.switchTo().frame(0);

		//directly sending the date
		//		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/03/2024");

		String year = "2026";
		String month = "January";
		String day = "1";
		
//		selectPreviousDate(driver,year,month,day);
		selectFutureDate(driver,year,month,day);


	}

}
