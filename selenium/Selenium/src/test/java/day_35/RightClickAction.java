package day_35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightClickAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act = new Actions(driver);
		
		//right click on right click button
		act.contextClick(button).perform();
	
		//click on copy
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();

		myWait.until(ExpectedConditions.alertIsPresent());
		//click ok on alert
		driver.switchTo().alert().accept();
		
		
		
	}
}
