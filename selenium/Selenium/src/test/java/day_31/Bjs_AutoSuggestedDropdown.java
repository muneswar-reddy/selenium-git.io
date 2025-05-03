package day_31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bjs_AutoSuggestedDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bjs.com/");
		driver.manage().window().maximize();
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(5));

		myWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@placeholder='What are you looking for today?']")));
		driver.findElement(By.xpath("//input[@placeholder='What are you looking for today?']")).sendKeys("eggs");

		myWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[@class='font-weight-normal']")));
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='font-weight-normal']"));

		System.out.println("Size of List: " + list.size());

		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("eggs")) {
				list.get(i).click();
				break;
			}
		}

	}

}
