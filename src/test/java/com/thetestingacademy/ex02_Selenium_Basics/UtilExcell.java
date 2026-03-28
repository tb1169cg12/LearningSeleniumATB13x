package com.thetestingacademy.ex02_Selenium_Basics;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UtilExcell {

    //apachje poi
    // read file
    // workbook create
    //sheet
    //rows and cells
    //2d object-get data
    static Workbook book;
    static Sheet sheet;

    public static String SHEET_PATH=System.getProperty("user.dir")+"src/test/resources/Untitled spreadsheet.xlsx";

    public static Object[][] getTestDatafromexcell(String sheetName) throws IOException {
        FileInputStream file = null;
        try {
            file= new FileInputStream(SHEET_PATH);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        book = WorkbookFactory.create(file);
        sheet = book.getSheet(sheetName);

        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
                data[i][j] = sheet.getRow(i+1).getCell(j).toString();

            }
        }

        return null;
    }
    @DataProvider
    public Object[][] getdata() throws IOException {
        return getTestDatafromexcell("sheet1");
    }
}
