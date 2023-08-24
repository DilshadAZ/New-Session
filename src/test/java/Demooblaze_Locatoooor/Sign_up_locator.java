package Demooblaze_Locatoooor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Demooblaze_Utilittty.Demooblaze_Baase;

public class Sign_up_locator extends Demooblaze_Baase{
 public Sign_up_locator () {
	 PageFactory.initElements(driver, this);	 
 }
  @FindBy (id ="sign-username")
  public WebElement UserName;
  @FindBy (id ="sign-password")
  public WebElement PAssword;
  @FindBy (xpath ="//button[text()='Sign up']")
  public WebElement Signupbutton;
  
  
}
