package testpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebtableHadling {
	WebDriver driver;
	
	@BeforeTest
	public void lauchBrowser() {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://omayo.blogspot.com/");
	}
	
	@AfterTest
	public void browserclose() {
		driver.close();
		
	}
	
	
	@Test
	public void gettableHeaderCellValue() {
		
		WebElement secondcell = driver.findElement(By.xpath("//table[@id=\"table1\"]/thead/tr/th[3]"));
		String result = secondcell.getText();
		System.out.println(result);
	}

	@Test
	public void gettablebodyCellValue() {
		WebElement firstcell = driver.findElement(By.xpath("//table[@id=\"table1\"]/tbody/tr[2]/td[3]"));
		String result = firstcell.getText();
		System.out.println(result);
	}
}
