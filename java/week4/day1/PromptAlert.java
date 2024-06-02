package week4.day1;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert{
	

	public static void main(String[] args){
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following::span")).click();
		Alert prompt =driver.switchTo().alert();
		  String aa = prompt.getText();
		  System.out.println(aa);
		  prompt.sendKeys("vicky");
		  prompt.dismiss();
		 String text= driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		 System.out.println(text);
	 }
}

