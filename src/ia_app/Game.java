
package ia_app;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;

public class Game {
private int attempts;
private int makes;
private int threeAttempt;
private int threeMakes;
private static int nextGameID = 1;
private int gameID;


    public Game() throws FileNotFoundException{
        this.attempts = 0;
        this.makes = 0;
        this.threeAttempt = 0;
        this.threeMakes = 0;
        this.gameID = nextGameID;
        nextGameID++;
        
    }
    
    public void addAttempts(){
        this.attempts++;
    }
    
    public void addMake(){
        addAttempts();
        this.makes++;
    }
   
    public void addThreeAttempts(){
        this.attempts++;
        this.threeAttempt++;
    }
    
    public void addThreeMakes(){
        this.attempts++;
        this.threeAttempt++;
        this.makes++;
        this.threeMakes++;
    }
    
    public void save(){
        String attemptsTxt = attempts + "";
        String makesTxt = makes + "";
        String threeAttemptTxt = threeAttempt + "";
        String threeMakesTxt = threeMakes + "";
        String gameIDTxt = gameID + "";
        try{
            String dataLabels[] = {gameIDTxt, attemptsTxt, makesTxt, threeAttemptTxt, threeMakesTxt};
            String headingLabels[] = {"Game ID", "Attempts", "Makes", "3Pt Attempts", "3Pt Makes"};
            FileInputStream fis = new FileInputStream (new File("C:\\Users\\Jaron Jin\\Documents\\NetBeansProjects\\IA_App\\testing.xls"));
            HSSFWorkbook wb = new HSSFWorkbook(fis);
            HSSFSheet sheet = wb.getSheet("testing");
            
            Row heading = sheet.createRow(0);
            for(int i = 0; i < headingLabels.length; i++){
                heading.createCell(i).setCellValue(headingLabels[i]);
            }
            
            Row data = sheet.createRow(gameID);
            for (int i = 0; i < dataLabels.length; i++){
                data.createCell(i).setCellValue(dataLabels[i]);
            }
            
            for(int i = 0; i < headingLabels.length; i++){
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
            FileOutputStream out = new FileOutputStream(new File("C:\\Users\\Jaron Jin\\Documents\\NetBeansProjects\\IA_App\\testing.xls"));
            wb.write(out);
            out.close();
            wb.close();
            
                
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        /*
        try{
            String test[] = {gameIDTxt, attemptsTxt, makesTxt, threeAttemptTxt, threeMakesTxt};
            String headingLabels[] = {"Game ID", "Attempts", "Makes", "3Pt Attempts", "3Pt Makes"};
            FileInputStream fis = new FileInputStream (new File("C:\\Users\\Jaron Jin\\Documents\\NetBeansProjects\\IA_App\\testing.xls")); 
            HSSFWorkbook wb = new HSSFWorkbook(fis);
            HSSFSheet sheet = wb.getSheet("testing");
            Row heading = sheet.createRow(0);
            for(int i = 0; i < headingLabels.length; i++){
                heading.getCell(i).setCellValue(headingLabels[i]);
            }   
            Row data = sheet.createRow(gameID);
            for(int i = 0; i < test.length; i++){
                data.getCell(i).setCellValue(test[i]);
            }
            
            for(int i = 0; i < test.length; i++){
                HSSFCellStyle styleHeading = wb.createCellStyle();
                Font font = wb.createFont();
                font.setBold(true);
                font.setFontName(HSSFFont.FONT_ARIAL);
                font.setFontHeightInPoints((short)11);
                styleHeading.setFont(font);
                styleHeading.setVerticalAlignment(CellStyle.ALIGN_CENTER);
                data.getCell(i).setCellStyle(styleHeading);
                sheet.autoSizeColumn(i);
            }
            FileOutputStream output = new FileOutputStream (new File("C:\\Users\\Jaron Jin\\Documents\\NetBeansProjects\\IA_App\\testing.xls"));
            wb.write(output);
            wb.close();
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        */
        
    }
    
    public String toString(){
        String str = ("You made " + makes + " out of " + attempts + " shots. Your field goal percentage: " + (double) makes/attempts*100 + ("%") ); 
        return str;
    }
    
}
