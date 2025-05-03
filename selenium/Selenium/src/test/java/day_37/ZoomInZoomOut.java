package day_37;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;

public class ZoomInZoomOut {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = driver;
		
		Thread.sleep(3000);
		js.executeScript("document.body.style.zoom ='50%'");
		Thread.sleep(3000);
		js.executeScript("document.body.style.zoom ='75%'");
		
	}

}
