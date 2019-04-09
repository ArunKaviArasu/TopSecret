package Pages;

import Base.BaseUtils;

public class MyHomePage extends BaseUtils{

	public MyHomePage() {

	}

	public MyLeadsPage clickLeads() {

		driver.findElementByLinkText("Leads").click();
//		driver.findElementByXPath("//a[contains(text(), 'Leads')]").click();
		return new MyLeadsPage();
	}
}
