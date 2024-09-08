package testpages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleAlerts {
	
	
	@Test(priority = 2,description = "normalAlertTesting")
	public void Alert1() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}
	
	@Test(priority = 3,description = "confiramationAlertTesting")
	public void Alert2() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	
	@Test(priority = 1,description = "propmtAlertTesting")
	public void Alert3() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
		Alert alt=driver.switchTo().alert();
		Thread.sleep(2000);
		   alt.sendKeys("hi kumar");
		   Thread.sleep(2000);
		   alt.dismiss();
	}


}
