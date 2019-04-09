package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseUtils;
import Pages.LoginPage;

public class TC02_EditLead extends BaseUtils {

	
	@BeforeTest
	public void setData() {
		ExcelName = "EditLead";
	
	}
	
	@Test(dataProvider = "fetchData")
	public void EditLead(String uname, String pwd, String ename) throws InterruptedException {
		new LoginPage()
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.FindLeadButton()
		.enterName(ename)
		.clickFindLead()
		.clickFirstLeadID()
		.getTitle()
		.clickEditButton()
		.editCompanyName()
		.clickUpdateButton()
		.getCompanyName();
		
		
		
	}
}
