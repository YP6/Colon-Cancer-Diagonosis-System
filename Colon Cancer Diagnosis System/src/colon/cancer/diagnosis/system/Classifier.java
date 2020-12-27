
package colon.cancer.diagnosis.system;

import static colon.cancer.diagnosis.system.Singleton.patients;
import static colon.cancer.diagnosis.system.Singleton.read;

public class Classifier {
    double []Distances = new double[32];
    
    
    public String Examine(Patient patient)
    {
        for(int i=0;i<32;i++)
        {
            
            Distances[i] = patient.CompareWith(patients[i]);
            
        }
        
        int index = 0;
        double min = Distances[0];
        for(int i=1;i<32;i++)
        {
           if(Distances[i] < min)
           {
               min = Distances[i];
               index = i;
           }
        }
        
        
        return read.ReadPatientCondition(index+1);
    }
}
