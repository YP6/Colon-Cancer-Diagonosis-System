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
    public JPanel textpanel;
    public JLabel numberOfPatientLabel , numberOfGenesLabel ,numberOfTrainedLabel ,numberOfTestLabel;
    public JTextField numberofPatientText ,numberOfGenesText ,numberOfTrainedText ,numberOfTestText;
    
    
    public MainFrame(){
        setTitle("Colon Cancer Diagnosis System");
        setLayout(new FlowLayout());
        fileChooserButton = new JButton("Choose File");
        setSize(1500, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textpanel = new JPanel();
        numberOfPatientLabel = new JLabel("Enter number of Patient : ");
        numberofPatientText = new JTextField("" , 10);
        numberOfGenesLabel = new JLabel("Enter number of Genes : ");
        numberOfGenesText= new JTextField("" , 10);
        numberOfTrainedLabel = new JLabel("Enter number of Trained Data : ");
        numberOfTrainedText = new JTextField("" , 10);
        numberOfTestLabel  = new JLabel("Enter the number of patients : ");
        numberOfTestText = new JTextField("" , 10);
        StartButton = new JButton("Start");
        textpanel.add(numberOfPatientLabel);
        textpanel.add(numberofPatientText);
        textpanel.add(numberOfGenesLabel);
        textpanel.add(numberOfGenesText);
        textpanel.add(numberOfTrainedLabel);
        textpanel.add(numberOfTrainedText);
        textpanel.add(numberOfTestLabel);
        textpanel.add(numberOfTestText);
        add(textpanel);
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
                
                Program.InitializeProgram(filePath, 62, 201, 32, 30);
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
