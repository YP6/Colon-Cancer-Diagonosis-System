
package colon.cancer.diagnosis.system;

public class AccuracyCalculator {
    public void showAccuracy(double correct){
        double accuracy = ((correct / 30) * 100);    
        System.out.println("Program's Accuracy: " + accuracy + "%");
    }
}
