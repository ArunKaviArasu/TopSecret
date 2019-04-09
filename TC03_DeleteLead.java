package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseUtils;
import Pages.LoginPage;

public class TC03_DeleteLead extends BaseUtils {

	
	@BeforeTest
	public void setData() {
		ExcelName = "DeleteLead";
	
	}
	
	@Test(dataProvider = "fetchData")
	public void EditLead(String uname, String pwd, String pNum) throws InterruptedException {
		new LoginPage()
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.FindLeadButton()
		.clickPhoneNumTab()
		.enterPhoneNumber(pNum)
		.clickFindLead()
		.clickFirstResultPhoneNumber()
		.DeleteButton()
		.FindLeadButton()
		.enterFirstFindLeadID()
		.clickFindLead()
		.getResultText();
		
		
		
		
	}
}
