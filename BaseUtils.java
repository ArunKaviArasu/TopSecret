package Base;

import java.io.IOException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseUtils {

	public String ExcelName;
	public static ChromeDriver driver;

	@Parameters({"url"})

	@BeforeMethod
	public void login(String url) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		/*	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(uname);
		driver.findElementById("password").sendKeys(pwd);
		driver.findElementByClassName("decorativeSubmit").click();*/
	}

	@AfterMethod
	public void close() {
		driver.close();	
	}

	@DataProvider(name = "fetchData")
	public String [][] getData() throws IOException{
		return Utils.ReadExcel.getReadExcel(ExcelName);
	}
}
