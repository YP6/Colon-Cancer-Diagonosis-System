package colon.cancer.diagnosis.system;

public class Cell {
    Gene []gene=new Gene[201];
    String actual;
    String predicted;
    public void set_Gene(int index,double value)
    {
        gene[index] = new Gene(value);
    }
    
}