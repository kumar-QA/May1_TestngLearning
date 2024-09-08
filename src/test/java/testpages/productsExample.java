package testpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class productsExample {
	@Test
	public void verifyProductsPageLink() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//i[@class=\"nav-icon fas fa-book\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"/Admin/Product/List\"]")).click();
		String expected="Products";
		String Actual =driver.getTitle();
//		
//		Assert.assertEquals(Actual, expected);
		
		Assert.assertTrue(expected.equals(Actual));
	}

}
