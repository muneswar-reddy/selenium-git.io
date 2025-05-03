package day_38;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadlessTesting {
	public static void main(String[] args) throws InterruptedException {
		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--headless=new");
		
		EdgeDriver driver = new EdgeDriver(options);
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();

		String title = driver.getTitle();

		if(title.equals("Your Store")) {
			System.out.println("Test Case Passed");
		}else {
			System.out.println("Test Case Failed");
		}
		driver.quit();
	}
}
