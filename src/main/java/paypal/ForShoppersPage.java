package paypal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pages.CreateLeadPage;
import wdMethods.ProjectMethods;

public class ForShoppersPage extends ProjectMethods{


	public ForShoppersPage() {
		PageFactory.initElements(driver,this); 

	}

	@FindBy(how=How.ID,using="radio-personal")
	private WebElement eleIsselected;

	@FindBy(how=How.LINK_TEXT,using="Next")
	private WebElement eleNext;

	public ForShoppersPage verifyForShopper() {
		eleIsselected.click();

		return this;
	}

	public SignUpPage clickNext() {

		eleNext.click();
		return new SignUpPage();
	}


}
