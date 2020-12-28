package colon.cancer.diagnosis.system.GUI;

import static colon.cancer.diagnosis.system.ColonCancerDiagnosisSystem.Program;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

        
public class MainFrame extends JFrame {
    public JButton fileChooserButton , StartButton;
    public String filePath;
    public JLabel numberOfPatientLabel , numberOfGenesLabel ,numberOfTrainedLabel ,numberOfTestLabel;
    public JTextField numberofPatientText ,numberOfGenesText ,numberOfTrainedText ,numberOfTestText;
    
    
    public MainFrame(){
        setTitle("Colon Cancer Diagnosis System");
        setLayout(new FlowLayout());
        fileChooserButton = new JButton("Choose File");
        setSize(900, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        numberOfPatientLabel = new JLabel("Enter number of Patient : ");
        numberOfPatientLabel.setSize(200, 200);
        numberofPatientText = new JTextField("" , 50);
        numberOfGenesLabel = new JLabel("Enter number of Genes : ");
        numberOfGenesText= new JTextField("" , 50);
        numberOfTrainedLabel = new JLabel("Enter number of Trained Data : ");
        numberOfTrainedText = new JTextField("" , 50);
        numberOfTestLabel  = new JLabel("Enter the number of patients : ");
        numberOfTestText = new JTextField("" , 50);
        StartButton = new JButton("Start");
        add(numberOfPatientLabel);
        add(numberofPatientText);
        add(numberOfGenesLabel);
        add(numberOfGenesText);
        add(numberOfTrainedLabel);
        add(numberOfTrainedText);
        add(numberOfTestLabel);
        add(numberOfTestText);
        setSize(500, 500);
       
        add(fileChooserButton);
        add(StartButton);
        
          
        
        
        
        fileChooserButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                filePath = (FileChooser.showFileChooser());
               
            }
 });
        
        StartButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                int numberOfPatient , numberOfGene,numberOfTrained , numberOfTest;
                numberOfPatient = Integer.valueOf(numberofPatientText.getText());
                numberOfGene = Integer.valueOf(numberOfGenesText.getText());
                numberOfTrained = Integer.valueOf(numberOfTrainedText.getText());
                numberOfTest = Integer.valueOf(numberOfTestText.getText());
                Program.InitializeProgram(filePath, numberOfPatient, numberOfGene, numberOfTrained, numberOfTest);
                Program.Examine();
        System.out.println("Done!");
        System.out.println(Program.getProgramAccuracy() + "%");
            }
 });
    }
    public String getFilePath(){
        System.out.println("Path: " + filePath);
        return filePath;
    }
}
