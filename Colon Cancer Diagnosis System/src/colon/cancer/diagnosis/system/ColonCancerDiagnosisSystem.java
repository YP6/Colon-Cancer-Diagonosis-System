
package colon.cancer.diagnosis.system;


public class ColonCancerDiagnosisSystem {
  

    public static void main(String[] args) {
       
        Singleton Program = Singleton.GetInstance();
        Program.InitializeProgram("./colon Cancer Dataset.csv", 62, 201, 32, 30);
        Program.Examine();
        //System.out.println(Program.getProgramAccuracy() + "%");
        
    }
    
}
