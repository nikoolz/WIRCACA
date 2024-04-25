package wewe;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author geral
 */
public class Profile extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */
    public Profile() {
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
        redheader = new javax.swing.JPanel();
        namefield = new javax.swing.JTextField();
        strandfield = new javax.swing.JTextField();
        schoolfield = new javax.swing.JTextField();
        genderfield = new javax.swing.JTextField();
        birthdayfield = new javax.swing.JTextField();
        agefield = new javax.swing.JTextField();
        addressfield = new javax.swing.JTextField();
        residencefield = new javax.swing.JTextField();
        contactfield = new javax.swing.JTextField();
        guardianfield = new javax.swing.JTextField();
        emergencycontactfield = new javax.swing.JTextField();
        NAME = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        barforedit = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        leftside = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        redheader.setBackground(new java.awt.Color(153, 0, 0));
        redheader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(redheader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, 30));
        jPanel1.add(namefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 280, 40));
        jPanel1.add(strandfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 280, 40));

        schoolfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolfieldActionPerformed(evt);
            }
        });
        jPanel1.add(schoolfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 280, 40));
        jPanel1.add(genderfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 430, 280, 40));
        jPanel1.add(birthdayfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 490, 280, 40));
        jPanel1.add(agefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 550, 290, 40));
        jPanel1.add(addressfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 650, 280, 40));
        jPanel1.add(residencefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 710, 280, 40));
        jPanel1.add(contactfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 760, 280, 40));
        jPanel1.add(guardianfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 650, 280, 40));
        jPanel1.add(emergencycontactfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 700, 280, 40));

        NAME.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        NAME.setText("NAME:");
        jPanel1.add(NAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, -1, -1));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        jLabel8.setText("STRAND:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, -1, -1));

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        jLabel9.setText("SCHOOL (G10):");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, -1, 20));

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        jLabel10.setText("GENDER:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 440, -1, 20));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        jLabel7.setText("BIRTHDAY:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 500, -1, -1));

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        jLabel11.setText("AGE:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 560, -1, -1));

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        jLabel12.setText("PERMANENT ADDRESS:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 660, -1, -1));

        jLabel13.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        jLabel13.setText("RESIDENCE ADDRESS:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 720, -1, -1));

        jLabel14.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        jLabel14.setText("CONTACT INFORMATION:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 770, -1, -1));

        jLabel15.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        jLabel15.setText("PARENTS / GUARDIAN:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 660, 180, 20));

        jLabel16.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        jLabel16.setText("EMERGENCY CONTACT:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 710, -1, -1));

        barforedit.setBackground(new java.awt.Color(153, 0, 0));
        barforedit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Currently viewing profile");
        barforedit.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 18, 225, -1));

        jButton6.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 12)); // NOI18N
        jButton6.setText("Edit Details");
        barforedit.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 18, -1, -1));

        jPanel1.add(barforedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 520, 60));

        leftside.setBackground(new java.awt.Color(237, 233, 233));
        leftside.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        jButton1.setBorder(null);
        leftside.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 60, 70));

        jButton2.setText("jButton2");
        jButton2.setBorder(null);
        leftside.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 90, 70));

        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        leftside.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 90, 70));

        jButton4.setBorder(null);
        leftside.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 700, 60, 70));
        leftside.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, -1, -1));

        jPanel1.add(leftside, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 170, 880));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void schoolfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schoolfieldActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NAME;
    private javax.swing.JTextField addressfield;
    private javax.swing.JTextField agefield;
    private javax.swing.JPanel barforedit;
    private javax.swing.JTextField birthdayfield;
    private javax.swing.JTextField contactfield;
    private javax.swing.JTextField emergencycontactfield;
    private javax.swing.JTextField genderfield;
    private javax.swing.JTextField guardianfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel leftside;
    private javax.swing.JTextField namefield;
    private javax.swing.JPanel redheader;
    private javax.swing.JTextField residencefield;
    private javax.swing.JTextField schoolfield;
    private javax.swing.JTextField strandfield;
    // End of variables declaration//GEN-END:variables
}
