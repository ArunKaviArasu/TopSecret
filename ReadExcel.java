package Utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Base.BaseUtils;

public class ReadExcel extends BaseUtils{

	public static String[][] getReadExcel(String filename) throws IOException {

		@SuppressWarnings("resource")
		XSSFWorkbook wBook = new XSSFWorkbook("./data/"+filename+".xlsx");

		XSSFSheet sheet = wBook.getSheetAt(0);

		int rowCount = sheet.getLastRowNum();
		short columnCount = sheet.getRow(0).getLastCellNum();

		String [][] data = new String [rowCount][columnCount];
		for (int j = 1; j <= rowCount; j++) {
			//Go to Row
			XSSFRow row = sheet.getRow(j);
			for (int i = 0; i < columnCount; i++) {
				//Go to Column
				XSSFCell cell = row.getCell(i);
				CellType ct = cell.getCellType();
				if(ct==CellType.NUMERIC) {
					double numericCellValue = cell.getNumericCellValue();
					System.out.println((int)numericCellValue);
				}	else if (ct==CellType.STRING) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
					data[j-1][i] = stringCellValue;
				}
			}

		}
		return data;

	}

}
