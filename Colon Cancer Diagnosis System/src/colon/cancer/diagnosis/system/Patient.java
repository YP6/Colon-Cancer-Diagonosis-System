package colon.cancer.diagnosis.system;


public class Patient extends Person{
    private int ID;
    Cell cell;
    Reader read = new Reader("./colon Cancer Dataset.csv", 203, 63);

    public Patient(int ID) {
        for (int i = 0 ; i < 201 ; i++)
        {
            double value = Double.parseDouble(read.ReadPatientGeneValue(ID, i+1));
            String name = read.ReadGeneName(i+1);
            
            cell.set_Gene(ID, value);
            cell.gene[i].name = name;
           
           
        }
    }
    
    
    
}