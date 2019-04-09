package Pages;

import Base.BaseUtils;

public class OpenTapsPage extends BaseUtils{

	public OpenTapsPage() {
		
	}
	
	public OpenTapsPage editCompanyName() {
		driver.findElementByXPath("(//input[@name='companyName'])[2]").clear();
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("CTS");
		return this;
		
	}
	
	public ViewLeadPage clickUpdateButton() {
		driver.findElementByName("submitButton").click();
		return new ViewLeadPage();
	}
}
