
package colon.cancer.diagnosis.system;


public class ColonCancerDiagnosisSystem {
    public static Reader read;
    public static Patient[] patients;

    public static void main(String[] args) {
        read = new Reader("./colon Cancer Dataset.csv", 203, 63);
        patients = new Patient[62];
        
        Classifier classi = new Classifier();
        
        for(int i = 0;i<62;i++)
        {
            patients[i] = new Patient(i+1);
        }
        
        int Correct = 0;
        
        for(int i = 32;i<62;i++)
        {
              
            if(classi.Examine(patients[i]).equals(read.ReadPatientCondition(i+1)))
            {
             
                Correct++;
            }
           
        }
        

        
    }
    
}
