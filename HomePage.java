package Pages;

import Base.BaseUtils;

public class HomePage extends BaseUtils {


	public HomePage() {

	}
	public MyHomePage clickCRMSFA() {

		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();

	}

}
