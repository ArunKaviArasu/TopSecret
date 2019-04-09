package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.BaseUtils;

public class CreateLeadPage extends BaseUtils {


	public CreateLeadPage() {

	}

	public CreateLeadPage enterCompanyName(String cname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		return this;
	}

	public CreateLeadPage enterFirstName(String fname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		return this;
	}

	public CreateLeadPage enterLastName(String lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
		return this;
	}

	public CreateLeadPage selectSource() {
		WebElement srcSource = driver.findElementById("createLeadForm_dataSourceId");
		Select sel = new Select(srcSource);
		sel.selectByIndex(3);
		return this;
	}

	public CreateLeadPage selectMarketingCampaign() {
		WebElement srcMarket = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropdown = new Select (srcMarket);
		dropdown.selectByValue("CATRQ_CARNDRIVER");
		return this;
	}
	
	public CreateLeadPage enterPhoneNumber(String pNum) {
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(pNum);
		return this;
	}
	
	public CreateLeadPage enterCreateEmailID(String eMail) {
		driver.findElementById("createLeadForm_primaryEmail").sendKeys(eMail);
		return this;
	}
	
	public ViewLeadPage clickSubmit() {
		driver.findElementByClassName("smallSubmit").click();
		return new ViewLeadPage();
	}
}
