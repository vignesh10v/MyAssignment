package page;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewLeadPage extends BaseClass{
	
	public ViewLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public ViewLeadPage verifyLeads(){
		String text=driver.getTitle();
		 if (text.contains("Leaftaps")) {
			 System.out.println("Succesfully verified");
		 }
		 else {
			 System.out.println(" Succesfully not verified");
		 }
		 return this;
	 }
		
	}

