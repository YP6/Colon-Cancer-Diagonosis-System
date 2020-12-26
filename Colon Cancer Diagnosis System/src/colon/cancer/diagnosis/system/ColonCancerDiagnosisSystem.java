
package colon.cancer.diagnosis.system;


public class ColonCancerDiagnosisSystem {
    public static Reader read;
 
    public static void main(String[] args) {
        read = new Reader("./colon Cancer Dataset.csv", 203, 63);
        
        Patient[] patients = new Patient[62];
        for(int i = 0;i<62;i++)
        {
            patients[i] = new Patient(i+1);
        }
        
        System.out.println(patients[38].getCell().getGene(201).value);
        
        
        
        
    }
    
}
