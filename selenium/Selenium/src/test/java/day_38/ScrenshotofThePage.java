package day_38;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrenshotofThePage {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
		//take screenshot of full page
		TakesScreenshot ts = driver;
//		File fullPage= ts.getScreenshotAs(OutputType.FILE);
////		File targetFile = new File("C:\\Users\\91837\\OneDrive\\Desktop\\selenium\\Selenium\\Screenshots\\fullPage.png");
//		File targetFile = new File(System.getProperty("user.dir") + "\\Screenshots\\fullPage.png");
//		fullPage.renameTo(targetFile);
		
		//take screenshot specific area of page
//		WebElement specificArea = driver.findElement(By.xpath("(//div[@class='product-grid home-page-product-grid'])[1]"));
//		File area = specificArea.getScreenshotAs(OutputType.FILE);
//		File targetFile = new File(System.getProperty("user.dir") + "\\Screenshots\\featuredProducts.png");
//		area.renameTo(targetFile);
		
		//take screenshot of specific  element in the page
		WebElement specificElement = driver.findElement(By.xpath("//img[@title='Show details for Build your own computer']"));
		File area = specificElement.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir") + "\\Screenshots\\imagelogo.png");
		area.renameTo(targetFile);
		
		driver.quit();

		
		//both screenshot of specific area and elements are available from selenium 4
		

		
	}

}
