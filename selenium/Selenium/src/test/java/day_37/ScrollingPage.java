package day_37;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollingPage {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = driver;
		
		
		//scrolling down page by pixel number
		js.executeScript("window.scrollBy(0,1500)", "");
		System.out.println(js.executeScript("return window.pageYOffset;")); //1500
//		you need to scroll horizonatally use window.pageXOffset
		
		Thread.sleep(3000);
		
		//scroll the page till element is visible
		WebElement poll = driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		js.executeScript("arguments[0].scrollIntoView();", poll);
		System.out.println(js.executeScript("return window.pageYOffset;"));  //2264
		
		Thread.sleep(3000);
		
		//scroll the till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		you need ro scroll horizonatally instead of use scrollHeight use scrollWidth
		System.out.println(js.executeScript("return window.pageYOffset;")); //2488
		
		Thread.sleep(3000);
		
		//scrolling upto initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;")); //0
		
		
		
	}

}
