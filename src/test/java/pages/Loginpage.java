package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	public WebDriver driver;

	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(id = "username")
	WebElement username;

	@FindBy(xpath = "//input[@type=\"password\"]")
	WebElement password;

	@FindBy(className = "btn")
	WebElement loginBtn;

	public void perfomLogin(String uname,String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
	}

}
