
package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ActionClass {

	public static void main(String[] args) throws IOException{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement ele =driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		Actions scroll =new Actions(driver);
		scroll.scrollToElement(ele).perform();
	String str=	ele.getText();
	System.out.println(str);
	
	File src =driver.getScreenshotAs(OutputType.FILE);
	File dest =new File(".//screensot//amazon.png");
	FileUtils.copyFile(src, dest);
		
		

}
}
