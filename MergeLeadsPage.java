package Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;

import Base.BaseUtils;

public class MergeLeadsPage extends BaseUtils {


	public MergeLeadsPage() {

	}

	public MergeLeadsPage getPageTitle() {
		String dupTitle = driver.getTitle();
		System.out.println(dupTitle);
		return this;
	}

	public MergeLeadsPage clickFromLead(String fromLead) throws InterruptedException {
		driver.findElementByXPath("//img[@alt='Lookup']").click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> lst = new ArrayList<>();
		lst.addAll(allWindows);
		driver.switchTo().window(lst.get(1));
		String childWindow = driver.getTitle();
		System.out.println(childWindow);
		driver.switchTo().window(lst.get(1));
		driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys(fromLead);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		driver.switchTo().window(lst.get(0));
		driver.switchTo().defaultContent();
		return this;
		}
	
	public MergeLeadsPage clickToLead(String toLead) throws InterruptedException {
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		Set<String> cAllWindows = driver.getWindowHandles();
		List<String> cLst = new ArrayList<>();
		cLst.addAll(cAllWindows);
		/*String titleBrowser = driver.getTitle();
		System.out.println(titleBrowser);*/
		driver.switchTo().window(cLst.get(1));
		String browTitle = driver.getTitle();
		System.out.println(browTitle);
		driver.findElementByXPath("(//label[contains(text(),'Lead ID:')]/following::input)[1]").sendKeys(toLead);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		driver.switchTo().window(cLst.get(0));
		return this;
	}
	
	public ViewLeadPage clickMergerButton() {
		driver.findElementByLinkText("Merge").click();
		driver.switchTo().alert().accept();
		return new ViewLeadPage();
	}
}
