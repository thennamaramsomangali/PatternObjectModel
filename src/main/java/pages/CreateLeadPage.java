package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	//PageFactory.initElements() method to initialize all web elements defined with @FindBy annotation.
	//@FindBy annotation to find web elements 
	//Using POM we can create an Object Repository, a set of web elements in separate files along with their associated functions.
	//Thereby keeping code clean.
	//For any change in UI(or web elements) only page object files are required to be updated leaving test files unchanged.
	
	public CreateLeadPage() {
		PageFactory.initElements(driver,this); 
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleSubmitCreateLead;
	
	@And ("enter company name as (.*)")
	public CreateLeadPage enterCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	}
	
	
	@And ("enter first name as (.*)")
	public CreateLeadPage enterFirstName(String data) {
		type(eleFirstName, data);
		return this;
	}
	

	@And ("enter last name as (.*)")
	public CreateLeadPage enterLastName(String data) {
		type(eleLastName, data);
		return this;
	}
	
	@When ("click create lead")
	public ViewLeadPage clickSubmitCreateLead() {
		click(eleSubmitCreateLead);
		return new ViewLeadPage();		
	}
	
}
