
package ia_app;


import java.io.File;
import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;



public class IA_App {
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        StartFrame f = new StartFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        /*
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
        
    }    

    
}
