package OIPPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.SeleniumDriver;

public class OIPHomePage {
	
	static WebDriver driver=null;
	
	public OIPHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Search API or keyword']")
	WebElement searchField;
	
	@FindBy(xpath="//button[contains(.,'Search')]")
	WebElement searchBtn;
	
	public WebElement searchField()
	{
		return searchField;
	}
	
	public WebElement searchBtn()
	{
		return searchBtn;
	}
	

	

}
