
package colon.cancer.diagnosis.system;


public class ColonCancerDiagnosisSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Reader read = new Reader("./colon Cancer Dataset.csv", 203, 63);
        System.out.println(read.ReadPatientGeneValue(0, 0));
    }
    
    
}
