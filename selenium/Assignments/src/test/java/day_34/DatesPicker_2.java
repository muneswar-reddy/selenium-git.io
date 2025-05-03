package day_34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatesPicker_2 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();

		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		String month = "Jan";
		String year = "2023";
		String day = "1";
		
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		
		
		//select Year
		WebElement drpMontYearEle = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select drpYear = new Select(drpMontYearEle);
		drpYear.selectByVisibleText(year);
		
		//select Month
		WebElement drpMonthEle = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select drpMonth = new Select(drpMonthEle);
		drpMonth.selectByVisibleText(month);
		
		//select day
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement dt : allDates) {
			if(dt.getText().equals(day)) {
				dt.click();
				break;
			}
		}
	}

}
