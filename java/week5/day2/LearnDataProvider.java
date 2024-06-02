package week5.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProvider extends BaseClass {

	@DataProvider(name ="fetchdata")
	public String[][] data() {
		String[][] dp=new String[2][3];
		dp[0][0] ="shan";
		dp[0][1] ="R";
		dp[0][2] ="Qegale";
		
		dp[1][0] ="hari";
		dp[1][1] ="s";
		dp[1][2] ="TestLeaf";
		
		return dp;
	}
	
	@Test(dataProvider="fetchdata")
	public void createLead(String companyName,String fname,String lname) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("companyName");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("fname");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lname");
		driver.findElement(By.name("submitButton")).click();
		driver.close();
	}
}
