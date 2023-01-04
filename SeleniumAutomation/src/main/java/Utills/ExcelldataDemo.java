package Utills;

public class ExcelldataDemo {
	public static void main(String []args) {
		
		
Excelldata excell=new Excelldata("C:\\Users\\ajyot\\eclipse-workspace1\\SeleniumAutomation\\Excel\\Data.xlsx","sheet1");

excell.getcelldata(0, 0);
excell.GetcelldataNumber(1, 1);




	}

}
 