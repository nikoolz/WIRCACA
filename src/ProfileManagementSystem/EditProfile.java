/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProfileManagementSystem;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author geral
 */
public class EditProfile extends javax.swing.JFrame {

    /**
     * Creates new form EditProfile
     */
    public EditProfile() {
        initComponents();
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
        redbar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        leftside = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton()
        ;
        barforedit = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        logouphsd = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        NAME1 = new javax.swing.JLabel();
        middlenamefield = new javax.swing.JTextField();
        lastnamefield = new javax.swing.JTextField();
        schoolg10 = new javax.swing.JLabel();
        schoolfield2 = new javax.swing.JTextField();
        bday = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        addressfield = new javax.swing.JTextField();
        residence = new javax.swing.JLabel();
        residencefield = new javax.swing.JTextField();
        emergencycontact = new javax.swing.JLabel();
        emergencycontactfield2 = new javax.swing.JTextField();
        birthdayfield3 = new javax.swing.JTextField();
        gender1 = new javax.swing.JLabel();
        strand1 = new javax.swing.JLabel();
        strandfield1 = new javax.swing.JTextField();
        strand2 = new javax.swing.JLabel();
        strandfield2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        agefield3 = new javax.swing.JTextField();
        strand3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        emergencycontact1 = new javax.swing.JLabel();
        emergencycontactfield3 = new javax.swing.JTextField();
        emergencycontact2 = new javax.swing.JLabel();
        emergencycontactfield4 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        schoolfield3 = new javax.swing.JTextField();
        schoolg11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(1500, 900));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        redbar.setBackground(new java.awt.Color(123, 21, 20));
        redbar.setForeground(new java.awt.Color(123, 21, 20));

