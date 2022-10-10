package utilites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataprovider {
	 
	public String Exceldata(String filepath,String Sheetname,int row,int cell,String username) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream(filepath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(Sheetname);
		   Row r = sh.getRow(row);
		        Cell c = r.getCell(cell);
		        String val = c.getStringCellValue();
		        return val;
	}

}
