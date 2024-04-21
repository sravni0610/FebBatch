package Webdriver;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {

    public static void main(String args[]) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Books");


        Object [][] bookdata = {{"Selenium","Emv",400},
                {"Muanual","RGR",800},
                {"TestMethods","Diver",900}};

        int rowcount = 0;

        for (Object[] abook : bookdata) {

            Row row = sheet.createRow(++rowcount);

            int columncount = 0;
            for(Object field : abook){
                Cell cell = row.createCell(++columncount);

                if(field instanceof String){
                    cell.setCellValue((String)field);
                } else if (field instanceof  Integer) {
                    cell.setCellValue((Integer)field);
                }

            }
            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\sravn\\Documents\\feb2024\\multi\\test123.xlsx");
            workbook.write(outputStream);
        }


    }
}
