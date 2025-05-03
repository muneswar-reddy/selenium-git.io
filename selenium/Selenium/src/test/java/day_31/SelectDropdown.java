package day_31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpCountryEle  = driver.findElement(By.xpath("//select[@id='country']"));
		Select drpCountry = new Select(drpCountryEle);
		
//select an option from select dropdown 
//		drpCountry.selectByContainsVisibleText("Canada");or
//		drpCountry.selectByValue("uk");
		drpCountry.selectByIndex(5);
		
// capture the options from the dropdown 
		List<WebElement> options = drpCountry.getOptions();
		System.out.println("Size of the Dropdown: " +options.size());
		
//print the options
		for(int i=0;i<options.size();i++) {
			System.out.println("Option " + i + " : " + options.get(i).getText());
		}
		
		
		
	}

}
