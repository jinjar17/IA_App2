
package ia_app;


import java.io.File;
import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.*;



public class IA_App {
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        /*StartFrame f = new StartFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        
        FileInputStream fis = new FileInputStream(new File("games.xls"));
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet sheet = wb.getSheetAt(0);
        FormulaEvaluator forEval = wb.getCreationHelper().createFormulaEvaluator();
        
        for(Row row : sheet){
            for(Cell cell : row){
                switch(forEval.evaluateInCell(cell).getCellType()){
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t\t");
                        break;
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getStringCellValue() + "\t\t");
                        break;
                }
            }
            System.out.println("");
            
        }
        */
        
        try{
            String test[] = {"hello", "hey", "what's up"};
            HSSFWorkbook wb = new HSSFWorkbook();
            HSSFSheet sheet = wb.createSheet("testing");
            
            Row heading = sheet.createRow(0);
            for(int i = 0; i < 3; i++){
                heading.createCell(i).setCellValue(test[i]);
            }
            for(int i = 0; i < 3; i++){
                HSSFCellStyle styleHeading = wb.createCellStyle();
                Font font = wb.createFont();
                font.setBold(true);
                font.setFontName(HSSFFont.FONT_ARIAL);
                font.setFontHeightInPoints((short)11);
                styleHeading.setFont(font);
                styleHeading.setVerticalAlignment(CellStyle.ALIGN_CENTER);
                heading.getCell(i).setCellStyle(styleHeading);
                sheet.autoSizeColumn(i);
            }
            //change the file based on school or home computer
            FileOutputStream out = new FileOutputStream(new File("C:\\Users\\Jaron Jin\\Documents\\NetBeansProjects\\IA_App\\testing.xls"));
            wb.write(out);
            out.close();
            wb.close();
            
                
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }    

    
}
