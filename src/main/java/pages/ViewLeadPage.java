package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{

	public ViewLeadPage() {

		PageFactory.initElements(driver,this);
	}


	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleFirstName;

	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleEditButton;

	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleDuplicateLeadButton;

	

	public ViewLeadPage verifyFistName(String verifyName) {
		verifyExactText(eleFirstName, verifyName);
		return this;
	}

	@Then ("click edit")
	public EditLeadPage clickEdit() {
		click(eleEditButton);
		return new EditLeadPage();

	}

	public DuplicateLeadPage clickDuplicateLead() {
		click(eleDuplicateLeadButton);
		return new DuplicateLeadPage();
	}


	@FindBy(how=How.XPATH,using="//a[text()='Delete']")
	private WebElement eleDelete;
	
	@Then ("click delete")
	public  MyLeadsPage clickDelete() {
		click(eleDelete);
		return new MyLeadsPage();
	}

}















