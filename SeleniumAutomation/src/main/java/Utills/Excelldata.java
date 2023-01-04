package Utills;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelldata {
	
	 static XSSFWorkbook Workbook;
	 
	 public static void main(String []args) {
		// GetRowCount();
		// getcelldata(0,0);
		// GetcelldataNumber(1,1);
	 }
	 public Excelldata(String Excellpath ,String sheetname) {
		 try {
		 Workbook = new XSSFWorkbook(Excellpath);
			XSSFSheet sheet=Workbook.getSheet(sheetname); 
		 } catch (IOException exp) {
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
	 }
	
public static void GetRowCount() {

	
	try {
		Workbook = new XSSFWorkbook("C:\\Users\\ajyot\\eclipse-workspace1\\SeleniumAutomation\\Excel\\Data.xlsx");
		XSSFSheet sheet=Workbook.getSheet("sheet1");
		int rowcount=sheet.getPhysicalNumberOfRows();
		System.out.println("number of row count is:"+rowcount);
	} catch (IOException exp) {
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());
		exp.printStackTrace();
	}
	
	
	}
	public static void getcelldata(int rowNum,int colNum) {
		try {
			Workbook = new XSSFWorkbook("C:\\Users\\ajyot\\eclipse-workspace1\\SeleniumAutomation\\Excel\\Data.xlsx");
			XSSFSheet sheet=Workbook.getSheet("sheet1");
			String celldata=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(celldata);
			
		} catch (IOException exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
		
	
	     }
	
	
	public static void GetcelldataNumber(int rowNum,int colNum) {
		try {
			Workbook = new XSSFWorkbook("C:\\Users\\ajyot\\eclipse-workspace1\\SeleniumAutomation\\Excel\\Data.xlsx");
			XSSFSheet sheet=Workbook.getSheet("sheet1");
			double celldata=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(celldata);
			
		} catch (IOException exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
		
	
	     }
	}
	
	

	


