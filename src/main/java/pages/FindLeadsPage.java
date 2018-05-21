package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods {

	public FindLeadsPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(how=How.NAME,using="id")
	private WebElement eleLeadID;

	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFirstName;
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadsButton;

	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleFirstLeadID;

	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement eleEnterLeadID;

	@FindBy(how=How.XPATH,using="//div[@class='x-paging-info']")
	private WebElement eleNoRecordsInfo;

	
	@And ("enter lead id as (.*)")
	public  FindLeadsPage enterLeadID(String data) {

		type(eleEnterLeadID,data);
		return this;
	}

	
	public FindLeadsPage enterFirstName(String data){
		type(eleFirstName, data);
		return this;
	}
	
	@When ("click find lead")
	public  FindLeadsPage clickFindLeadsButton() {

		click(eleFindLeadsButton);
		return this;
	}
	
	@And ("select first leadid")
	public  ViewLeadPage clickFirstLeadID() {
		click(eleFirstLeadID);
		return new ViewLeadPage();
	}


	public FindLeadsPage getLeadID() {
		leadID= getLeadID(eleFirstLeadID);
		return this;
	}

	public FindLeadsPage verifyIsDeleted() {

		verifyPartialText(eleNoRecordsInfo, "No records to display");
		return this;
	} 
	
	
}