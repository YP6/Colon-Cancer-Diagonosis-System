
package colon.cancer.diagnosis.system;

import colon.cancer.diagnosis.system.GUI.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ColonCancerDiagnosisSystem {
  
    public static Singleton Program;
    public static void main(String[] args) {        
        Program = Singleton.GetInstance();
        Program.Draw();
       
        //Program.InitializeProgram(path, 62, 201, 32, 30);
       
        
    }
    
}
