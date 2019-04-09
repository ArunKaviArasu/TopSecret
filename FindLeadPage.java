package Pages;

import org.openqa.selenium.WebElement;

import Base.BaseUtils;

public class FindLeadPage extends BaseUtils{

	public FindLeadPage() {

	}

	public FindLeadPage enterName(String ename) {
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(ename);
		return this;
	}

	public FindLeadPage clickFindLead() throws InterruptedException {
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(3000);
		return this;
	}

	public ViewLeadPage clickFirstLeadID() {
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").click();
		return new ViewLeadPage();
	}

	public FindLeadPage clickPhoneNumTab() throws InterruptedException {
		driver.findElementByXPath("(//span[@class ='x-tab-strip-text '])[2]").click();
		Thread.sleep(3000);
		return this;
	}

	public FindLeadPage enterPhoneNumber(String pNum) {
		driver.findElementByXPath("(//input[@name = 'phoneNumber'])[1]").sendKeys(pNum);
		return this;
	}

	public ViewLeadPage clickFirstResultPhoneNumber() {
		WebElement leadID = driver.findElementByXPath("(//div[@class ='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		String text = leadID.getText();
		System.out.println("First Lead ID "+text);
		String replaceText = text.replaceAll("[^0-9]", "");
		System.out.println(replaceText);		
		driver.findElementByXPath("(//div[@class ='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		return new ViewLeadPage();
	}

	public FindLeadPage enterFirstFindLeadID() {
		driver.findElementByXPath("(//label[contains(text(), 'Lead ID')]/following::input)[1]").sendKeys("10127");
		return this;
	}
	
	public FindLeadPage getResultText() {
		String errorMessage = driver.findElementByXPath("//div[@class = 'x-paging-info']").getText();
		System.out.println("The Error Message  "+errorMessage);
		return this;
	}
	
	public FindLeadPage clickEmailIDTab(String eMailID) throws InterruptedException {
		driver.findElementByXPath("(//span[@class ='x-tab-strip-text '])[3]").click();
		driver.findElementByXPath("(//input[@name='emailAddress'])[1]").sendKeys(eMailID);
		Thread.sleep(2000);
		return this;
	}
	
	public ViewLeadPage clickFirstResultEmailLeadID() {
		WebElement emailID = driver.findElementByXPath("(//div[@class ='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a");
		String text = emailID.getText();
		System.out.println(text);
		driver.findElementByXPath("(//div[@class ='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		return new ViewLeadPage();
	}
	
	public FindLeadPage enterMergeFromID(String rLead) throws InterruptedException {
		driver.findElementByXPath("((//div[@class='x-form-element'])/input)[13]").sendKeys(rLead);
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		Thread.sleep(3000);
		return this;
	}
	
	public FindLeadPage getMergeLeadMessage() {
		WebElement strText = driver.findElementByXPath("//div[@class='x-paging-info']");
		 String text = strText.getText();		 
		 System.out.println(text);
		 return this;
	}
	
	
	public MergeLeadsPage clickMergeLead() {
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		return new MergeLeadsPage();
	}
	
	
	
	
	
}
