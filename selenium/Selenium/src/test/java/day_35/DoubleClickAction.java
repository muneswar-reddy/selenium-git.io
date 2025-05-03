package day_35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClickAction {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
		
		box1.clear();
		box1.sendKeys("Muneswar");
		
		Actions act = new Actions(driver);
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		act.doubleClick(button).perform();
		
//		String text = box2.getText(); 
		String text = box2.getAttribute("value"); 
		if(text.equals("Muneswar")) {
			System.out.println("Text Copied");
		}
		else {
			System.out.println("Text not Copied");
		}
		
	}
}
