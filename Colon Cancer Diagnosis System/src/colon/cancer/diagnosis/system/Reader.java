
package colon.cancer.diagnosis.system;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Reader {
    String fileName;
    File file;
    Scanner inputStream;
    private int rows,columns;
    String[] Data;
    
    public Reader(String fileName, int rows, int columns) {
        this.fileName = fileName;
        this.rows = rows;
        this.columns = columns;
        file = new File(fileName);
        String filedata = new String("");
        
        int counter = 0;
        try {
            inputStream = new Scanner(file);
            while(inputStream.hasNext())
            {
                counter++;
                filedata += inputStream.next();
            }
            
            Data = filedata.split(",");
            
            inputStream.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Wrong File path");
        }       
    }
    
    public String Read(int patient, int gene)
    {
        int index = rows*(patient) + (gene);
        System.out.println(index);
        return Data[index];
    }
    
    
}
