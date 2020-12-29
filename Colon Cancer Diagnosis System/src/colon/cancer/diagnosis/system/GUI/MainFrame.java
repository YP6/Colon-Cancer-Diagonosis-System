package colon.cancer.diagnosis.system.GUI;

import static colon.cancer.diagnosis.system.ColonCancerDiagnosisSystem.Program;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame {

    private String filePath;
    StartPanel startPanel;
    OptionsPanel optionsPanel;
    TypesOfGraph accurecyGraphPanel;
    TypesOfGraph condtionGraphPanel;
    int numberOfPatient , numberOfGene,numberOfTrained , numberOfTest;
    int normalNum = 0 , abNormalNum = 0;
    boolean isTested = false;
    double normalPrecentage;

    public MainFrame() {
        setTitle("Colon Cancer Diagnosis System");
        setLayout(new FlowLayout()); 
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startPanel = new StartPanel();
        optionsPanel = new OptionsPanel();
        add(startPanel);
       

        startPanel.fileChooserButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                filePath = (FileChooser.showFileChooser());

            }
        });
        
        startPanel.StartButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                
                numberOfPatient = Integer.valueOf(startPanel.numberofPatientText.getText());
                numberOfGene = Integer.valueOf(startPanel.numberOfGenesText.getText());
                numberOfTrained = Integer.valueOf(startPanel.numberOfTrainedText.getText());
                numberOfTest = Integer.valueOf(startPanel.numberOfTestText.getText());
                Program.InitializeProgram(filePath, numberOfPatient, numberOfGene, numberOfTrained, numberOfTest);
                startPanel.setVisible(false);
                add(optionsPanel);
                optionsPanel.setVisible(true);
                
  
                Program.Examine();
        System.out.println("Done!");
        System.out.println(Program.getProgramAccuracy() + "%");
            }
 });
        optionsPanel.graphButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                optionsPanel.setVisible(false);
                Program.Examine();
                accurecyGraphPanel = new TypesOfGraph(Program.getProgramAccuracy() , "Accurate" ,"Unaccurate" , "Accuracy" );
                add(accurecyGraphPanel);
               
                for (int i = numberOfTest; i < numberOfPatient; i++)
                {
                    if (isTested == true)break;
                    if (Program.getPatientPredictedCondition(i).equals("Normal"))
                    {
                        normalNum++;
                        
                    }
                    else abNormalNum++;
                }
                if (isTested == false)
                {
                    normalPrecentage = (normalNum/(double)numberOfTest)*100;
                    isTested = true;
                }
                condtionGraphPanel = new TypesOfGraph( normalPrecentage, "Tested Negative" , "Tested Postive" , "Condtions");
                add(condtionGraphPanel);
                JButton Backbutton = new JButton("Back");
                add(Backbutton);
                Backbutton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                       optionsPanel.setVisible(true);
                      condtionGraphPanel.setVisible(false);
                      accurecyGraphPanel.setVisible(false);
                      Backbutton.setVisible(false);
                    }
                });
                
          
        System.out.println("Done!");
        System.out.println(Program.getProgramAccuracy() + "%");
            }
 });

    }

}