package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import page.LoginPage;

public class RunLogin extends BaseClass {
	
	public void setvalue() {
		fileName="Login";
	}
	
	@Test(dataProvider="fetchData")
	public void runLogin(String uname , String pword) {
		
		new LoginPage(driver)
		.enterUserName(uname)
		.enterPassword(pword)
		.clickLoginButton();
		
	}

}
