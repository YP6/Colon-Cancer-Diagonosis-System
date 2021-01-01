package colon.cancer.diagnosis.system.GUI;

import static colon.cancer.diagnosis.system.ColonCancerDiagnosisSystem.Program;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame {

    private String filePath = "./colon Cancer Dataset.csv";
    StartPanel startPanel;
    OptionsPanel optionsPanel;
    TypesOfGraph accurecyGraphPanel;
    TypesOfGraph condtionGraphPanel;
    Search searchpanel;
    Add_Info AddPanel;
    int numberOfPatient , numberOfGene,numberOfTrained , numberOfTest;
    int normalNum = 0 , abNormalNum = 0;
    boolean isTested = false;
    double normalPrecentage;

    public MainFrame() {
        setTitle("Colon Cancer Diagnosis System");
        setLayout(new FlowLayout()); 
        setSize(900, 350);
        setLocation(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startPanel = new StartPanel();
        optionsPanel = new OptionsPanel();
        AddPanel = new Add_Info();
        searchpanel = new Search();
       // BoxLayout layout = new BoxLayout(startPanel, BoxLayout.Y_AXIS);
        GridLayout layout = new GridLayout(6,0);
        layout.setVgap(20);
        startPanel.setLayout(layout);
        add(startPanel);
       

        startPanel.fileChooserButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                filePath = (FileChooser.showFileChooser());
                if(filePath != "Wrong File Path!")
                {
                    startPanel.DataSetPathText.setText(filePath);
                }

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
                
                setSize(1400, 600);
                setLocation(75, 100);
                Program.Examine();
        
            }
 });
        optionsPanel.graphButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                optionsPanel.setVisible(false);
                Program.Examine();
                accurecyGraphPanel = new TypesOfGraph(Program.getProgramAccuracy() , "Accurate" ,"Unaccurate" , "Accuracy" , Color.CYAN , Color.MAGENTA );
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
                condtionGraphPanel = new TypesOfGraph( normalPrecentage, "Tested Negative" , "Tested Postive" , "Condtions" , Color.BLUE , Color.GREEN);
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
                
          
       
            }
 });
        optionsPanel.AddButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                optionsPanel.setVisible(false);
                AddPanel.setVisible(true);
                add(AddPanel);
                Program.Examine();
               
                AddPanel.jButton2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                       optionsPanel.setVisible(true);
                      AddPanel.setVisible(false);
                    
                    }
                });
               
                
          
        System.out.println("Done!");
        System.out.println(Program.getProgramAccuracy() + "%");
            }
 });
        optionsPanel.searchButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                optionsPanel.setVisible(false);
                add(searchpanel);
                searchpanel.setVisible(true);
                Program.Examine();
               
                searchpanel.jButton2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                       optionsPanel.setVisible(true);
                     searchpanel.setVisible(false);
                    
                    }
                });
                
          
        System.out.println("Done!");
        System.out.println(Program.getProgramAccuracy() + "%");
            }
 });
        
        

    }

}
