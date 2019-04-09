package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseUtils;
import Pages.LoginPage;

public class TC01_CreateLead extends BaseUtils {

	
	@BeforeTest
	public void setData() {
		ExcelName = "CreateLead";
	
	}
	
	@Test(dataProvider = "fetchData")
	public void CreateLead(String uname, String pwd, String cname, String fname, String lname, String pNum, String eMail) {
		new LoginPage()
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.createLeadButton()
		.enterCompanyName(cname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.selectSource()
		.selectMarketingCampaign()
		.enterPhoneNumber(pNum)
		.enterCreateEmailID(eMail)
		.clickSubmit();
		
		
	}
}
