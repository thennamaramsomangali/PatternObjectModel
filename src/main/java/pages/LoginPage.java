package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import wdMethods.ProjectMethods;

public class LoginPage extends ProjectMethods{
	
	public LoginPage() {  //LoginPage is a constructor
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(how=How.ID,using="username")
	private WebElement eleUserName;
	
	@Given("enter the username as (.*)")
	public LoginPage enterUserName(String data) {
		type(eleUserName, data);
		return this; ////this returns LoginPage class
	}
	
	
	@FindBy(how=How.ID,using="password")
	private WebElement elePassword;
	
	@And("enter the password as (.*)")
	public LoginPage enterPassword(String data) {
		type(elePassword, data);
		return this;
	}
	
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogin;
	
	@And ("click login")
	public HomePage clickLogIn() {
		click(eleLogin);
		return new HomePage();		
	}
	
	public LoginPage clickLogInForFailer() {  
		click(eleLogin);
		return this;		//for failed login same page will be returned
	}
	
	@FindBy(how=How.ID,using="errorDiv")
	private WebElement eleErrorMsg;
	
	public LoginPage verifyErrorMsg(String data) {
	verifyPartialText(eleErrorMsg, data);
		return this;		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
