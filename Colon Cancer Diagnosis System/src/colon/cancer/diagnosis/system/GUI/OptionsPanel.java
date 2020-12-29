package colon.cancer.diagnosis.system.GUI;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class OptionsPanel extends JPanel{
    public JButton graphButton;
    public JButton searchButton;
    
    public OptionsPanel(){
       
      
       setLayout(new FlowLayout());    
        graphButton = new JButton("Show Graph");
        searchButton = new JButton("Search");
        setSize(600, 600);
        add(graphButton);
        add(searchButton);
    }    
}
