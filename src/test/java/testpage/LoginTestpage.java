package testpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.Loginpage;

public class LoginTestpage {
	
	@DataProvider
	public String[][] testdata() {
		String obj[][]= {{"abc","abc123"},{"student","Password123"},};
		return obj;
	}
	WebDriver driver;
	
	
	@Test(dataProvider = "testdata")
	public void verifylogin(String u,String p) {
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		Loginpage lp=new Loginpage(driver);
		lp.perfomLogin(u,p);
	}

}
