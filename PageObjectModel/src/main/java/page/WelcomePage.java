package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class WelcomePage extends BaseClass{
	
	public WelcomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	public WelcomePage verifyWelcomePage() {
		 String text=driver.getTitle();
		 if (text.contains("Leaftaps")) {
			 System.out.println("HomePage is displayed");
		 }
		 else {
			 System.out.println("HomePage is not displayed");
		 }
		 return this;
	 }
	
	
	public  MyHomePage clickCRMSFALink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	 }
}
