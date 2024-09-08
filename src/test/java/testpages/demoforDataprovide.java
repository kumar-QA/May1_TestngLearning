package testpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class demoforDataprovide {
	
	@DataProvider
	public String[][] TestData() {	
		String[][] credentails= {
				 {"abc@gmail.com","abc123"},
				  {"def@gmail.com","def123"},
				   {"12345@gmail.com","1234566"},
				   {"$%^&*@gmail.com","#$%^&*("},
				   {"superadmin@gmail.com","Admin@123"}
				    
		           };
		return credentails;
	}
	
	
	@Test(dataProvider ="TestData" )
	public void Login(String uname,String pwd) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://hms.kareclouds.com/site/login");
		WebElement usenameFiled = driver.findElement(By.id("email"));
		WebElement passwordFiled = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		usenameFiled.sendKeys(uname);
		passwordFiled.sendKeys(pwd);
		Thread.sleep(2000);
		loginBtn.click();
	}
	
	@Test(dataProvider = "TestData")
	public void m2(String a,String b) {
		
		System.out.println(a + " " +b);
	}

}
