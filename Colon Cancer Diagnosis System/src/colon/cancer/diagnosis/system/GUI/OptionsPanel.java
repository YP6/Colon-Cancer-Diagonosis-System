package colon.cancer.diagnosis.system.GUI;

import java.awt.Dimension;
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
        layout.setHgap(100);
        layout.setVgap(150);
        setLayout(layout);   
        
        graphButton = new JButton("Show Graph");
        graphButton.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        searchButton = new JButton("Search");
        searchButton.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        AddButton = new JButton("Add");
        AddButton.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        graphButton.setPreferredSize(new Dimension(150, 100));
       
        add(new JPanel());
        JLabel Title = new JLabel("Menu", SwingConstants.CENTER);
        Title.setFont(new Font("Lucida Fax", Font.BOLD, 35));
        add(Title);
        add(new JPanel());
        add(graphButton);
        add(AddButton);
        add(searchButton);
 
        
    }    
}