        javax.swing.GroupLayout redbarLayout = new javax.swing.GroupLayout(redbar);
        redbar.setLayout(redbarLayout);
        redbarLayout.setHorizontalGroup(
            redbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
        );
        redbarLayout.setVerticalGroup(
            redbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(redbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 40));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 36)); // NOI18N
        jLabel4.setText("Student Information");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 330, 30));

        jButton1.setText("Logout");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 70, -1, -1));

        leftside.setBackground(new java.awt.Color(255, 255, 255));
        leftside.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\geral\\Downloads\\SCHED-removebg-preview (1).png")); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        leftside.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 80, -1));

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\geral\\Downloads\\attendance-removebg-preview (1).png")); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        leftside.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 100, -1));

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\geral\\Downloads\\FAQs-removebg-preview (1).png")); // NOI18N
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        leftside.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 80, 60));

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\geral\\Downloads\\SHSlogo (1).png")); // NOI18N
        jButton8.setBorder(null);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        leftside.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\geral\\Downloads\\profile red (1).png")); // NOI18N
        jButton2.setBorder(null);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        leftside.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 80, 70));

        jPanel1.add(leftside, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 140, 860));

        barforedit.setBackground(new java.awt.Color(153, 0, 0));
        barforedit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Currently editing profile");
        barforedit.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 18, 225, -1));

        jButton7.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 12)); // NOI18N
        jButton7.setText("Cancel");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        barforedit.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 110, -1));

        Save.setBackground(new java.awt.Color(252, 203, 10));
        Save.setText("Save & View");
        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveMouseClicked(evt);
            }
        });
        barforedit.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 110, -1));

        jPanel1.add(barforedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 970, 60));

        logouphsd.setIcon(new javax.swing.ImageIcon("C:\\Users\\geral\\Downloads\\maroon logo.png")); // NOI18N
        jPanel1.add(logouphsd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 320, -1));

        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jPanel2.setMinimumSize(new java.awt.Dimension(912, 1007));
        jPanel2.setPreferredSize(new java.awt.Dimension(912, 1007));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NAME1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        NAME1.setText("NAME:");
        jPanel2.add(NAME1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        middlenamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middlenamefieldActionPerformed(evt);
            }
        });
        jPanel2.add(middlenamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 170, 40));

        lastnamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnamefieldActionPerformed(evt);
            }
        });
        jPanel2.add(lastnamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 170, 40));

        schoolg10.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        schoolg10.setText("SCHOOL (G10):");
        jPanel2.add(schoolg10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 130, 20));

        schoolfield2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolfield2ActionPerformed(evt);
            }
        });
        jPanel2.add(schoolfield2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 250, 40));

        bday.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        bday.setText("BIRTHDAY:");
        jPanel2.add(bday, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, 20));

        age.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        age.setText("AGE:");
        jPanel2.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 40, -1));

        address.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        address.setText("PERMANENT ADDRESS:");
        jPanel2.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 300, -1));
        jPanel2.add(addressfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 820, 40));

        residence.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        residence.setText("RESIDENCE ADDRESS:");
        jPanel2.add(residence, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 270, -1));
        jPanel2.add(residencefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 820, 40));

        emergencycontact.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        emergencycontact.setText("ZIP CODE");
        jPanel2.add(emergencycontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 630, -1, -1));
        jPanel2.add(emergencycontactfield2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 650, 170, 40));

        birthdayfield3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthdayfield3ActionPerformed(evt);
            }
        });
        jPanel2.add(birthdayfield3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 170, 40));

        gender1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        gender1.setText("GENDER:");
        jPanel2.add(gender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, -1, 20));

        strand1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        strand1.setText("CONTACT INFORMATION:");
        jPanel2.add(strand1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));
        jPanel2.add(strandfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 310, 40));

        strand2.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        strand2.setText("EMAIL ADDRESS:");
        jPanel2.add(strand2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));
        jPanel2.add(strandfield2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 210, 40));

        jLabel5.setText("First Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jLabel6.setText("Middle Name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        jLabel17.setText("Section");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));
        jPanel2.add(agefield3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 50, 40));

        strand3.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        strand3.setText("STRAND:");
        jPanel2.add(strand3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04","05","06","07","08","09", "10", "11", "12", "13", "14", "15" }));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 70, 40));

        jDateChooser1.setDateFormatString("MM/dd/YYYY");
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 190, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 110, 40));

        emergencycontact1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        emergencycontact1.setText("PROVINCE");
        jPanel2.add(emergencycontact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 630, -1, -1));
        jPanel2.add(emergencycontactfield3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 650, 170, 40));

        emergencycontact2.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        emergencycontact2.setText("CITY");
        jPanel2.add(emergencycontact2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, -1, -1));
        jPanel2.add(emergencycontactfield4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 170, 40));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ICT", "HE", "AD", "HUMSS","GAS","STEM","ABM" }));
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 170, 40));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11", "12" }));
        jPanel2.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 70, 40));

        jLabel7.setText("Last Name");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, -1, -1));

        jLabel9.setText("Level");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        schoolfield3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolfield3ActionPerformed(evt);
            }
        });
        jPanel2.add(schoolfield3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 240, 40));

        schoolg11.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        schoolg11.setText("SCHOOL ID:");
        jPanel2.add(schoolg11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 130, 20));

        jScrollPane1.setViewportView(jPanel2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 970, 560));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 900));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        sigin v = new sigin();
        v.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Schedule v = new Schedule();
        v.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        Attendancee1 v = new Attendancee1();
        v.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        FAQs v = new FAQs();
        v.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        Homepagee v = new Homepagee();
        v.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
    Profile v = new Profile();
    v.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton7MouseClicked

    private void SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseClicked
    
    Profile v = new Profile();
        v.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_SaveMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Profile v = new Profile();
        v.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void middlenamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middlenamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middlenamefieldActionPerformed

    private void lastnamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnamefieldActionPerformed

    }//GEN-LAST:event_lastnamefieldActionPerformed

    private void schoolfield2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolfield2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schoolfield2ActionPerformed

    private void birthdayfield3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthdayfield3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthdayfield3ActionPerformed

    private void schoolfield3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolfield3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schoolfield3ActionPerformed

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
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NAME1;
    private javax.swing.JButton Save;
    private javax.swing.JLabel address;
    private javax.swing.JTextField addressfield;
    private javax.swing.JLabel age;
    private javax.swing.JTextField agefield3;
    private javax.swing.JPanel barforedit;
    private javax.swing.JLabel bday;
    private javax.swing.JTextField birthdayfield3;
    private javax.swing.JLabel emergencycontact;
    private javax.swing.JLabel emergencycontact1;
    private javax.swing.JLabel emergencycontact2;
    private javax.swing.JTextField emergencycontactfield2;
    private javax.swing.JTextField emergencycontactfield3;
    private javax.swing.JTextField emergencycontactfield4;
    private javax.swing.JLabel gender1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField lastnamefield;
    private javax.swing.JPanel leftside;
    private javax.swing.JLabel logouphsd;
    public static javax.swing.JTextField middlenamefield;
    private javax.swing.JPanel redbar;
    private javax.swing.JLabel residence;
    private javax.swing.JTextField residencefield;
    private javax.swing.JTextField schoolfield2;
    private javax.swing.JTextField schoolfield3;
    private javax.swing.JLabel schoolg10;
    private javax.swing.JLabel schoolg11;
    private javax.swing.JLabel strand1;
    private javax.swing.JLabel strand2;
    private javax.swing.JLabel strand3;
    private javax.swing.JTextField strandfield1;
    private javax.swing.JTextField strandfield2;
    // End of variables declaration//GEN-END:variables
}
