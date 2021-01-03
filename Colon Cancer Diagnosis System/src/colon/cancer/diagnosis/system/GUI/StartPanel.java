
package colon.cancer.diagnosis.system.GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class StartPanel extends JPanel {
    public JButton fileChooserButton , StartButton;
    public String filePath;
    public JLabel numberOfPatientLabel , numberOfGenesLabel ,numberOfTrainedLabel ,numberOfTestLabel, DataSetPathLabel;
    public JTextField numberofPatientText ,numberOfGenesText ,numberOfTrainedText ,numberOfTestText, DataSetPathText;
    public OptionsPanel optionsFrame;
    
    public StartPanel()
    {
        
       
        numberOfPatientLabel = new JLabel("Enter number of Patient : ");
        numberOfPatientLabel.setSize(200, 200);
        numberofPatientText = new JTextField("62" , 10);
        numberofPatientText.setHorizontalAlignment(SwingConstants.CENTER);
        numberOfGenesLabel = new JLabel("Enter number of Genes : ");
        numberOfGenesText= new JTextField("201" , 10);
        numberOfGenesText.setHorizontalAlignment(SwingConstants.CENTER);
        numberOfTrainedLabel = new JLabel("Enter number of Trained Data : ");
        numberOfTrainedText = new JTextField("32" , 10);
        numberOfTrainedText.setHorizontalAlignment(SwingConstants.CENTER);
        numberOfTestLabel  = new JLabel("Enter the number of Test patient : ");
        numberOfTestText = new JTextField("30" , 10);
        numberOfTestText.setHorizontalAlignment(SwingConstants.CENTER);
        DataSetPathLabel  = new JLabel("Dataset Path : ");
        DataSetPathText = new JTextField("./colon Cancer Dataset.csv" , 50);
        DataSetPathText.setEditable(false);
        fileChooserButton = new JButton("Choose File");
        StartButton = new JButton("Start");
       
        JLabel Title = new JLabel("Dataset Setup", SwingConstants.CENTER);
        Title.setFont(new Font("Serif", Font.BOLD, 35));
        add(Title);
        JComponent []Containers = new JComponent[6];
        
         for(int i = 0; i< 6;i++)
        {
            Containers[i] = new JPanel();
            Containers[i].setLayout(new BorderLayout(10,10));
        }
        
        
        Containers[0].add(numberOfPatientLabel, BorderLayout.LINE_START);
        Containers[0].add(numberofPatientText, BorderLayout.LINE_END);
        
        
        Containers[1].add(numberOfGenesLabel, BorderLayout.LINE_START);
        Containers[1].add(numberOfGenesText, BorderLayout.LINE_END);
        
        Containers[2].add(numberOfTrainedLabel, BorderLayout.LINE_START);
        Containers[2].add(numberOfTrainedText, BorderLayout.LINE_END);
        
        Containers[3].add(numberOfTestLabel, BorderLayout.LINE_START);
       
        Containers[3].add(numberOfTestText, BorderLayout.LINE_END);
        JComponent Cont = new JPanel();
        Cont.setLayout(new BorderLayout(10,10));
        Cont.add(DataSetPathLabel,BorderLayout.LINE_START);
        Cont.add(DataSetPathText);
        Containers[4].add(Cont, BorderLayout.CENTER);
        
        Containers[4].add(fileChooserButton, BorderLayout.LINE_END);
     
        Containers[5].add(StartButton, BorderLayout.CENTER);
      
        for(JComponent com: Containers)
        {
           // LayoutManager layout = new BorderLayout(10, 10);
            //com.setLayout(layout);
            add(com);
        }
        
        
        
    }
    
}
