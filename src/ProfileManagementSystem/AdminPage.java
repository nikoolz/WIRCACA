/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProfileManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author chrys
 */
public class AdminPage extends javax.swing.JFrame {

    boolean isPasswordVisible = false;
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rsx = null;
    
    String filters = "";

    /**
     * Creates new form ADMIN_PAGE
     */
    public AdminPage() {
        initComponents();
        conn = DbConnection.connect();
        refreshTable();
    }

    private void refreshTable() {
        try {
            //open connection
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM users " + filters;

            ResultSet rs = stmt.executeQuery(query);
            DefaultTableModel tblModel = (DefaultTableModel) userTable.getModel();
            tblModel.setRowCount(0);
            while (rs.next()) {
                String id = String.valueOf(rs.getInt("id"));
                String name = rs.getString("name");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String is_admin = String.valueOf(rs.getInt("is_admin"));
                String student_id = String.valueOf(rs.getInt("student_id"));

                String tbData[] = {
                    id,
                    name,
                    username,
                    password,
                    is_admin,
                    student_id
                };

                tblModel.addRow(tbData);
            }
        } catch (SQLException e) {
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        btnStudents = new javax.swing.JButton()
        ;
        btnAdminManager = new javax.swing.JButton();
        redbar = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        showDataTable = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbOrder = new javax.swing.JComboBox<>();
        cbDirection = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(237, 233, 233));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton11.setBackground(new java.awt.Color(204, 204, 204));
        jButton11.setBorder(null);
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jPanel3.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jButton13.setBackground(new java.awt.Color(204, 204, 204));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/SHSlogo (1).png"))); // NOI18N
        jButton13.setBorder(null);
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        jPanel3.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 760, -1, -1));

        btnStudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfileManagementSystem/photos/studentdata (1).png"))); // NOI18N
        btnStudents.setBorder(null);
        btnStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStudentsMouseClicked(evt);
            }
        });
        btnStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentsActionPerformed(evt);
            }
        });
        jPanel3.add(btnStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 70, 60));

        btnAdminManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfileManagementSystem/photos/BUTTON VARIATIONS PAKYU (3).png"))); // NOI18N
        btnAdminManager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminManagerMouseClicked(evt);
            }
        });
        jPanel3.add(btnAdminManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 70, 70));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 860));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 140, 860));

        redbar.setBackground(new java.awt.Color(123, 21, 20));
        redbar.setForeground(new java.awt.Color(123, 21, 20));

        javax.swing.GroupLayout redbarLayout = new javax.swing.GroupLayout(redbar);
        redbar.setLayout(redbarLayout);
        redbarLayout.setHorizontalGroup(
            redbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        redbarLayout.setVerticalGroup(
            redbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(redbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 40));

        jPanel7.setBackground(new java.awt.Color(153, 0, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showDataTable.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 12)); // NOI18N
        showDataTable.setText("Refresh");
        showDataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDataTableMouseClicked(evt);
            }
        });
        showDataTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDataTableActionPerformed(evt);
            }
        });
        jPanel7.add(showDataTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 90, 30));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Manage Users");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 410, -1));

        jButton9.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 12)); // NOI18N
        jButton9.setText("Delete");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 70, 30));

        btnAdd.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel7.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 60, 30));

        jButton12.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 12)); // NOI18N
        jButton12.setText("Edit");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 60, 30));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 890, 70));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel1.setText("Users Data");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 140, 60));

        jButton1.setText("Logout");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 110, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 320, -1));

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Username", "Password", "Is Admin", "Student Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 890, -1));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setText("Search for:");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel3.setText("Order by:");

        cbOrder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Name", "Username", "Is_Admin" }));

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

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 900, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/maroon logo.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 320, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStudentsMouseClicked
        StudentDataManagement v = new StudentDataManagement();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnStudentsMouseClicked

    private void btnAdminManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminManagerMouseClicked
        AdminPage v = new AdminPage();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAdminManagerMouseClicked

    private void showDataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDataTableMouseClicked

    }//GEN-LAST:event_showDataTableMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        SigninPage v = new SigninPage();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseClicked

    private void showDataTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDataTableActionPerformed
        // TODO add your handling code here:
        refreshTable();
    }//GEN-LAST:event_showDataTableActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        int selectedrow = userTable.getSelectedRow();
        TableModel model = userTable.getModel();
        int id = Integer.parseInt((String)model.getValueAt(selectedrow, 0));
        String sql = "delete from users where id = " + id;
        try {
            conn.createStatement().execute(sql);
                    JOptionPane.showMessageDialog(null, "User Successfully Deleted!");
                    refreshTable();
        } catch (SQLException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        AddUserPage page = new AddUserPage();
        page.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        EditUserPage page = new EditUserPage();
        final int selectedRow = userTable.getSelectedRow();
        final TableModel model = userTable.getModel();

        model.getValueAt(selectedRow, 0);
        page.loadData(
                Integer.parseInt(model.getValueAt(selectedRow, 0).toString()),
                model.getValueAt(selectedRow, 1).toString(),
                model.getValueAt(selectedRow, 2).toString(),
                model.getValueAt(selectedRow, 3).toString(),
                Integer.parseInt(model.getValueAt(selectedRow, 4).toString()),
                Integer.parseInt(model.getValueAt(selectedRow, 5).toString())
        );
        page.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        filters = "where "
        + "name like '%" + txtSearch.getText() + "%'";
        filters += "or username like '%" + txtSearch.getText() + "%'";
        filters += "or id like '" + txtSearch.getText() + "'";
        filters += " order by " + cbOrder.getSelectedItem().toString()+ " " + cbDirection.getSelectedItem().toString();
        
        // order by id desc
        //123 - 2 = 2
        refreshTable();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        HomePage v = new HomePage();
        v.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        AdminHomepage v = new AdminHomepage();
        v.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_jButton13MouseClicked

    private void btnStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStudentsActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAdminManager;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnStudents;
    private javax.swing.JComboBox<String> cbDirection;
    private javax.swing.JComboBox<String> cbOrder;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel redbar;
    private javax.swing.JButton showDataTable;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
