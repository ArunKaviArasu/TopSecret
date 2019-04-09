package Pages;

import Base.BaseUtils;

public class MyLeadsPage extends BaseUtils {

	public  MyLeadsPage() {
	}
		
		public CreateLeadPage createLeadButton() {
			
			driver.findElementByLinkText("Create Lead").click();
			return new CreateLeadPage();
		}
		
		public FindLeadPage FindLeadButton() {
			driver.findElementByLinkText("Find Leads").click();
			return new FindLeadPage();
		}
		
		public FindLeadPage clickFindLeadLNav() throws InterruptedException {
			driver.findElementByXPath("//a[@href = '/crmsfa/control/findLeads']").click();
			Thread.sleep(2000);
			return new FindLeadPage();
		}
		
		public MergeLeadsPage clickMergeLeads() {
			driver.findElementByXPath("//a[text()='Merge Leads']").click();
			return new MergeLeadsPage();
		}
	}
