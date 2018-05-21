package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{

	public MyHomePage() {
		// TODO Auto-generated constructor stub

		PageFactory.initElements(driver,this);
	}


	@FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement eleLeads;



	@And ("click lead")
	public MyLeadsPage clickLeads() {
		click(eleLeads);
		return new MyLeadsPage();		
	}




}












