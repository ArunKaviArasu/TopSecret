package Pages;

import Base.BaseUtils;

public class ViewLeadPage extends BaseUtils {


	public ViewLeadPage() {

	}
	
	public ViewLeadPage getTitle() {
		String title = driver.getTitle();
		System.out.println("Verify title  "+title);
		return this;
	}
	
	public OpenTapsPage clickEditButton() {
		driver.findElementByXPath("//a[contains(text(),'Edit')]").click();
		return new OpenTapsPage();
	}
	
	public ViewLeadPage getCompanyName() {
		String textTitle = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(textTitle);
		return this;
	}
	
	public MyLeadsPage DeleteButton() {
		driver.findElementByLinkText("Delete").click();
		return new MyLeadsPage();
	}
	
	public DuplicateLeadPage clickDuplicateButton() {
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		return new DuplicateLeadPage();
	}
	
	public FindLeadPage clickFindLeadID() {
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadPage();
	}
	
	
}
