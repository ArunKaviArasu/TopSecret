package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseUtils;
import Pages.LoginPage;

public class TC05_MergeLead extends BaseUtils {

	
	@BeforeTest
	public void setData() {
		ExcelName = "MergeLead";
	
	}
	
	@Test(dataProvider = "fetchData")
	public void EditLead(String uname, String pwd, String fromLead, String toLead, String rLead) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLeads()
		.clickFromLead(fromLead)
		.clickToLead(toLead)
		.clickMergerButton()
		.clickFindLeadID()
		.enterMergeFromID(rLead)
		.clickFindLead()
		.getMergeLeadMessage();
				
	}
}
