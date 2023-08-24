package Demooblaze_Locatoooor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Demooblaze_Utilittty.Demooblaze_Baase;

public class Homepage_locator extends Demooblaze_Baase {
	
	public Homepage_locator  () {
		PageFactory.initElements(driver, this);
		
	}
    @FindBy (id="signin2")
    public WebElement Signup;
    @FindBy (id="login2")
    public WebElement LoooginLink;
    @FindBy (linkText = "Samsung galaxy s6")
    public WebElement Samsungs6;
}
