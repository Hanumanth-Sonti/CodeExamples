package com.nextgen.solutions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelUtility  {
		
	private Workbook workbook = null;
	private Sheet sheet=null;
	
	public ExcelUtility(String excelPath) throws Exception{				
		File file = new File(excelPath);			
		try {
			workbook = Workbook.getWorkbook(file);
		}catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.getMessage();
		}				
	} //end of method ExcelConfig
	
	public String getData(int sheetNumber,int row,int column){		
		sheet = workbook.getSheet(sheetNumber);
		String data = sheet.getCell(column, row).getContents();
		return data;
	} //end of method getData
	
	public int getRowCount(int sheetindex){
		return workbook.getSheet(sheetindex).getRows();
	} //end of method getRowCount
	
	public int getColumnCount(int sheetindex){
		return workbook.getSheet(sheetindex).getColumns();
	}
	
	@Test(dataProvider="testdata")
	public void AccountHistory(String transaction,String accountName,
			String accountHistory,String Password) throws Exception{
		System.out.println("Password: "+Password);		
	}	
	
	@DataProvider(name="testdata")
	public Object[][] testData() throws Exception{
		String HomeDir = System.getProperty("user.home")+"\\Downloads\\AccountHistory.csv";
		ExcelUtility excelconfig = new ExcelUtility(HomeDir);
		
		//Get Row and Column Count
		int rows = excelconfig.getRowCount(0);
		int cols = excelconfig.getColumnCount(0);
        
		//Fetch data into array
		Object[][] data = new Object[rows][cols] ;	
		for(int row = 0;row<rows;row++){
			for(int column=0;column<cols;column++){
				data[row][column] = excelconfig.getData(0, row, column);				
			}			
		}
		return data;
	} //end of method testData

	
	/*public static void main(String[] args){		
		String HomeDir = System.getProperty("user.home");
		String excelpath = HomeDir+"\\Downloads\\AccountHistory.xls";
		ExcelUtility input = new ExcelUtility(excelpath);
		input.setInputFile(src);
		input.ReadExcel();
	}*/
	
	/*public void setInputFile(File src){
		this.filePath = src;
	}	*/
	
	/*public void readExcel(){
		// To get the number of rows present in sheet
		int totalNoOfRows = sheet.getRows();

		// To get the number of columns present in sheet
		int totalNoOfCols = sheet.getColumns();

		for (int row = 0; row < totalNoOfRows; row++) {
			for (int col = 0; col < totalNoOfCols; col++) {
				System.out.print(sheet.getCell(col, row).getContents() + "\t");
			}				
		} //end of reading excel		
	} //end of method readExcel
*/	
	/*public void ReadExcel() throws BiffException, IOException {	
			workbook = Workbook.getWorkbook(filePath);			
			System.out.println("Work book loaded");
			sheet = workbook.getSheet(0);
		//	FileOutputStream outputFile = new FileOutputStream(filePath);
		

			// To get the number of rows present in sheet
			int totalNoOfRows = sheet.getRows();

			// To get the number of columns present in sheet
			int totalNoOfCols = sheet.getColumns();

			for (int row = 0; row < totalNoOfRows; row++) {
				for (int col = 0; col < totalNoOfCols; col++) {
					System.out.print(sheet.getCell(col, row).getContents() + "\t");
				}				
			} //end of reading excel		
	}
*/

	
	

}
