package Demooblaze_Locatoooor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Demooblaze_Utilittty.Demooblaze_Baase;

public class Cartpage_locator extends Demooblaze_Baase{
	public Cartpage_locator () {
		PageFactory.initElements(driver, this);
	}
	 @FindBy( xpath ="//td[text()='Samsung galaxy s6']")
		public WebElement Cartverified;
}
