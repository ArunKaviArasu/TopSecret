package Pages;

import org.openqa.selenium.WebElement;

import Base.BaseUtils;

public class DuplicateLeadPage extends BaseUtils {


	public DuplicateLeadPage() {

	}

	public DuplicateLeadPage getPageTitle() {
		String dupTitle = driver.getTitle();
		System.out.println(dupTitle);
		return this;
	}

	public DuplicateLeadPage getFirstName() {
		WebElement firstName = driver.findElementById("createLeadForm_firstName");
		String name = firstName.getText();
		System.out.println(name);
		return this;
	}
	
	public ViewLeadPage clickCreateLeadinDupLead() {
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		return new ViewLeadPage();
	}
}
