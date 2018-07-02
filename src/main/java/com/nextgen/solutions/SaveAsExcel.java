package com.nextgen.solutions;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class SaveAsExcel {
	
	String HomeDir = System.getProperty("user.home")+"\\Downloads\\AccountHistory.xls";	
	Workbook workbook = null;
	
	@SuppressWarnings("static-access")
	public Workbook saveFile() throws BiffException, IOException{
		try {
			this.workbook.getWorkbook(new File(HomeDir));			
			this.workbook.createWorkbook(new File(HomeDir.replace(".xls",".xlsx")));            
        } catch (FileAlreadyExistsException incrCounterAndRetry) {
        }
		return this.workbook;
	}
	
	public static void main(String args[]) throws BiffException, IOException{
		SaveAsExcel save = new SaveAsExcel();
		save.saveFile();
	}

}
