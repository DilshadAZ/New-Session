package Demooblaze_Locatoooor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Demooblaze_Utilittty.Demooblaze_Baase;

public class Login_Locator  extends Demooblaze_Baase{
   
	public Login_Locator () {
		 PageFactory.initElements(driver, this);	
	}
	@FindBy( id ="loginusername")
	public WebElement UserrrrName;
	  @FindBy (id ="loginpassword")
	  public WebElement PAaaaassword;
	  @FindBy (xpath ="//button[text()='Log in']")
	  public WebElement Logginbutton;
}
