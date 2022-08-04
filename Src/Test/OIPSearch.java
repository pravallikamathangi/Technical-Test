package OIPTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import OIPPages.OIPHomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.SeleniumDriver;

public class OIPSearch{
	
	WebDriver driver=null;
	public final static int TIMEOUT=30;
	public final static int PAGE_LOAD_TIMEOUT = 50;
	private static WebDriverWait waitDriver;
	OIPHomePage oiph;
	@BeforeTest
	public void invokeBrowser()
	{
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();*/
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		waitDriver = new WebDriverWait(driver, TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);	
	}
	
	@Test
	public void login() throws InterruptedException
	{
		driver.get("https://exchange.oip.tmrnd.com.my");
		Thread.sleep(6000);
		oiph = new OIPHomePage(driver);
		oiph.searchField().click();
		oiph.searchField().sendKeys("apple");
		Thread.sleep(5000);
		oiph.searchBtn().click();		
	}

}
