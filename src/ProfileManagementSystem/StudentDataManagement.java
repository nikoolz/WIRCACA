/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProfileManagementSystem;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nica
 */
public class StudentDataManagement extends javax.swing.JFrame {

    Connection conn = DbConnection.connect();

    /**
     * Creates new form Students
     */
    public StudentDataManagement() {

        initComponents();
        refreshTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton()
        ;
        button = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        redbar = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        showdata = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        uphlogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(237, 233, 233));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfileManagementSystem/photos/studentdatared (1).png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 70, 60));

        button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfileManagementSystem/photos/adminmanager.png"))); // NOI18N
        button.setBorder(null);
        button.setMargin(new java.awt.Insets(0, 0, 0, 0));
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMouseClicked(evt);
            }
        });
        jPanel2.add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 70, 70));

        jButton16.setBackground(new java.awt.Color(204, 204, 204));
        jButton16.setBorder(null);
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });
        jPanel2.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 140, 880));

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

        getContentPane().add(redbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 40));

        jPanel7.setBackground(new java.awt.Color(153, 0, 0));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 51), 1, true));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showdata.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 12)); // NOI18N
        showdata.setText("Refresh");
        showdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showdataMouseClicked(evt);
            }
        });
        showdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showdataActionPerformed(evt);
            }
        });
        jPanel7.add(showdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 100, 30));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Filter Student List by Tags");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 410, -1));

        jButton9.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 12)); // NOI18N
        jButton9.setText("Select Filters");
        jButton9.setBorder(null);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jPanel7.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 170, 30));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 890, 70));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel1.setText("Student Masterlist");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 260, 60));

        uphlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfileManagementSystem/photos/maroon_logo.png"))); // NOI18N
        getContentPane().add(uphlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 350, 120));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentTable.setFont(new java.awt.Font("Hoefler Text", 0, 14)); // NOI18N
        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "first_name", "middle_name", "last_name", "age", "gender", "birthday", "strand", "level", "section", "student_id", "contact_info", "email", "g10school", "permanent_address", "present_address", "city", "province", "zipcode", "barangay"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(studentTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 1300, 620));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 1440, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        studentdataadmin v = new studentdataadmin();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseClicked
        AdminPage v = new AdminPage();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonMouseClicked

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        Homepagee v = new Homepagee();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton16MouseClicked

    private void showdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showdataMouseClicked

    }//GEN-LAST:event_showdataMouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseClicked

    private void showdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showdataActionPerformed
        refreshTable();
    }//GEN-LAST:event_showdataActionPerformed

    private void refreshTable() {
        // TODO add your handling code here:
        // database connection

        try {
            //open connection
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(query);
            DefaultTableModel tblModel = (DefaultTableModel) studentTable.getModel();
            tblModel.setRowCount(0);
            while (rs.next()) {
                String id = String.valueOf(rs.getInt("id"));
                String first_name = rs.getString("first_name");
                String middle_name = rs.getString("middle_name");
                String last_name = rs.getString("last_name");
                String age = String.valueOf(rs.getInt("age"));
                String gender = rs.getString("gender");
                String birthday = rs.getString("birthday");
                String strand = rs.getString("strand");
                String level = rs.getString("level");
                String section = rs.getString("section");
                String student_id = rs.getString("school_id");
                String contact_info = rs.getString("contact_info");
                String email = rs.getString("email");
                String g10school = rs.getString("former_school");
                String permanent_address = rs.getString("permanent_address");
                String residence = rs.getString("present_address");
                String city = rs.getString("city");
                String province = rs.getString("province");
                String zipcode = String.valueOf(rs.getInt("zip_code"));
                String barangay = rs.getString("barangay");

                String tbData[] = {
                    id, first_name, middle_name, last_name, age, gender, birthday, strand,
                    level,
                    section,
                    student_id,
                    contact_info,
                    email,
                    g10school, permanent_address, residence, city, province, zipcode, barangay
                };

                tblModel.addRow(tbData);
            }

        } catch (SQLException e) {

        }
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
            java.util.logging.Logger.getLogger(StudentDataManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDataManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDataManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDataManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDataManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel redbar;
    private javax.swing.JButton showdata;
    private javax.swing.JTable studentTable;
    public static javax.swing.JLabel uphlogo;
    // End of variables declaration//GEN-END:variables
}