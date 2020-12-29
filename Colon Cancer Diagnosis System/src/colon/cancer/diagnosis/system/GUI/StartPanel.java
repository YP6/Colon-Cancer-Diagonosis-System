
package colon.cancer.diagnosis.system.GUI;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class StartPanel extends JPanel {
    public JButton fileChooserButton , StartButton;
    public String filePath;
    public JLabel numberOfPatientLabel , numberOfGenesLabel ,numberOfTrainedLabel ,numberOfTestLabel;
    public JTextField numberofPatientText ,numberOfGenesText ,numberOfTrainedText ,numberOfTestText;
    public OptionsPanel optionsFrame;
    
    public StartPanel()
    {
        fileChooserButton = new JButton("Choose File");
        setSize(200, 200);
        numberOfPatientLabel = new JLabel("Enter number of Patient : ");
        numberOfPatientLabel.setSize(200, 200);
        numberofPatientText = new JTextField("" , 10);
        numberOfGenesLabel = new JLabel("Enter number of Genes : ");
        numberOfGenesText= new JTextField("" , 10);
        numberOfTrainedLabel = new JLabel("Enter number of Trained Data : ");
        numberOfTrainedText = new JTextField("" , 10);
        numberOfTestLabel  = new JLabel("Enter the number of Test patient : ");
        numberOfTestText = new JTextField("" , 10);
        StartButton = new JButton("Start");
        setLayout(new FlowLayout());
        add(numberOfPatientLabel);
        add(numberofPatientText);
        add(numberOfGenesLabel);
        add(numberOfGenesText);
        add(numberOfTrainedLabel);
        add(numberOfTrainedText);
        add(numberOfTestLabel);
        add(numberOfTestText);
        add(fileChooserButton);
        add(StartButton);
        
        
        
    }
    
}
