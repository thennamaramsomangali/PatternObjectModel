package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadPageWhileMergeLead extends ProjectMethods{

	public FindLeadPageWhileMergeLead() {

		PageFactory.initElements(driver, this);


	}


	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement eleEnterFromLeadID;

	@FindBy(how=How.XPATH,using="//button[@class='x-btn-text']")
	private WebElement eleFindLeadsButton;

	@FindBy(how=How.XPATH,using="//a[text()='10863']")
	//@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleFirstFromLeadsID;

	@FindBy(how=How.XPATH,using="//a[text()='10864']")
	//@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleFirstToLeadsID;
	
	
	
	
	


	public FindLeadPageWhileMergeLead enterfromlead(String data) {
		type(eleEnterFromLeadID,data);
		return this;
	}

	public FindLeadPageWhileMergeLead clickfindleadbutton() {
		click(eleFindLeadsButton);
		return this;

	}


	public MergeLeadPage clickfirstFromleadid() {

		clickWithNoSnap(eleFirstFromLeadsID);
		switchToWindow(0);
		return new MergeLeadPage();
	}

	public MergeLeadPage clickfirstToleadid() {

		clickWithNoSnap(eleFirstToLeadsID);
		switchToWindow(0);
		return new MergeLeadPage();
		
	}
		
		
	}





