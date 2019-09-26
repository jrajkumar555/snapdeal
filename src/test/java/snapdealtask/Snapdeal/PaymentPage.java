package snapdealtask.Snapdeal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends BasePage{
	public PaymentPage()
	{
		PageFactory.initElements(driver,this);
	}
@FindBy(id="make-payment")
private WebElement payment;
public WebElement getPayment() {
	return payment;
}

}
