package colon.cancer.diagnosis.system.GUI;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class OptionsFrame extends JFrame{
    public JButton graphButton;
    public JButton searchButton;
    
    public OptionsFrame(){
        setTitle("Colon Cancer Diagnosis System - Options");
        setLayout(new FlowLayout());
        graphButton = new JButton("Show Graph");
        searchButton = new JButton("Search");
        setSize(1500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(graphButton);
        add(searchButton);
    }    
}
