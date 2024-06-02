package week4.day2;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		
	ChromeDriver driver = new ChromeDriver();
	driver.get("https:erail.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement from =driver.findElement(By.xpath("//input[@placeholder='From Station']"));
	from.clear();
	from.sendKeys("MAS",Keys.ENTER);
	WebElement to =driver.findElement(By.xpath("//input[@placeholder='To Station']"));
	to.clear();
	to.sendKeys("MDU",Keys.ENTER);
	
	driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
List <WebElement> list = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
Set<String> set = new TreeSet<String>();
	for (WebElement trainName :list) {
		String str =trainName.getText();
		set.add(str);
	}
	System.out.println("set  "+set.size());
	System.out.println("list  "+list.size());
	System.out.println(set);
	if (set.size()==list.size()) {
		System.out.println("NO dublicate name" );
	}else {
		System.out.println("Dublicate name" );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}