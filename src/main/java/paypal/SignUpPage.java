package paypal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pages.CreateLeadPage;
import wdMethods.ProjectMethods;

public class SignUpPage extends ProjectMethods{


	public SignUpPage() {
		PageFactory.initElements(driver,this); 

	}

	@FindBy(how=How.ID,using="country")
	private WebElement eleCountry;

	@FindBy(how=How.ID,using="email")
	private WebElement eleEmail;

	@FindBy(how=How.ID,using="password")
	private WebElement elePwd;

	@FindBy(how=How.ID,using="confirmPassword")
	private WebElement eleCnfPwd;

	@FindBy(how=How.ID,using="radio-personal")
	private WebElement signUPbutton;


	public SignUpPage selectCountry(String data) {
		selectDropDownUsingText(eleCountry,data);
		return this;
	}

	public SignUpPage enterEmail(String data) {

		type(eleEmail,data);
		return this;
	}

	public SignUpPage enterPwd(String data) {
		type(elePwd,data);
		return this;
	}

	public SignUpPage enterConfPwd(String data) {
		type(eleCnfPwd,data);
		return this;
	}
}
