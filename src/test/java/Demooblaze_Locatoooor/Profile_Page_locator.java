package Demooblaze_Locatoooor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Demooblaze_Utilittty.Demooblaze_Baase;

public class Profile_Page_locator extends Demooblaze_Baase {
	
	public Profile_Page_locator () {
		
		PageFactory.initElements(driver, this);
	}
 @FindBy (id ="nameofuser")
 public WebElement Profilepage;
}
