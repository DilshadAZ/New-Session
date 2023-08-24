package Demooblaze_Locatoooor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Demooblaze_Utilittty.Demooblaze_Baase;

public class ProductPAge_Locator extends Demooblaze_Baase{
   public ProductPAge_Locator () {
	   PageFactory.initElements(driver, this);
   }
   @FindBy( xpath ="//a[text()='Add to cart']")
	public WebElement Addtocartbutton;
   @FindBy( id ="cartur")
  	public WebElement Cartlink;
}
