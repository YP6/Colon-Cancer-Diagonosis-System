package colon.cancer.diagnosis.system;

import static colon.cancer.diagnosis.system.ColonCancerDiagnosisSystem.read;


public class Patient extends Person{
    private int ID;
    private Cell cell = new Cell();

    public Patient(int ID) {
         cell.setActualCondition(read.ReadPatientCondition(ID));
        for (int i = 0 ; i < 201 ; i++)
        {
            double value = Double.parseDouble(read.ReadPatientGeneValue(ID, i+1));
            
            cell.set_Gene(i, value);
  
        }
    }
    
    public Cell getCell()
    {
        return cell;
    }
    
    
    
}