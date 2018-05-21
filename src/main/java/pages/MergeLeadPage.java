package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods{
	
	public MergeLeadPage() {
		
		PageFactory.initElements(driver, this);
		
		
	}
		
		@FindBy(how=How.XPATH,using="//input[@id='partyIdFrom']/following::a/img")
		private WebElement eleFromLead;
		
			
		public FindLeadPageWhileMergeLead clickfromlead() {
			click(eleFromLead);
			switchToWindow(2);
			return new FindLeadPageWhileMergeLead();
		}
		
		@FindBy(how=How.XPATH,using="//input[@id='partyIdTo']/following::a/img")
		private WebElement eleToLead;
		
			
		public FindLeadPageWhileMergeLead clickTolead() {
			click(eleToLead);
			switchToWindow(2);
			return new FindLeadPageWhileMergeLead();
		}
		
		@FindBy(how=How.XPATH,using="//a[text()='Merge']")
		private WebElement eleMergeButton;
		
			
		public MergeLeadPage clickMergeleadbutton() {
			clickWithNoSnap(eleMergeButton);
			acceptAlert();
			return this;
		}
		
	

}
