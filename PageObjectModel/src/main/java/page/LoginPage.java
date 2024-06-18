package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public LoginPage enterUserName(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
		/*LoginPage cd =new LoginPage()
		  cd.enterName()*/
		return this;
	}
	
	public LoginPage enterPassword(String pword) {
		driver.findElement(By.id("password")).sendKeys(pword);
		return this;
	}
	
	public WelcomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		/*WelcomePage cd =new WelcomePage()
		  cd.enterName()*/
		return new WelcomePage(driver);
	}


	
}
