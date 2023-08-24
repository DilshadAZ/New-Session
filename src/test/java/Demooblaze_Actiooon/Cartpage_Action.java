package Demooblaze_Actiooon;

import org.testng.Assert;

import Demooblaze_Locatoooor.Cartpage_locator;
import Demooblaze_Utilittty.Demoblaze_Utilityyy;
import Demooblaze_Utilittty.Demooblaze_Baase;

public class Cartpage_Action extends Demooblaze_Baase{
	Cartpage_locator cartpageLocate = new Cartpage_locator ();
	
 public void verifiedcartpage () {
	boolean cartvefidication =  cartpageLocate.Cartverified.isDisplayed();
	Assert.assertTrue(cartvefidication);
	Demoblaze_Utilityyy.takeMyScreenshot(driver, "CartPage");
 }
}
