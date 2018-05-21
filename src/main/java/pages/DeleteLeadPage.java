package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class DeleteLeadPage extends ProjectMethods{
	
	public DeleteLeadPage() {  //LoginPage is a constructor
		PageFactory.initElements(driver,this);
	}
	
	/*@FindBy(how=How.XPATH,using="//a[text()='Delete']")
	private WebElement eleDelete;
	
	
	public  MyLeadsPage clickDelete() {
		click(eleDelete);
		return new MyLeadsPage();*/
	}
	

