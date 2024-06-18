package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass {
	
	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateLeadPage enterCompanyName(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		/*CreateLead cd =new CreateLead
		  cd.enterCompanyName()*/
		return this;
	}
	
	public CreateLeadPage enterFirstName(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}
	
	public CreateLeadPage enterLastName(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}
	
	public ViewLeadPage clickSubmitButton() {
		
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
		
	}
	
	
	

}
