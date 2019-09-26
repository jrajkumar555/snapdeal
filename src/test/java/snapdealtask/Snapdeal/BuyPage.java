package snapdealtask.Snapdeal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyPage extends BasePage{
	public BuyPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id='buy-button-id']/span")
	private WebElement buynow;
	public WebElement getBuynow() {
		return buynow;
	}

}
