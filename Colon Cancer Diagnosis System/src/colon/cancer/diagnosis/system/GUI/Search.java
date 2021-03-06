
package colon.cancer.diagnosis.system.GUI;

import static colon.cancer.diagnosis.system.ColonCancerDiagnosisSystem.Program;
import colon.cancer.diagnosis.system.Singleton;
import javax.swing.JOptionPane;
import static colon.cancer.diagnosis.system.Singleton.patients;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.text.*;

public class Search extends javax.swing.JPanel {

    public Search() {
        setOpaque(false);
        initComponents();
        ACTUAL_txt.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        Age_txt.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        Gender_txt.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        ID_txt.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        Name_txt.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        PREDICT_txt.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        jButton1.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        jButton2.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        jButton1.setFocusable(false);
        jButton2.setFocusable(false);
        jLabel1.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        jLabel2.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        jLabel3.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        jLabel4.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        jLabel5.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        jLabel6.setFont(new Font("Lucida Fax", Font.BOLD, 16));
        
        ACTUAL_txt.setBorder(BorderFactory.createSoftBevelBorder(1, Color.white, Color.darkGray));
        Age_txt.setBorder(BorderFactory.createSoftBevelBorder(1, Color.white, Color.darkGray));
        Gender_txt.setBorder(BorderFactory.createSoftBevelBorder(1, Color.white, Color.darkGray));
        ID_txt.setBorder(BorderFactory.createSoftBevelBorder(1, Color.white, Color.darkGray));
        Name_txt.setBorder(BorderFactory.createSoftBevelBorder(1, Color.white, Color.darkGray));
        PREDICT_txt.setBorder(BorderFactory.createSoftBevelBorder(1, Color.white, Color.darkGray));
        
        ImageIcon searchIcon = new ImageIcon("Icons\\search.png");
        Image searchImg = searchIcon.getImage();
        Image resizedSearchImg = searchImg.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
        searchIcon = new ImageIcon(resizedSearchImg);
        
        ImageIcon backIcon = new ImageIcon("Icons\\back.png");
        Image backImg = backIcon.getImage();
        Image resizedBackImg = backImg.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
        backIcon = new ImageIcon(resizedBackImg);
        
        jButton1.setIcon(searchIcon);
        jButton2.setIcon(backIcon);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ID_txt = new javax.swing.JTextField();
        ACTUAL_txt = new javax.swing.JTextField();
        PREDICT_txt = new javax.swing.JTextField();
        Name_txt = new javax.swing.JTextField();
        Age_txt = new javax.swing.JTextField();
        Gender_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("Patient ID");

        jLabel2.setText("Actual Condition");

        jLabel3.setText("Predicted Condition");

        jLabel4.setText("Patient's Age");

        jLabel5.setText("Patient's Name");

        jLabel6.setText("Patient's Gender");

        ID_txt.setToolTipText("");
        ID_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ID_txtMousePressed(evt);
            }
        });
        ID_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_txtActionPerformed(evt);
            }
        });
        ID_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ID_txtKeyPressed(evt);
            }
        });

        ACTUAL_txt.setEditable(false);
        ACTUAL_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACTUAL_txtActionPerformed(evt);
            }
        });

        PREDICT_txt.setEditable(false);

        Name_txt.setEditable(false);

        Age_txt.setEditable(false);

        Gender_txt.setEditable(false);

        jButton1.setText("Search");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ACTUAL_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PREDICT_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Age_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gender_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ACTUAL_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PREDICT_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Age_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gender_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ACTUAL_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACTUAL_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ACTUAL_txtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         int i = Integer.parseInt(ID_txt.getText());
         
        if( i <= Singleton.getPatientsNum())
        {
            ACTUAL_txt.setText(Program.getPatientActualCondition(i));
            PREDICT_txt.setText(Program.getPatientPredictedCondition(i));
            ACTUAL_txt.setEditable(false);
            PREDICT_txt.setEditable(false);
            Name_txt.setText(Program.GetPatient(i).getName());
            Age_txt.setText(String.valueOf(Program.GetPatient(i).getAge()));
            Gender_txt.setText(String.valueOf(Program.GetPatient(i).getGender()));
           
            /*patients[i].setName(Name_txt.getText());
            patients[i].setAge(Integer.parseInt(Age_txt.getText()));
            patients[i].setGender(Gender_txt.getText().charAt(0));
           */
             
        }
        else if(i==0||i>Singleton.getPatientsNum())
        {
            JOptionPane.showMessageDialog(this, "Wrong ID", "Alert", JOptionPane.WARNING_MESSAGE);
            
            ACTUAL_txt.setText("");
            PREDICT_txt.setText("");
            Name_txt.setText("");
            Age_txt.setText("");
            Gender_txt.setText("");
            ID_txt.setEditable(true);
            
          
            
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ID_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_txtActionPerformed

    }//GEN-LAST:event_ID_txtActionPerformed

    private void ID_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ID_txtMousePressed
        ID_txt.setEditable(true);
    }//GEN-LAST:event_ID_txtMousePressed

    private void ID_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ID_txtKeyPressed
       int key = evt.getKeyChar();
        String s = ID_txt.getText();
        ID_txt.setEditable(true);
        jButton1.setEnabled(true);
        if((key < 48 || key > 56) && key != 8)
        {
            ID_txt.setEditable(false);
            if(s.length() != 0)
             jButton1.setEnabled(true);
            else
              jButton1.setEnabled(false);
        }
        
        if((key == 8 && s.length() <= 1))
        {
            jButton1.setEnabled(false);
        }
    }//GEN-LAST:event_ID_txtKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ACTUAL_txt;
    private javax.swing.JTextField Age_txt;
    private javax.swing.JTextField Gender_txt;
    private javax.swing.JTextField ID_txt;
    private javax.swing.JTextField Name_txt;
    private javax.swing.JTextField PREDICT_txt;
    private javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
