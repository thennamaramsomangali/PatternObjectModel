package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_MergeLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC005_MergeLead";
		testDescription="Merge lead";
		testNodes="Leads";
		category="Smoke";
		authors="Ganesh";
		browserName="chrome";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public void MergeLead(String uName,String pwd,String fromleadID ,String toleadID) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLeads()
		.clickfromlead()
		.enterfromlead(fromleadID)
		.clickfindleadbutton()
		.clickfirstFromleadid()
		.clickTolead()
		.enterfromlead(toleadID)
		.clickfindleadbutton()
		.clickfirstToleadid()
		.clickMergeleadbutton();
		
		
	}
}
