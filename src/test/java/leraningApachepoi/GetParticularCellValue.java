package leraningApachepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetParticularCellValue {

	public static void main(String[] args) throws IOException {
	FileInputStream fi=new FileInputStream("C:\\excelsheet\\TestData.xlsx");
	XSSFWorkbook wo=new XSSFWorkbook(fi);
    XSSFSheet sh =wo.getSheet("loginInfo");
     XSSFRow  r=sh.getRow(1);
      String data   =r.getCell(0).getStringCellValue();
      System.out.println(data);

	}

}
