package snapdealtask.Snapdeal;


public class ScriptPage extends BasePage{
	
	public static void main(String[] args) throws InterruptedException
	{
		launchBrowser();
		loadurl("https://www.snapdeal.com");
		getTitle();
		getCurrentUrl();
		HomePage hp=new HomePage();
		fill(hp.getEntervalue(),"iphone 6");
		btnclick(hp.getSearch());
		SelectPage sp=new SelectPage();
		btnclick(sp.getSelecttitle());
		wait1();
		window();
		windows();
		BuyPage bp=new BuyPage();
		btnclick(bp.getBuynow());
		FormPage fp=new FormPage();
		fill(fp.getPincode(),"654455");
		fill(fp.getFullname(),"rajkumar");
		fill(fp.getAddress(),"53/4,adyar");
		fill(fp.getLandmark(),"avaainagar");
		fill(fp.getCity(),"Chennai");
		fill(fp.getState(),"TamilNadu");
		fill(fp.getMobile(),"8838091132");
		btnclick(fp.getAddresstype());
		btnclick(fp.getSave());
		PaymentPage pp=new PaymentPage();
		btnclick(pp.getPayment());
		FinalPage ff=new FinalPage();
		fill(ff.getCardnum(),"889876787677657");
		SVT(ff.getMonth(),"12");
		SVT(ff.getYear(),"24");
		fill(ff.getCvv(),"737");
}
}
