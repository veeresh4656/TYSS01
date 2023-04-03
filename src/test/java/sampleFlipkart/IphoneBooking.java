package sampleFlipkart;


import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Flipkart.Pom.HomePage;
import com.Generic.Flipkart.BaseClass;

public class IphoneBooking extends BaseClass{

	@Test
	public void iphoneBooking() {
		
		HomePage hp=new HomePage(driver);
		hp.popup();
		hp.searchTextBox();
		hp.getIphoneMob();
	}

}
