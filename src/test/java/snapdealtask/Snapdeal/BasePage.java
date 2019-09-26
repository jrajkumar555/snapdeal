package snapdealtask.Snapdeal;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
		static WebDriver driver;
		public static WebDriver launchBrowser()
		{
		
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	driver=new ChromeDriver();
	return driver;
	}
		public static void loadurl(String url)
		{
			driver.get(url);
		
	}
		
		public static void fill(WebElement e,String value)
		{
			
			e.sendKeys(value);
	}
		public static void btnclick(WebElement e)
		{
			e.click();
		}
		
		public static void getTitle()
		{
			String title=driver.getTitle();
			System.out.println(title);
			
		}
		public static void getCurrentUrl()
		{
			String url=driver.getCurrentUrl();
			System.out.println(url);
		}
	public static void SBI(WebElement e,int index)
	{
		
		Select s=new Select(e);
		s.selectByIndex(index);
	}
	public static void SBV(WebElement e,String value)
	{
		
		Select s=new Select(e);
		s.selectByValue(value);
	}
	public static void SVT(WebElement e,String value)
	{
		
		Select s=new Select(e);
		s.selectByVisibleText(value);
	}
	public static void wait1() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
	}
	public static void window()
	{
		String s1=driver.getWindowHandle();
	}
	public static void windows()
	{
		Set<String> windows=driver.getWindowHandles();
		for (String x:windows) {
		driver. switchTo().window(x);
		}}}
	   
	
		
