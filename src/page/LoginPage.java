package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import generic.Basepage;
import script.ValidLogin;

public class LoginPage extends Basepage {
	
	@FindBy (xpath=("//a[text()=' HOLIDAYS ']"))
	private WebElement holidays;
	
	@FindBy (xpath=("//a//span[.='Special Trains']"))
	private WebElement spt;
	
	@FindBy (xpath=("//a[@class='a']/..//span[.='Tourist Train']"))
	private WebElement tt;
	
	@FindBy (xpath=("//a[text()=' HOLIDAYS ']"))
	private WebElement td;
	
	//a//span[.='Special Trains']
	@FindBy (name=("pwd"))
	private WebElement pwTB;
	
	Actions action;
	WebDriverWait wait;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		action=new Actions(driver);
		//verifyPageisDisplayed(driver, "Railways Tourism, Retiring Rooms, Holidays Customized Tours, LTC Tours, Maharajas, Mahaparinirvan");
		JavascriptExecutor j=(JavascriptExecutor)driver;
	}
	
	public void clickonholiday()
	{
	action.moveToElement(holidays).perform();
	action.moveToElement(spt).perform();
	tt.click();
	
	//wait.until(ExpectedConditions.titleIs("Railways Tourism, Retiring Rooms, Holidays Customized Tours, LTC Tours, Maharajas, Mahaparinirvan"));
	td.click();
	}	
}
