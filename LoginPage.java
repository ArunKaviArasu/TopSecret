package Pages;

import Base.BaseUtils;

public class LoginPage extends BaseUtils {


	public LoginPage() {

	}

	public LoginPage enterUserName(String uname) {
		driver.findElementById("username").sendKeys(uname);
		return this;
	}

	public LoginPage enterPassword(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
		return this;
	}

	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();

	}
}
