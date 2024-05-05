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
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nica
 */
public class StudentDataManagement extends javax.swing.JFrame {

    Connection conn = DbConnection.connect();
    String filters = "";

    /**
     * Creates new form Students
     */
    public StudentDataManagement() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        redrawTable();
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
        jButton10 = new javax.swing.JButton();
        redbar = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        showdata = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        uphlogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbOrder = new javax.swing.JComboBox<>();
        cbDirection = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
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

        jButton10.setBackground(new java.awt.Color(204, 204, 204));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/SHSlogo (1).png"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 670, -1, -1));

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
        jPanel7.add(showdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 100, 30));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Filter Student List by Tags");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 410, -1));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 900, 70));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel1.setText("Student Masterlist");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 260, 60));

        uphlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfileManagementSystem/photos/maroon_logo.png"))); // NOI18N
        getContentPane().add(uphlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 350, 120));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Middle Name", "Last Name", "Age", "Gender", "Student Id", "Strand", "Level", "Section", "Birthday", "Phone Number", "Email", "Present Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(studentTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1534, Short.MAX_VALUE)
                .addGap(52, 52, 52))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel3);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 900, 470));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setText("Search for:");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel3.setText("Order by:");

        cbOrder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "First_Name", "Last_Name", "Strand", "Level", "Section" }));

        cbDirection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asc", "Desc" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbDirection, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, Short.MAX_VALUE)
                .addComponent(btnSearch)
                .addGap(15, 15, 15))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(jLabel3)
                    .addComponent(cbOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDirection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 900, 60));

        jButton1.setText("Logout");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 70, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 1440, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
      
    }//GEN-LAST:event_jButton2MouseClicked

    private void buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseClicked
        AdminPage v = new AdminPage();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonMouseClicked

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        HomePage v = new HomePage();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton16MouseClicked

    private void showdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showdataMouseClicked

    }//GEN-LAST:event_showdataMouseClicked

    private void showdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showdataActionPerformed
        redrawTable();
    }//GEN-LAST:event_showdataActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        filters = "where "
                + "first_name like '%" + txtSearch.getText() + "%'";
        filters += "or strand like '%" + txtSearch.getText() + "%'";
        filters += "or last_name like '%" + txtSearch.getText() + "%'";
        filters += "or gender like '" + txtSearch.getText() + "%'";
        filters += "order by " + cbOrder.getSelectedItem().toString()+ " " + cbDirection.getSelectedItem().toString();
        // order by id desc
        redrawTable();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        HomePage v = new HomePage();
        v.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        SigninPage v = new SigninPage();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

   private void redrawTable() {
        try {
            //open connection
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM students " + filters;
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
                String residence = rs.getString("present_address");

                String tbData[] = {
                    id, first_name, middle_name, last_name, age, gender, birthday, strand,
                    level,
                    section,
                    student_id,
                    contact_info,
                    email,
                    residence
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
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton button;
    private javax.swing.JComboBox<String> cbDirection;
    private javax.swing.JComboBox<String> cbOrder;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel redbar;
    private javax.swing.JButton showdata;
    private javax.swing.JTable studentTable;
    private javax.swing.JTextField txtSearch;
    public static javax.swing.JLabel uphlogo;
    // End of variables declaration//GEN-END:variables
}
