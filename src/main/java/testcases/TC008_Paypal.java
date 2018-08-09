package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import paypal.HomePagePaypal;
import wdMethods.ProjectMethods;

public class TC008_Paypal extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_Paypal";
		testDescription="signup";
		testNodes="Leads";
		category="Smoke";
		authors="Ganesh";
		browserName="chrome";
		dataSheetName="TC008";
	}
	
	
	@Test(dataProvider="fetchData")
	public void SignUp(String country,String email ,String pwd,String confpwd ) {
		
		new HomePagePaypal()
		.signupbutton()
		.verifyForShopper()
		.clickNext()
		.selectCountry(country)
		.enterEmail(email)
		.enterPwd(pwd)
		.enterConfPwd(confpwd);
		
	}

}
