package colon.cancer.diagnosis.system.GUI;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class OptionsPanel extends JPanel{
    public JButton graphButton;
    public JButton searchButton;
    public JButton AddButton;
    public JButton alo;
    public OptionsPanel(){
       
        
        GridLayout layout = new GridLayout(2,3);
        layout.setHgap(20);
        layout.setVgap(10);
        setLayout(layout);   
        
        graphButton = new JButton("Show Graph");
        searchButton = new JButton("Search");
        AddButton = new JButton("Add");
        
        setSize(600, 600);
       
        add(new JPanel());
        JLabel Title = new JLabel("Menu", SwingConstants.CENTER);
        Title.setFont(new Font("Serif", Font.BOLD, 35));
        add(Title);
        add(new JPanel());
        add(graphButton);
        add(AddButton);
        add(searchButton);
 
        
    }    
}
