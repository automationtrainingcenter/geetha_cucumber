package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper  {

	Workbook book;
	Sheet sheet;
	
	private String getFilePath(String folderName, String fileName) {
		return System.getProperty("user.dir") + File.separator + folderName + File.separator + fileName;
	}

	// set excel file to read the data
	public void setExcel(String folderName, String fileName, String sheetName) {
		try {
			FileInputStream fis = new FileInputStream(getFilePath(folderName, fileName));
			if (fileName.endsWith("xls")) {
				book = new HSSFWorkbook(fis);
			} else if (fileName.endsWith("xlsx")) {
				book = new XSSFWorkbook();
			}
			sheet = book.getSheet(sheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// count number of rows with data
	public int rowCount() {
		return sheet.getLastRowNum();
	}

	// count number of columns with data
	public int columnCount() {
		return sheet.getRow(sheet.getFirstRowNum()).getLastCellNum();
	}

	// read data from a cell
	public String readData(int rnum, int cnum) {
		String data;
		Cell cell = sheet.getRow(rnum).getCell(cnum);
		CellType cellType = cell.getCellType();
		switch (cellType) {
		case STRING:
			data = cell.getStringCellValue();
			break;
		case NUMERIC:
			int i = (int) cell.getNumericCellValue();
			data = Integer.toString(i);
		default:
			data = "";
			break;
		}
		return data;
	}

	// read complete data from the table
	public List<List<String>> getSheetData(String folderName, String fileName, String sheetName) {
		setExcel(folderName, fileName, sheetName);
		int nor = rowCount();
		int noc = columnCount();
		List<List<String>> data = new ArrayList<>();
		for (int i = 1; i < nor+1; i++) {
			List<String> row = new ArrayList<>();
			for (int j = 0; j < noc; j++) {
				 row.add(readData(i, j));
			}
			data.add(row);
		}
		return data;
	}

	public static void main(String[] args) {
		ExcelHelper excel = new ExcelHelper();
        List<List<String>> roleData = excel.getSheetData("resources", "testdata.xls", "roleData");
        for(List<String> row : roleData){
            for(String cell : row){
                System.out.print(cell+"\t");
            }
            System.out.println();
        }
	}

}
