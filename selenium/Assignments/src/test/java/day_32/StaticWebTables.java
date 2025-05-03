package day_32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaticWebTables {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();

		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Find Flights'])[1]")));

		driver.findElement(By.xpath("(//input[@value='Find Flights'])[1]")).click();

		int rows = driver.findElements(By.xpath("//table[@class='table']//tr")).size();
		System.out.println("No.of Rows: " + rows);

		int columns = driver.findElements(By.xpath("//table[@class='table']//th")).size();
		System.out.println("No.of Columns: " + columns);

		for(int i=1;i<rows;i++) {
			String price = driver.findElement(By.xpath("//table[@class='table']//tr["+i+"]//td[6]")).getText();
			System.out.println("Price of row " +i+" : " + price);
			
			if(price.equals("$472.56")) {
				driver.findElement(By.xpath("//tr["+i+"]//input[contains(@value,'Flight')]")).click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Muneswar");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("1264/6563,Teachers Colony,Jammalamadugu");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Kadapa");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Andhra Pradesh");
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("516434");
		WebElement drpCardEle = driver.findElement(By.xpath("//select[@id='cardType']"));
		Select drpCard = new Select(drpCardEle);
		drpCard.selectByValue("amex");
		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("1234 5678 XXXX");
		driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("12");
		driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2024");
		driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Muneswara Reddy Bhogala");
		driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		
	}

}
