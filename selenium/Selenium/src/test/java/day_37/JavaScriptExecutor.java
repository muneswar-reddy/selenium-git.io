package day_37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExecutor {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//input[@id='name']"));
//		element.sendKeys("Muneswar");
//		in some cases using sendkeys will get an elementIntruptedException so alternate method is executeScript()
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		driver is the Type of webdriver its also an another interface so need to convert it into JavascriptExecutor type
//		create the driver using child type reference i.e., EdgeDriver driver = new EdgeDriver(); so in that case no need 
//		convert the driver to JavascriptExecutor because webdriver is the child class of it
		js.executeScript("arguments[0].setAttribute('value','Muneswar Reddy')",element);
		
		// clicking on the checkbox using jsExecutor 
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='monday']"));
		js.executeScript("arguments[0].click()", checkBox);
	}

}
