
package colon.cancer.diagnosis.system.GUI;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StartPanel extends JPanel {
    public JButton fileChooserButton , StartButton;
    public String filePath;
    public JLabel numberOfPatientLabel , numberOfGenesLabel ,numberOfTrainedLabel ,numberOfTestLabel, DataSetPathLabel;
    public JTextField numberofPatientText ,numberOfGenesText ,numberOfTrainedText ,numberOfTestText, DataSetPathText;
    public OptionsPanel optionsFrame;
    
    public StartPanel()
    {
        
        setSize(200, 200);
        numberOfPatientLabel = new JLabel("Enter number of Patient : ");
        numberOfPatientLabel.setSize(200, 200);
        numberofPatientText = new JTextField("62" , 10);
        numberOfGenesLabel = new JLabel("Enter number of Genes : ");
        numberOfGenesText= new JTextField("201" , 10);
        numberOfTrainedLabel = new JLabel("Enter number of Trained Data : ");
        numberOfTrainedText = new JTextField("32" , 10);
        numberOfTestLabel  = new JLabel("Enter the number of Test patient : ");
        numberOfTestText = new JTextField("30" , 10);
        DataSetPathLabel  = new JLabel("Dataset Path : ");
        DataSetPathText = new JTextField("./colon Cancer Dataset.csv" , 30);
        DataSetPathText.setEditable(false);
        fileChooserButton = new JButton("Choose File");
        StartButton = new JButton("Start");
       
        
        JComponent []Containers = new JComponent[6];
        
         for(int i = 0; i< 6;i++)
        {
            Containers[i] = new JPanel();
        }
        
       
        Containers[0].add(numberOfPatientLabel);
        Containers[0].add(numberofPatientText);
        Containers[1].add(numberOfGenesLabel);
       
        Containers[1].add(numberOfGenesText);
        Containers[2].add(numberOfTrainedLabel);
       
        Containers[2].add(numberOfTrainedText);
        Containers[3].add(numberOfTestLabel);
       
        Containers[3].add(numberOfTestText);
        JComponent Cont = new JPanel();
        Cont.add(DataSetPathLabel);
        Cont.add(DataSetPathText);
        Containers[4].add(Cont);
  
        Containers[4].add(fileChooserButton);
     
        Containers[5].add(StartButton);
      
        for(JComponent com: Containers)
        {
           
            com.setLayout(new GridLayout());
            add(com);
        }
        
        
        
    }
    
}
