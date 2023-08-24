package Demooblaze_Actiooon;

import Demooblaze_Locatoooor.Sign_up_locator;
import Demooblaze_TestDataa.Demooblaze_testDataa;
import Demooblaze_Utilittty.Demooblaze_Baase;

public class Sign_up_actionnon extends Demooblaze_Baase{
	
	Sign_up_locator signuplocator = new Sign_up_locator();
	
	public void UserName() {
		signuplocator.UserName.sendKeys(Demooblaze_testDataa.user);
		
	}
	public void Password() {
		signuplocator.PAssword.sendKeys(Demooblaze_testDataa.password);
	}
	public void Signup_button() throws Exception {
		signuplocator.Signupbutton.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
}
}