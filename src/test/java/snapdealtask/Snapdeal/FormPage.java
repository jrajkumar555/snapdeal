package snapdealtask.Snapdeal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage extends BasePage{
public FormPage()
{
	PageFactory.initElements(driver,this);
}
@FindBy(id="zip")
private WebElement pincode;
@FindBy(id="fullName")
private WebElement fullname;
@FindBy(id="address")
private WebElement address;
@FindBy(id="nearestLandmark")
private WebElement landmark;
@FindBy(id="city")
private WebElement city;
@FindBy(id="state")
private WebElement state;
@FindBy(id="mobile")
private WebElement mobile;
@FindBy(xpath="//*[@id='shipping-address-form']/div/div[10]/div/div[1]/label/span[1]")
private WebElement addresstype;
@FindBy(xpath="//span[text()='SAVE AND CONTINUE']")
private WebElement save;
public WebElement getPincode() {
	return pincode;
}
public WebElement getFullname() {
	return fullname;
}
public WebElement getAddress() {
	return address;
}
public WebElement getLandmark() {
	return landmark;
}
public WebElement getCity() {
	return city;
}
public WebElement getState() {
	return state;
}
public WebElement getMobile() {
	return mobile;
}
public WebElement getAddresstype() {
	return addresstype;
}
public WebElement getSave() {
	return save;
}

}
