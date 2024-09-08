package testpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.Loginpage;

public class productTestpage {
WebDriver driver=new ChromeDriver();
	
	@Test
	public void verifySearchProduct() {
		Loginpage lp=new Loginpage(driver);
		lp.perfomLogin("student", "Password123");
		
	}
}
