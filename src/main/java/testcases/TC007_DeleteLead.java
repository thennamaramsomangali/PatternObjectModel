package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_DeleteLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC007_DeleteLead";
		testDescription="Delete lead";
		testNodes="Leads";
		category="Smoke";
		authors="Ganesh";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test(dataProvider="fetchData")
	public void MergeLead(String uName,String pwd,String fName) {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.enterFirstName(fName)
		.clickFindLeadsButton()
		.getLeadID()
		.clickFirstLeadID()
		.clickDelete()
		.clickFindLeads()
		.enterLeadID(leadID)
		.clickFindLeadsButton()
		.verifyIsDeleted();



	}
}
