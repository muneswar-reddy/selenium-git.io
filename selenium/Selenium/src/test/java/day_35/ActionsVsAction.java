package day_35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsVsAction {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		
//		Actions act = new Actions(driver);
//		Action action = act.contextClick(button).build();
//		action.perform();
//................................................... or ....................................
		
//		Actions act = new Actions(driver);
//		act.contextClick(button).perform();
		
//................................................... or ....................................
		
		Actions act = new Actions(driver);
		act.contextClick(button).build().perform();
		
		
		
	}

}
