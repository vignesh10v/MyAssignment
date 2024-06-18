package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyHomePage extends BaseClass {
	
	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public MyLeadPage clickLeadsLink(){
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadPage(driver);
	}

}
