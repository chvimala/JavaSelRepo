package selenium.helperClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 * @Class: ReadXlsDataHelper
 * @Description: This class is a helper class used to read the data from the excel file
 * @author Rama Reddy Mullamgi
 */
public class ReadXlsxDataHelper extends BaseClass
{
	private String inputFile;
	private static int rowValue=0;
	private static int columnvalue=0;

	/**
	 * @param inputFile
	 * Sets the input file
	 */
	public void setInputFile(String inputFile)
	{
		this.inputFile = inputFile;
	}

	/**
	 * @param filename
	 * @param sheetName
	 * @param rowValue 
	 * @return Map<String,String> this will read the data and it even reads empty cell
	 * @throws BiffException
	 * @throws IOException
	 */


	public static HashMap<String,String> getXlsxRowDataAsMap(String xlName, String sheetName,int rowValue) throws Exception
	{

		HashMap hmRowData = new HashMap();

		String pathAppend = getCurrentDirecorty()+"\\src\\test\\java\\selenium\\testData";
		
		String completepath=pathAppend+"/"+xlName+".xlsx";	

		//			File myFile = new File("C://temp/Employee.xlsx"); 
		File myFile = new File(completepath); 
		FileInputStream fis = new FileInputStream(myFile);
		// Finds the workbook instance for XLSX file 
		XSSFWorkbook myWorkBook = new XSSFWorkbook (fis);
		// Return first sheet from the XLSX workbook
		XSSFSheet mySheet = myWorkBook.getSheet(sheetName); 

		//		System.out.println(mySheet.getRow(0).getCell(1));

		//	Get iterator to all the rows in current sheet 
		Iterator<Row> rowIterator = mySheet.iterator();
		// Traversing over each row of XLSX file
		Row row;
		while (rowIterator.hasNext()) {
			row = rowIterator.next(); 
			if(0==row.getRowNum()){
				row =rowIterator.next();
			}	

			if(rowValue==row.getCell(0).getNumericCellValue()) {


				// For each row, iterate through each columns
				Iterator<Cell> cellIterator = row.cellIterator(); 
				while (cellIterator.hasNext()) { 

					Cell cell = cellIterator.next(); 
					if(0==cell.getColumnIndex()) cell = cellIterator.next();				

					switch (cell.getCellType()) { 
					case Cell.CELL_TYPE_STRING:
						hmRowData.put((mySheet.getRow(0).getCell(cell.getColumnIndex()).toString()),cell.getStringCellValue());						 
						break; 
					case Cell.CELL_TYPE_NUMERIC: 
						hmRowData.put((mySheet.getRow(0).getCell(cell.getColumnIndex()).toString()),cell.getNumericCellValue());
						break; 
					case Cell.CELL_TYPE_BOOLEAN:
						hmRowData.put((mySheet.getRow(0).getCell(cell.getColumnIndex()).toString()),cell.getBooleanCellValue());						
						break;
					default :
					} 
				}

				break;
			}
		}

		return hmRowData;
	}



}