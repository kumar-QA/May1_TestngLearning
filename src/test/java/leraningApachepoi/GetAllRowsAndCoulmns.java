package leraningApachepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetAllRowsAndCoulmns {

	public static void main(String[] args) throws IOException {

		FileInputStream fi = new FileInputStream("C:\\excelsheet\\TestData.xlsx");
		XSSFWorkbook wo = new XSSFWorkbook(fi);
		XSSFSheet sh = wo.getSheet("loginInfo");
		int rowcount = sh.getPhysicalNumberOfRows();
		System.out.println("Total no of row in excel sheet:  " + rowcount);
		int columncount = sh.getRow(1).getPhysicalNumberOfCells();
		System.out.println("No of cells in row1 are:   "+columncount);
		
		for (int i = 0; i < rowcount; i++) {
			   XSSFRow    r=sh.getRow(i);
			for (int j = 0; j < columncount; j++) {
				   System.out.print("  "+r.getCell(j).getStringCellValue());
			}
			System.out.println();	
		}
		

	}

}
