package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.testng.annotations.Test;

public class t1 {

	
	@Test
	public void r1() throws IOException
	{
	File f= new File("G:\\Appa\\4453 CHITTOOR TERMINAL MOBILE.xlsx\\");
    FileInputStream fis= new FileInputStream(f);
    
    HSSFWorkbook x= new HSSFWorkbook(fis);
    // reach the sheet
    HSSFSheet sheet = x.getSheetAt(0);
    
    // number of rows
    int row=sheet.getLastRowNum();
    System.out.println("Number of rows "+ row);
    
    // number of columns 
    // row 0
    int col=sheet.getRow(0).getLastCellNum();
    System.out.println("Number of columns "+ col);
    
    // row index, column index    1,1
   HSSFCell data = sheet.getRow(0).getCell(1);
   System.out.println(data);
   
   // write // row index, column index 
   //36,4
   sheet.getRow(6).createCell(6).setCellValue("write file");
   FileOutputStream fos= new FileOutputStream(f);
   x.write(fos);
   
   
//column
   
   // column 0, row will change
   
   for(int i=0;i<row; i++)
   {
   
	  // 0,0    1,0  2,0    70,0
   HSSFCell data1 = sheet.getRow(i).getCell(0);
   System.out.println(data1);
   }
   
   /*
   // fetch a row, column will chage
   
   for(int i=0;i<col; i++)
   {
   
	   //0,0  0,1  0,2  0,3  0,4 0,5

   HSSFCell data2 = sheet.getRow(0).getCell(i);
   System.out.println(data2);
   }
   */

	}

	
}
