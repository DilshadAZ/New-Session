package Demooblaze_Actiooon;

import Demooblaze_Locatoooor.ProductPAge_Locator;
import Demooblaze_Utilittty.Demooblaze_Baase;

public class ProductPage_action extends Demooblaze_Baase {
	ProductPAge_Locator productpage = new ProductPAge_Locator();
	
	public void Addto_cart() {
		productpage.Addtocartbutton.click();
	}
	public void Cart_link() throws Exception {
		productpage.Cartlink.click();	
	
	}
}
