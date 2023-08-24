package Demooblaze_Utilittty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Demooblaze_Baase {
	public static WebDriver driver;
	public static Properties demo;
	
	public Demooblaze_Baase () {
	try {
		FileInputStream dmofile = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\Demooblaze_Config\\Demooblaze_Config.Properties");
		demo = new Properties();
		demo.load(dmofile);
	} catch (FileNotFoundException e) {
		System.out.println("Please check the constructor");
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}	
	}
    public void Demooblaze_browser () {
    	String  demobrowser = demo.getProperty("Browser7");
    	if (demobrowser.equalsIgnoreCase("Chrome7")) {
    		System.setProperty("Webdriver.chrome.driver" , (System.getProperty("user.dir") + "Chrome_DRiver_c/chromedriver.exe"));
		  	ChromeOptions oop = new ChromeOptions();
		  	oop.addArguments("--remote-allow-origin*=");
		  	driver = new ChromeDriver();
		  	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  	driver.manage().window().maximize();
    	}
    else if (demobrowser.equalsIgnoreCase("Edge00")) {
		System.setProperty("Webdriver.edge.driver" , (System.getProperty("user.dir") + "Cccchrome__driver/chromedriver.exe"));
	  	EdgeOptions oo = new EdgeOptions();
	  	oo.addArguments("--remote-allow-origin*=");
	  	driver = new EdgeDriver();
	  	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  	driver.manage().window().maximize();
	
}
}
    public static void Demo_launchURL ( String URL) {
    	Demoblaze_Utilityyy.takeMyScreenshot(driver, "Home Page"); 
   	 driver.get(demo.getProperty("DURL"));









    }
}