/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectacp;

import java.awt.Font;
import java.awt.Toolkit;
import java.io.*;
import javax.swing.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class AddSometime extends javax.swing.JFrame {

    protected ArrayList<String> doSometime = new ArrayList<String>();
    protected ArrayList<String> timeDoSometime = new ArrayList<String>();
    protected ArrayList<String> dateDoSometime = new ArrayList<String>();
    protected ArrayList<String> doRegularly = new ArrayList<String>();
    protected JLabel msg;
    protected int indexSometime, indexregularly;
    final protected String fileSometimeAddress = "D:\\\\sometimedata.txt";

    /**
     * Creates new form AddSometime
     */
    public AddSometime() {
        setIconImage();
        initComponents();
        event.setFont(new Font("tahoma", Font.PLAIN, 16));
        date.setFont(new Font("tahoma", Font.PLAIN, 16));
        time.setFont(new Font("tahoma", Font.PLAIN, 16));
    }

    public void saveDataToFile(String a) {
        try {
            Path file = Paths.get(fileSometimeAddress);
            BufferedWriter outputData = Files.newBufferedWriter(file, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            outputData.write(a);
            outputData.close();
            JOptionPane.showMessageDialog(null, "Save successfully");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No file");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        event = new javax.swing.JTextField();
        time = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Sometime");

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Add your event");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        event.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        time.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        date.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Save");
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("TH NiramitIT๙", 1, 24)); // NOI18N
        jLabel1.setText("*Event");

        jLabel2.setFont(new java.awt.Font("TH NiramitIT๙", 1, 24)); // NOI18N
        jLabel2.setText("*Time to do");

        jLabel3.setFont(new java.awt.Font("TH NiramitIT๙", 1, 24)); // NOI18N
        jLabel3.setText("*Date");

        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("( *E.g 13:10 )");
        jLabel4.setToolTipText("");

        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("( *E.g 20/06/2020 )");
        jLabel5.setToolTipText("");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cancel");
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(event, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel1)))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addGap(54, 54, 54)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(event, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (event.getText().isEmpty() || time.getText().isEmpty() || date.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter Data");
        } else {
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dateFormatter = LocalDate.parse(date.getText().trim(), formatter);
                try {
                    LocalTime.parse(time.getText().trim());
                    ChackSaveToFileSometime();
                } catch (DateTimeException e) {
                    String msg = "Please enter time in the format hours:minutes as 13:10";
                    JOptionPane.showMessageDialog(null, msg);
                }
            } catch (DateTimeException e) {
                String msg = "Please enter date in the format dd/MM/yyyy such as 20/06/2020";
                JOptionPane.showMessageDialog(null, msg);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void ChackSaveToFileSometime() {
        String dataEvent = event.getText().trim();
        String dataTime = time.getText().trim();
        String dataDate = date.getText().trim();

        Check testResult = new Check();
        int testResultSometime = testResult.CheckwhattodoSometime(dataTime, dataDate);
        doSometime = testResult.getWhatToDo();
        indexSometime = testResult.getIndex();
        FindDay ojectFindDay = new FindDay(dataDate);
        String day = ojectFindDay.findDayOfWeek();

        int testResultRegularly = testResult.CheckwhattodoRegularly(dataTime, day);
        doRegularly = testResult.getWhatToDo();
        indexregularly = testResult.getIndex();
        if (testResultSometime == 0 || testResultRegularly == 0) {
            if (testResultSometime == 0) {
                msg = new JLabel("There is something to do:  \n" + doSometime.get(indexSometime));
                msg.setFont(new Font("tahoma", Font.PLAIN, 20));
            } else if (testResultRegularly == 0) {
                msg = new JLabel("There is something to do:  \n" + doRegularly.get(indexregularly));
                msg.setFont(new Font("tahoma", Font.PLAIN, 20));
            }
            JOptionPane.showMessageDialog(null, msg);
        } else {
            String somtimedata = DataSometime(dataEvent, dataTime, dataDate);
            saveDataToFile(somtimedata);
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        event.setText("");
        time.setText("");
        date.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    public String DataSometime(String event, String time, String data) {
        return event + "-" + time + "-" + data + "\n";
    }

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("1.png")));
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
            java.util.logging.Logger.getLogger(AddSometime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSometime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSometime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSometime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSometime().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField date;
    private javax.swing.JTextField event;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables
}
