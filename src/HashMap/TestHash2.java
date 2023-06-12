package HashMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;

import java.io.IOException;


import java.util.HashMap;

public class TestHash2 {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> ref=new HashMap<>();
        Workbook wb= WorkbookFactory.create(new FileInputStream("../A:\\Core Java\\Selenium\\Selenium\\Excel File\\Book1.xlsx"));
        Sheet s=wb.getSheet("Sheet1");

        int rowcount=s.getLastRowNum();

        for (int rownum=0;rownum<rowcount;rownum++)
        {
            Row r=s.getRow(rownum);
            short cellcount = r.getLastCellNum();

            for (int cellnum=0;cellnum<cellcount;cellnum++)
            {
                String key=r.getCell(cellnum).toString();
                String value=s.getRow(rownum).getCell(cellnum).toString();
                ref.put(key,value);
            }
        }
        System.out.println(ref);

    }
}
