package colon.cancer.diagnosis.system.GUI;

import static colon.cancer.diagnosis.system.ColonCancerDiagnosisSystem.Program;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

        
public class MainFrame extends JFrame {
    public JButton fileChooserButton;
    public String filePath;
    public MainFrame(){
        setTitle("Colon Cancer Diagnosis System");
        setLayout(new FlowLayout());
        fileChooserButton = new JButton("Choose File");
        setSize(1500, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(fileChooserButton);
        fileChooserButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                filePath = (FileChooser.showFileChooser());
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
