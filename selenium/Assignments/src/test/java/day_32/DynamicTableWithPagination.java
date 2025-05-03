package day_32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicTableWithPagination {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		int noOfPages = driver.findElements(By.xpath("//ul[@id='pagination']//li")).size();
		
		for(int i=1;i<=noOfPages;i++) {
			if(i > 1) {
				WebElement active_page = driver.findElement(By.xpath("//ul[@id='pagination']//*[contains(text(),"+i+")]"));
				active_page.click();
			}
			
			int rows = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
			
			for(int j = 1;j<=rows;j++) {
				String name = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+j+"]//td[2]")).getText();
				String price = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+j+"]//td[3]")).getText();
				System.out.println("Name: "  + name + "  " + "Price: " + price);
				driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+j+"]//td[4]//input")).click();
				
			}
			
		}
		
	}

}
