package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{

	public EditLeadPage() {

		PageFactory.initElements(driver, this);

	}


	@FindBy(how=How.ID,using="updateLeadForm_firstName")
	private WebElement elefirstName;

	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleUpdateButton;

	@And ("edit first name as (.*)")
	public EditLeadPage editFirstname(String data) {
		type(elefirstName,data);
		return this;

	}

	@Then  ("click update")
	public ViewLeadPage clickUpdateButton() {

		click(eleUpdateButton);
		return new ViewLeadPage();
	}
}