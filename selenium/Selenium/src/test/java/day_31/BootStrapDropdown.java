package day_31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BootStrapDropdown {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
//open the drop down
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		
//select single option
		driver.findElement(By.xpath("//input[@value='jQuery']")).click();
		
		
//capture all options and find out size 
		List<WebElement> options =  driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("Size of the Dropdown: " +options.size());
		
		
//printing options from dropdown
		for(int i=0;i<options.size();i++) {
			System.out.println("Option " + i + " : " + options.get(i).getText());
		}
		
		
//select multiple options
		for(WebElement op : options) {
			String option = op.getText();
			
			if(option.equals("Java") || option.equals("Python") || option.equals("MySQL")) {
				op.click();
			}
		}
	}

}
