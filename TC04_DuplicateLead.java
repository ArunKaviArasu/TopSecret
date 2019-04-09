package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseUtils;
import Pages.LoginPage;

public class TC04_DuplicateLead extends BaseUtils {

	
	@BeforeTest
	public void setData() {
		ExcelName = "DuplicateLead";
	
	}
	
	@Test(dataProvider = "fetchData")
	public void EditLead(String uname, String pwd, String eMailID) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.FindLeadButton()
		.clickEmailIDTab(eMailID)
		.clickFindLead()
		.clickFirstLeadID()
		.clickDuplicateButton()
		.getPageTitle()
		.getFirstName()
		.clickCreateLeadinDupLead();
		
		
		
		
		
		
	}
}
