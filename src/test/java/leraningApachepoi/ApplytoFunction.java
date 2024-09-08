package leraningApachepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplytoFunction {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		WebElement usernameInputFiled = driver.findElement(By.id("username"));
		WebElement passwordinputfiled = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("submit"));
		FileInputStream fi = new FileInputStream("C:\\excelsheet\\TestData.xlsx");
		XSSFWorkbook wo = new XSSFWorkbook(fi);
		XSSFSheet sh = wo.getSheet("loginInfo");
		int rowcount = sh.getPhysicalNumberOfRows();
		System.out.println("Total no of row in excel sheet:  " + rowcount);

		for (int i = 1; i < rowcount; i++) {
			
			Thread.sleep(2000);
			usernameInputFiled.sendKeys(sh.getRow(i).getCell(0).getStringCellValue());
			Thread.sleep(2000);
			passwordinputfiled.sendKeys(sh.getRow(i).getCell(1).getStringCellValue());
			Thread.sleep(2000);
			loginBtn.click();
		}

	}

}
