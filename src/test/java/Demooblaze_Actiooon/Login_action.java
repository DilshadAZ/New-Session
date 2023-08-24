package Demooblaze_Actiooon;

import Demooblaze_Locatoooor.Login_Locator;
import Demooblaze_TestDataa.Demooblaze_testDataa;

public class Login_action  {
	
	Login_Locator loginlocator = new Login_Locator ();
	
	public void User___namepasswordlogin(String u, String p) {
		loginlocator.UserrrrName.sendKeys(u);
		loginlocator.PAaaaassword.sendKeys(p);
		loginlocator.Logginbutton.click();
	}
}
