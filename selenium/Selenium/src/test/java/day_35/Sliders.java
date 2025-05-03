package day_35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sliders {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='slider-range']//span[1]")));
		
		Actions act = new Actions(driver);
		WebElement min_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		Point minPoint = min_slider.getLocation();
		System.out.println("Before Changing the min slider: " + minPoint); 
		

		
		act.dragAndDropBy(min_slider, 100, 0).perform();
		System.out.println("After changing the min slider x axis: " +min_slider.getLocation());
		
		WebElement max_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
		Point MaxPoint = max_slider.getLocation();
		System.out.println("Before Changing the max slider: " +MaxPoint); //(58, 275)
		
		act.dragAndDropBy(max_slider, -100, 0).perform();
		System.out.println("After changing the max slider x axis: " +max_slider.getLocation());
		
	}

}
