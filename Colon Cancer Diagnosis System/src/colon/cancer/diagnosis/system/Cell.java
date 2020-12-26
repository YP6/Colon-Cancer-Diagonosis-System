package colon.cancer.diagnosis.system;

import static colon.cancer.diagnosis.system.ColonCancerDiagnosisSystem.read;

public class Cell {
    private Gene []gene=new Gene[201];
    private String actual;
    private String predicted;
    public void set_Gene(int index,double value)
    {
        gene[index] = new Gene(value,read.ReadGeneName(index));
    }

    void setActualCondition(String condition) {
        actual = condition;
    }
    
    public Gene getGene(int index)
    {
        return gene[index - 1];
    }
    
}