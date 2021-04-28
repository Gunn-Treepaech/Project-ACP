/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectacp;

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class SettingPage extends javax.swing.JFrame implements ActionListener {

    protected JFileChooser fc;
    protected String nameHeight, nameWeight, bmiString, art, showText, bmiStandard;
    protected int nameHeight1, nameWeight1;
    protected float bmi, nameHeight2, allHeight;
    protected File fileOpen;
    protected int number = 1;
    protected BufferedReader r;
    protected String adjustBMIFileName = "D:\\\\adjustBMI.txt";
    protected String increaseReadingFileName = "D:\\\\increaseReading.txt";
    protected String practiceSportFileName = "D:\\\\practiceSport.txt";
    protected StringBuffer wordBuffer;
    protected String newline = "\n";
    protected String line;

    /**
     * Creates new form SettingPage
     */
    public SettingPage() {
        setIconImage();
        initComponents();
        addListeners();
        showfilebmi();
        extraActivitiesChecker();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        height = new javax.swing.JTextField();
        weight = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        output = new javax.swing.JTextField();
        standard = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        savefile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Setting");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Optitinal");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox1.setText("Adjust BMI");

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Profile");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Height ( cm )");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Weight ( kg )");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Your BMI");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Explanation");

        output.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        output.setEnabled(false);
        output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputActionPerformed(evt);
            }
        });

        standard.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        standard.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(57, 57, 57)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5)
                        .addGap(113, 113, 113)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(standard, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(standard)
                    .addComponent(output))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox2.setText("Increase reading");

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox3.setText("Practice sport");

        savefile.setBackground(new java.awt.Color(255, 255, 255));
        savefile.setText("Save");
        savefile.setFocusable(false);
        savefile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savefileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(66, 66, 66)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(savefile, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jCheckBox2)
                        .addGap(115, 115, 115)))
                .addComponent(jCheckBox3)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3))
                .addGap(14, 14, 14)
                .addComponent(savefile, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void savefileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savefileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_savefileActionPerformed

    private void outputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputActionPerformed
    public void addListeners() {
        savefile.addActionListener(this);
        jCheckBox1.addActionListener(this);
        jCheckBox2.addActionListener(this);
        jCheckBox2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        fc = new JFileChooser();
        nameHeight = height.getText();
        nameWeight = weight.getText();
        nameHeight1 = Integer.parseInt(nameHeight);
        nameWeight1 = Integer.parseInt(nameWeight);
        nameHeight2 = (float) (nameHeight1 * 0.01);
        allHeight = nameHeight2 * nameHeight2;
        bmi = (nameWeight1 / allHeight);
        fileOpen = fc.getSelectedFile();
        if (bmi < 18.5) {
            bmiStandard = "น้ำหนักน้อย / ผอม";
        } else if (18.5 <= bmi && bmi <= 22.90) {
            bmiStandard = "ปกติ (สุขภาพดี)";
        } else if (23 <= bmi && bmi <= 24.90) {
            bmiStandard = "ท้วม / โรคอ้วนระดับ 1";
        } else if (25 <= bmi && bmi <= 29.90) {
            bmiStandard = "อ้วน / โรคอ้วนระดับ 2";
        } else if (30 < bmi) {
            bmiStandard = "อ้วนมาก / โรคอ้วนระดับ 3 ";
        }
        if (e.getSource() == savefile) {
            try {
                PrintWriter bmiUpload = new PrintWriter("D:\\ProjectACP\\Project-ACP-master\\Project-ACP-master\\ProjectACP\\nbproject\\showBMI.txt");

                bmiUpload.println(nameHeight);
                bmiUpload.println(nameWeight);
                bmiUpload.println(String.format("%.2f", bmi));
                bmiUpload.println(bmiStandard);
                bmiUpload.close();

                FileWriter fileWriter1 = new FileWriter(adjustBMIFileName);
                FileWriter fileWriter2 = new FileWriter(increaseReadingFileName);
                FileWriter fileWriter3 = new FileWriter(practiceSportFileName);
                wordBuffer = new StringBuffer();
                int checker = 0;
                
                if (jCheckBox1.isSelected()) {
                    fileWriter1.write("true");
                    fileWriter1.write(newline);
                    fileWriter1.write("3");
                    checker++;
                    wordBuffer.append("Exercise 3 days a week.");
                    wordBuffer.append(newline);
                            
                } else {
                    fileWriter1.write("flase");
                }
                
                if (jCheckBox2.isSelected()) {
                    fileWriter2.write("true");
                    fileWriter2.write(newline);
                    fileWriter2.write("3");
                    checker++;
                    wordBuffer.append("Read books 3 times a week.");
                    wordBuffer.append(newline);
                } else {
                    fileWriter2.write("flase");
                }
                
                if (jCheckBox3.isSelected()) {
                    fileWriter3.write("true");
                    fileWriter3.write(newline);
                    fileWriter3.write("3");
                    checker++;
                    wordBuffer.append("Practice sport 3 times a week.");
                    wordBuffer.append(newline);
                } else {
                    fileWriter3.write("flase");
                }
                
                if (checker != 0) {
                    JOptionPane.showMessageDialog(this,wordBuffer.toString());
                }
                
                fileWriter1.close();
                fileWriter2.close();
                fileWriter3.close();
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error");
            }
            showfilebmi();
        }
        

    }

    public void showfilebmi() {
        File check = new File("D:\\\\sometimedata.txt");
        if (check.exists() != false) {
            String khet = ("D:\\ProjectACP\\Project-ACP-master\\Project-ACP-master\\ProjectACP\\nbproject\\showBMI.txt");
            File file = new File(khet);
            try {

                FileReader fr = new FileReader(file);
                BufferedReader r = new BufferedReader(fr);
                while ((showText = r.readLine()) != null) {
                    if (number == 1) {
                        height.setText(showText);
                        height.setFont(new Font("tahoma", Font.PLAIN, 16));
                    } else if (number == 2) {
                        weight.setFont(new Font("tahoma", Font.PLAIN, 16));
                        weight.setText(showText);
                    } else if (number == 3) {
                        output.setFont(new Font("tahoma", Font.PLAIN, 16));
                        output.setText(showText);
                        output.setEnabled(false);
                    } else if (number == 4) {
                        standard.setFont(new Font("tahoma", Font.PLAIN, 16));
                        standard.setText(showText);
                        standard.setEnabled(false);
                    }
                    number++;
                }
                r.close();
                fr.close();
            } catch (IOException ex) {
            }
        }
        
   }

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("1.png")));
    }
    
    private void extraActivitiesChecker(){
        try {
            Path file1 = Paths.get(adjustBMIFileName);
            BufferedReader reader1 = Files.newBufferedReader(file1, StandardCharsets.UTF_8);
            while ((line = reader1.readLine()) != null) {
                if (line.equals("true")) {
                    jCheckBox1.setSelected(true);
                }
            }
            reader1.close();
            
            Path file2 = Paths.get(increaseReadingFileName);
            BufferedReader reader2 = Files.newBufferedReader(file2, StandardCharsets.UTF_8);
            while ((line = reader2.readLine()) != null) {
                if (line.equals("true")) {
                    jCheckBox2.setSelected(true);
                }
            }
            reader2.close();
            
            Path file3 = Paths.get(practiceSportFileName);
            BufferedReader reader3 = Files.newBufferedReader(file3, StandardCharsets.UTF_8);
            while ((line = reader3.readLine()) != null) {
                if (line.equals("true")) {
                    jCheckBox3.setSelected(true);
                }
            }
            reader3.close();
        } catch (IOException e) {
        }
        showfilebmi();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SettingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField height;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField output;
    private javax.swing.JButton savefile;
    private javax.swing.JTextField standard;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}
