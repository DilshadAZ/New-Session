package Demooblaze_Actiooon;

import org.testng.Assert;

import Demooblaze_Locatoooor.Profile_Page_locator;
import Demooblaze_Utilittty.Demoblaze_Utilityyy;
import Demooblaze_Utilittty.Demooblaze_Baase;

public class Profile_Page_action extends Demooblaze_Baase{
	Profile_Page_locator profilepagelocator = new Profile_Page_locator ();
	
	public void Pro_file_page () throws Exception {
		
		Thread.sleep(3000);
		boolean Lodinverify =profilepagelocator.Profilepage.isDisplayed();
				Assert.assertTrue(Lodinverify);
				Demoblaze_Utilityyy.takeMyScreenshot(driver, "Profile Page");
	}
	
	
}
