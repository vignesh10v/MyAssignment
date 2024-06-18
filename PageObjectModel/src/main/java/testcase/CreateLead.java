package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import page.LoginPage;

public class CreateLead extends BaseClass {
	
	@BeforeTest()
	public void setvalue() {
		fileName="CreateLead";
	}
	
@Test(dataProvider="fetchData")
 public void createLead(String uname,String pword,String cname,String fname,String lname ) {
	 new  LoginPage(driver)
	 .enterUserName(uname)
	 .enterPassword(pword)
	 .clickLoginButton()
	 .verifyWelcomePage()
	 .clickCRMSFALink()
	 .clickLeadsLink()
	 .myLeadPage()
	 .enterCompanyName(cname)
	 .enterFirstName(fname)
	 .enterLastName(lname)
	 .clickSubmitButton()
	 .verifyLeads();
 }
	

}
