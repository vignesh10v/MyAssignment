package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame {

	public static void main(String[] args){
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement element =driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(element);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
	Alert confirm=driver.switchTo().alert();
		String str=confirm.getText();
		System.out.println(str);
		confirm.accept(); 
		
}
}
