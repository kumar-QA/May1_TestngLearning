package testpages;

import static org.testng.Assert.expectThrows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginFunctionality {

	@Test
	public void verify_Login_withvalid_Data() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://hms.kareclouds.com/site/login");
		WebElement usenameFiled = driver.findElement(By.id("email"));
		WebElement passwordFiled = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		usenameFiled.sendKeys("superadmin@gmail.com");
		passwordFiled.sendKeys("Admin@123");
		loginBtn.click();
		String Expectedvalue="Kareclouds Hospital & Research Center";
		String ActualValue= driver.getTitle();
		 Assert.assertEquals(ActualValue, Expectedvalue);
		
	}
	
	
	
	
//	
//	@Test
//	public void verifyLoginWith_invalidData() {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://hms.kareclouds.com/site/login");
//		WebElement usenameFiled = driver.findElement(By.id("email"));
//		WebElement passwordFiled = driver.findElement(By.id("password"));
//		WebElement loginBtn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
//		usenameFiled.sendKeys("fsfewf@gmail.com");
//		passwordFiled.sendKeys("fewewgwgw@123");
//		loginBtn.click();
//	}
//	
//	@Test
//	public void verifyLogin_with_ValidUserName_And_invalidPassword() {
//		WebDriver driver = new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://hms.kareclouds.com/site/login");
//		WebElement usenameFiled = driver.findElement(By.id("email"));
//		WebElement passwordFiled = driver.findElement(By.id("password"));
//		WebElement loginBtn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
//		usenameFiled.sendKeys("superadmin@gmail.com");
//		passwordFiled.sendKeys("fewewgwgw@123");
//		loginBtn.click();
//		
//	}
//	
//	@Test
//	public void verifyLogin_with_InValidUserName_And_ValidPassword() {
//		WebDriver driver = new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://hms.kareclouds.com/site/login");
//		WebElement usenameFiled = driver.findElement(By.id("email"));
//		WebElement passwordFiled = driver.findElement(By.id("password"));
//		WebElement loginBtn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
//		usenameFiled.sendKeys("sdvfr@gmail.com");
//		passwordFiled.sendKeys("Admin@123");
//		loginBtn.click();
//		
//	}
//	
//	@Test
//	public void verifyLoginWithoutUsernameAndPassword() {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://hms.kareclouds.com/site/login");
//		WebElement loginBtn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
//		loginBtn.click();
//	}
//	
//	
//	
//	

}
