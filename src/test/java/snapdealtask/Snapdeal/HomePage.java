package snapdealtask.Snapdeal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{
	public HomePage()
	
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="inputValEnter")
	private WebElement entervalue;
	@FindBy(xpath="//button[@class='searchformButton col-xs-4 rippleGrey']")
	private WebElement search;
	public WebElement getEntervalue() {
		return entervalue;
	}
	public WebElement getSearch() {
		return search;
	}
	
	}

