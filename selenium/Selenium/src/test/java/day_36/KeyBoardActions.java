package day_36;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		//open the new window by clicking on the link button
		WebElement regEle = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		act.keyDown(Keys.CONTROL).click(regEle).keyUp(Keys.CONTROL).perform();
		
		//open the new tab when open new link using get()method instead of same tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://text-compare.com/");
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Muneswar Reddy");
		
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		
		
	}

}
