package paypal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pages.CreateLeadPage;
import wdMethods.ProjectMethods;

public class HomePagePaypal extends ProjectMethods{

	
	public HomePagePaypal() {
		PageFactory.initElements(driver,this); 
		}

	@FindBy(how=How.ID,using="signup-button")
	private WebElement elesignupbutton;
	
	public ForShoppersPage signupbutton() {
		elesignupbutton.click();
		return new ForShoppersPage();
	}
}
