package Demooblaze_Steppdeff;

import Demooblaze_Actiooon.Homepage_actions;
import Demooblaze_Actiooon.Login_action;
import Demooblaze_Actiooon.Profile_Page_action;
import Demooblaze_Actiooon.Sign_up_actionnon;
import Demooblaze_Utilittty.Demooblaze_Baase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Demooblaze_Signup extends Demooblaze_Baase {
	
	Homepage_actions homepageaction = new Homepage_actions ();
	Sign_up_actionnon signupactiionn = new Sign_up_actionnon();
	Login_action loginaction = new Login_action ();
	Profile_Page_action profilepageaction = new Profile_Page_action ();
	
	@Given("^Opennnn the \"([^\"]*)\" Application$")
	public void opennnn_the_Application(String URL) throws Throwable {
		Demo_launchURL(URL);
	}


  @Then("^Click Sign-up$")
  public void click_Sign_up() throws Throwable {
	  homepageaction.Sign_up();
  
}
	@Then("^Enter UserName$")
	public void enter_UserName() throws Throwable {
		signupactiionn.UserName();
		Thread.sleep(5000);
	}

	@Then("^Enter Password$")
	public void enter_Password() throws Throwable {
		signupactiionn.Password();
		Thread.sleep(5000);
	}

	@Then("^Click signinnnn button$")
	public void click_signinnnn_button() throws Throwable {
		signupactiionn.Signup_button();
	}
	@Given("^Opennnn theeee \"([^\"]*)\" Application$")
	public void opennnn_theeee_Application(String URL) throws Throwable {
		Demo_launchURL(URL);
	}
	@Then("^Click Log--in$")
	public void click_Log_in() throws Throwable {
		homepageaction.Log_in_link();
	}

	@Then("^Enter UssssserNamepassword$")
	public void enter_UssssserNamepassword() throws Throwable {
		loginaction.User___namepasswordlogin(demo.getProperty("UserName"),demo.getProperty("Password"));
	
	}
	@Then("^Verify user should logggin$")
	public void verify_user_should_logggin() throws Throwable {
		profilepageaction.Pro_file_page();
	}


}
