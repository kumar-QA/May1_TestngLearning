package leraningApachepoi;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InsertDataIntoExcelShhet {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wo=new XSSFWorkbook();
	    XSSFSheet	sh=wo.createSheet("loginInfo");
	    XSSFRow r=sh.createRow(0);
	           r.createCell(0).setCellValue("Username");
	           r.createCell(1).setCellValue("Password");
	    
	           XSSFRow r1=sh.createRow(1);
	           r1.createCell(0).setCellValue("abc@gmail.com");
	           r1.createCell(1).setCellValue("abc123");
	           
	           XSSFRow r2=sh.createRow(2);
	           r2.createCell(0).setCellValue("xyz@gmail.com");
	           r2.createCell(1).setCellValue("xyz123");
	           
	  FileOutputStream fo=new FileOutputStream("C:\\excelsheet\\TestData.xlsx");         
	           
		wo.write(fo);
	
	}

}
