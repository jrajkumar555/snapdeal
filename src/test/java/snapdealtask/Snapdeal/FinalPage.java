package snapdealtask.Snapdeal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalPage extends BasePage{
	public FinalPage() {
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath="//input[@class='card_number change_card_fill']")
private WebElement cardnum;
@FindBy(id="CS2")
private WebElement month;
@FindBy(id="CS3")
private WebElement year;
@FindBy(xpath="//input[@placeholder='CVV']")
private WebElement cvv;
public WebElement getCardnum() {
	return cardnum;
}
public WebElement getMonth() {
	return month;
}
public WebElement getYear() {
	return year;
}
public WebElement getCvv() {
	return cvv;
}

}
