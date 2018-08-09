package utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataInputProvider1{

	static XSSFWorkbook workbook;
	static XSSFSheet  sheet;
	static XSSFRow row;
	
	public static Object[][] getSheet(String dataSheetName) {		

		Object[][] data = null ;

		try {			
			 workbook = new XSSFWorkbook("./data/"+dataSheetName+".xlsx");
			 sheet = workbook.getSheetAt(0);	

			// get the number of rows
			int rowCount = sheet.getLastRowNum();
			// get the number of columns
			int columnCount = sheet.getRow(0).getLastCellNum();

			data = new String[rowCount][columnCount];

			// loop through the rows
			for(int i=1; i <rowCount+1; i++){
				try {
					 row = sheet.getRow(i);
					for(int j=0; j <columnCount; j++){ // loop through the columns
						try {
							String cellValue = "";
							try{
								cellValue = row.getCell(j).getStringCellValue();
							}catch(NullPointerException e){

							}
							data[i-1][j]  = cellValue; // add to the data array
						} catch (Exception e) {
							e.printStackTrace();
						}				
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}	
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return data;
	}
	
	
	
public static String getCellValue(String sheetName,int rowNum,int cellNum) throws IOException	{
	
	
	 workbook = new XSSFWorkbook("./data/"+sheetName+".xlsx");
	 sheet = workbook.getSheetAt(0);
	
	String stringCellValue = sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
	
	return stringCellValue;
	
}
	
	
}
