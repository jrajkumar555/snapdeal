package snapdealtask.Snapdeal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage extends BasePage{
	
	public SelectPage()
	{
		PageFactory.initElements(driver,this);
	}
	
@FindBy(xpath=("//p[@title='Apple iPhone 6s ( 32GB , 2 GB ) Gold']"))
private WebElement selecttitle;
public WebElement getSelecttitle() {
	return selecttitle;
}

}
