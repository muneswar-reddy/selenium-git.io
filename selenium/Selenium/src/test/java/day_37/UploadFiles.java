package day_37;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class UploadFiles {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//single file uploadled
//		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\91837\\OneDrive\\Desktop\\Resume\\BHOGALA MUNESWAR REDDY.pdf");
//		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("BHOGALA MUNESWAR REDDY.pdf")){
//			System.out.println("File is successfully uploaded");
//		}
//		else {
//			System.out.println("Upload Failed");
//		}
		
		//multiple files uploaded
		String file1 = "C:\\Users\\91837\\OneDrive\\Desktop\\Resume\\BHOGALA MUNESWAR REDDY.pdf";
		String file2 = "C:\\Users\\91837\\OneDrive\\Desktop\\Resume\\MUNESWARA REDDY BHOGALA.docx";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1 + "\n" + file2);
		
		//validate1- Number of files
		int noOfFiles = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		if(noOfFiles == 2){
			System.out.println("All files are successfully uploaded");
		}else {
			System.out.println("files are not uploades");
		}
		
		//validate2 - file names
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("BHOGALA MUNESWAR REDDY.pdf") 
				&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("MUNESWARA REDDY BHOGALA.docx")){
			System.out.println("All Files are matching");
		}else {
			System.out.println("Files are not matching");
		}
	}

}
