package Demooblaze_Steppdeff;


import Demooblaze_Actiooon.Cartpage_Action;
import Demooblaze_Actiooon.Homepage_actions;
import Demooblaze_Actiooon.ProductPage_action;
import Demooblaze_Utilittty.Demooblaze_Baase;
import cucumber.api.java.en.Then;

public class Demoblaze_CartpageVerified extends Demooblaze_Baase{
	Homepage_actions homepageactionsssss = new Homepage_actions ();
	ProductPage_action productpage = new ProductPage_action ();
	Cartpage_Action cartpage = new Cartpage_Action ();


	@Then("^Click Samsung Galaxys(\\d+)$")
	public void click_Samsung_Galaxys(int arg1) throws Throwable {
		homepageactionsssss.SamsungGAlaxylink();
	}

	@Then("^Click Add to cart$")
	public void click_Add_to_cart() throws Throwable {
		productpage.Addto_cart();
	}

	@Then("^Click cart link$")
	public void click_cart_link() throws Throwable {
		productpage.Cart_link();
	}

	@Then("^Verify user can add item in cart$")
	public void verify_user_can_add_item_in_cart() throws Throwable {
		cartpage.verifiedcartpage();
	}
}
