package day_35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHoverAction {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();

		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		WebElement desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(desktop).moveToElement(mac).click().build().perform();
		
	}

}
