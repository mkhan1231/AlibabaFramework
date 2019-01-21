package com.xlsx.api;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;

public class MyDataReader {
    protected XSSFSheet ExcelSheet;
    protected XSSFWorkbook ExcelBook;
    protected XSSFCell Cell;
    protected XSSFRow Row;

    public void setExcelFile(String Path) throws Exception {
        try {
            FileInputStream ExcelFile = new FileInputStream(Path);
            ExcelBook = new XSSFWorkbook(ExcelFile);
            //ExcelSheet = ExcelBook.getSheet(SheetName);
        } catch (Exception e){
            throw (e);
        }
    }

    @SuppressWarnings("null")
    public String[][] getExcelSheetData(String sheetname) throws Exception {
        String[][] data = null;
        String[][] mydata = null;
        if (ExcelBook != null) {
            XSSFSheet sheet = ExcelBook.getSheet(sheetname);
            if (sheet != null) {
                int rows = sheet.getLastRowNum();
                int cols = sheet.getRow(sheet.getLastRowNum()).getPhysicalNumberOfCells();
                int arrayrow = rows+1;
                data = new String[arrayrow][cols];
                mydata = new String[rows][cols];
                for (int i = 0; i < arrayrow; i++) {
                    for (int j = 0; j < cols; j++) {
                        org.apache.poi.ss.usermodel.Cell cell = sheet.getRow(i).getCell(j);
                        String cellData = cell.getStringCellValue();
                        data[i][j] = cellData;
                    }
                }
                // copied array to get rid of header row
                for(int m=0; m<rows; m++){
                    for (int n=0; n<cols; n++){
                        mydata[m][n] = data[m+1][n];
                    }
                }
            }
        }
        return mydata;
    }
}
