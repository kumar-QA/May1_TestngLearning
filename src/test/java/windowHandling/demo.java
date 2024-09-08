package windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();

		String parentWindow = driver.getWindowHandle();
		System.out.println("parent window id  :" + parentWindow);

		driver.findElement(By.id("newWindowBtn")).click();

		Set<String> ids = driver.getWindowHandles();

		Iterator<String> windowsid = ids.iterator();

		String parentid = windowsid.next();
		String childid = windowsid.next();

		driver.switchTo().window(childid);
		driver.findElement(By.id("firstName")).sendKeys("kumar");
		
		driver.switchTo().window(parentid);
		
		driver.findElement(By.id("name")).sendKeys("bye");
	}

}
