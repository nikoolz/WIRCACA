/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProfileManagementSystem;

/**
 *
 * @author geral
 */
public class Profile extends javax.swing.JFrame {
//hihello
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

        redbar = new javax.swing.JPanel();
        logout = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        uphdlogo = new javax.swing.JLabel();
        barforedit = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        editdetails = new javax.swing.JButton();
        leftside = new javax.swing.JPanel();
        profile = new javax.swing.JButton()
        ;
        schedule = new javax.swing.JButton();
        attendance = new javax.swing.JButton();
        FAQs = new javax.swing.JButton();
        homebutt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        NAME1 = new javax.swing.JLabel();
        firstnamefield = new javax.swing.JTextField();
        middlenamefield = new javax.swing.JTextField();
        lastnamefield = new javax.swing.JTextField();
        firstname = new javax.swing.JLabel();
        middlename = new javax.swing.JLabel();
        lastname = new javax.swing.JLabel();
        strand = new javax.swing.JLabel();
        strandcombobox = new javax.swing.JComboBox<>();
        levelcombobox = new javax.swing.JComboBox<>();
        level = new javax.swing.JLabel();
        sectioncombobox = new javax.swing.JComboBox<>();
        section = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        agefield = new javax.swing.JTextField();
        gender = new javax.swing.JLabel();
        gendercombobox = new javax.swing.JComboBox<>();
        bday = new javax.swing.JLabel();
        birthday = new com.toedter.calendar.JDateChooser();
        schoolidd = new javax.swing.JLabel();
        schoolidfield = new javax.swing.JTextField();
        number = new javax.swing.JLabel();
        numberfield = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        emailfield = new javax.swing.JTextField();
        schoolg10 = new javax.swing.JLabel();
        schoolg10field = new javax.swing.JTextField();
        address = new javax.swing.JLabel();
        addressfield = new javax.swing.JTextField();
        residence = new javax.swing.JLabel();
        residencefield = new javax.swing.JTextField();
        city = new javax.swing.JLabel();
        cityfield = new javax.swing.JTextField();
        province = new javax.swing.JLabel();
        provincefield = new javax.swing.JTextField();
        zipcode = new javax.swing.JLabel();
        zipcodfield = new javax.swing.JTextField();
        mothername = new javax.swing.JLabel();
        mamafullname = new javax.swing.JTextField();
        mamaocc = new javax.swing.JLabel();
        mamaoccupationfield = new javax.swing.JTextField();
        numbermama = new javax.swing.JLabel();
        mamanumber = new javax.swing.JTextField();
        papaname = new javax.swing.JLabel();
        papafullname = new javax.swing.JTextField();
        papaoccupation = new javax.swing.JLabel();
        papaoccupationfield = new javax.swing.JTextField();
        numberpapa = new javax.swing.JLabel();
        papanumber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1500, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        redbar.setBackground(new java.awt.Color(123, 21, 20));
        redbar.setForeground(new java.awt.Color(123, 21, 20));

        javax.swing.GroupLayout redbarLayout = new javax.swing.GroupLayout(redbar);
        redbar.setLayout(redbarLayout);
        redbarLayout.setHorizontalGroup(
            redbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1520, Short.MAX_VALUE)
        );
        redbarLayout.setVerticalGroup(
            redbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(redbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, 40));

        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 70, -1, -1));

        title.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        title.setText("Student Information");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 230, 30));

        uphdlogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\geral\\Downloads\\maroon logo.png")); // NOI18N
        getContentPane().add(uphdlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 320, -1));

        barforedit.setBackground(new java.awt.Color(153, 0, 0));
        barforedit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Currently viewing profile");
        barforedit.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 18, 225, -1));

        editdetails.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 12)); // NOI18N
        editdetails.setText("Edit Details");
        editdetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editdetailsMouseClicked(evt);
            }
        });
        barforedit.add(editdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 110, -1));

        getContentPane().add(barforedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 970, 60));

        leftside.setBackground(new java.awt.Color(255, 255, 255));
        leftside.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profile.setIcon(new javax.swing.ImageIcon("C:\\Users\\geral\\Downloads\\profileredbutton (1).png")); // NOI18N
        profile.setBorder(null);
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });
        leftside.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 80, 70));

        schedule.setIcon(new javax.swing.ImageIcon("C:\\Users\\geral\\Downloads\\SCHED-removebg-preview (1).png")); // NOI18N
        schedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scheduleMouseClicked(evt);
            }
        });
        leftside.add(schedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 80, -1));

        attendance.setIcon(new javax.swing.ImageIcon("C:\\Users\\geral\\Downloads\\attendance-removebg-preview (1).png")); // NOI18N
        attendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendanceMouseClicked(evt);
            }
        });
        leftside.add(attendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 100, -1));

        FAQs.setIcon(new javax.swing.ImageIcon("C:\\Users\\geral\\Downloads\\FAQs-removebg-preview (1).png")); // NOI18N
        FAQs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FAQsMouseClicked(evt);
            }
        });
        leftside.add(FAQs, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 80, 60));

        homebutt.setBackground(new java.awt.Color(204, 204, 204));
        homebutt.setIcon(new javax.swing.ImageIcon("C:\\Users\\geral\\Downloads\\SHSlogo (1).png")); // NOI18N
        homebutt.setBorder(null);
        homebutt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homebuttMouseClicked(evt);
            }
        });
        leftside.add(homebutt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        getContentPane().add(leftside, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 140, 860));

        //newest pa sa newest
        jPanel1.setMinimumSize(new java.awt.Dimension(912, 1007));
        jPanel1.setPreferredSize(new java.awt.Dimension(912, 1007));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NAME1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        NAME1.setText("NAME:");
        jPanel1.add(NAME1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        firstnamefield.setEditable(false);
        firstnamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnamefieldActionPerformed(evt);
            }
        });
        jPanel1.add(firstnamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 170, 40));

        middlenamefield.setEditable(false);
        middlenamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middlenamefieldActionPerformed(evt);
            }
        });
        jPanel1.add(middlenamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 170, 40));

        lastnamefield.setEditable(false);
        lastnamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnamefieldActionPerformed(evt);
            }
        });
        jPanel1.add(lastnamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 170, 40));

        firstname.setText("First Name");
        jPanel1.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        middlename.setText("Middle Name");
        jPanel1.add(middlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        lastname.setText("Last Name");
        jPanel1.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, -1, -1));

        strand.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        strand.setText("STRAND:");
        jPanel1.add(strand, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        strandcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ICT", "HE", "AD", "HUMSS","GAS","STEM","ABM" }));
        strandcombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strandcomboboxActionPerformed(evt);
            }
        });
        jPanel1.add(strandcombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 170, 40));

        levelcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11", "12" }));
        jPanel1.add(levelcombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 70, 40));

        level.setText("Level");
        jPanel1.add(level, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        sectioncombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04","05","06","07","08","09", "10", "11", "12", "13", "14", "15" }));
        jPanel1.add(sectioncombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 70, 40));

        section.setText("Section");
        jPanel1.add(section, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));

        age.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        age.setText("AGE:");
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 40, -1));

        agefield.setEditable(false);
        jPanel1.add(agefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 50, 40));

        gender.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        gender.setText("GENDER:");
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, -1, 20));

        gendercombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", }));
        jPanel1.add(gendercombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 110, 40));

        bday.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        bday.setText("BIRTHDAY:");
        jPanel1.add(bday, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, 20));

        birthday.setDateFormatString("MM/dd/YYYY");
        jPanel1.add(birthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 190, 40));

        schoolidd.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        schoolidd.setText("SCHOOL ID:");
        jPanel1.add(schoolidd, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 130, 20));

        schoolidfield.setEditable(false);
        schoolidfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolidfieldActionPerformed(evt);
            }
        });
        jPanel1.add(schoolidfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 240, 40));

        number.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        number.setText("CONTACT INFORMATION:");
        jPanel1.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        numberfield.setEditable(false);
        jPanel1.add(numberfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 210, 40));

        email.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        email.setText("EMAIL ADDRESS:");
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        emailfield.setEditable(false);
        jPanel1.add(emailfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 310, 40));

        schoolg10.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        schoolg10.setText("SCHOOL (G10):");
        jPanel1.add(schoolg10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 130, 20));

        schoolg10field.setEditable(false);
        schoolg10field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolg10fieldActionPerformed(evt);
            }
        });
        jPanel1.add(schoolg10field, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 250, 40));

        address.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        address.setText("PERMANENT ADDRESS:");
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 300, -1));

        addressfield.setEditable(false);
        jPanel1.add(addressfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 820, 40));

        residence.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        residence.setText("RESIDENCE ADDRESS:");
        jPanel1.add(residence, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 270, -1));

        residencefield.setEditable(false);
        jPanel1.add(residencefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 820, 40));

        city.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        city.setText("CITY");
        jPanel1.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, -1, -1));

        cityfield.setEditable(false);
        jPanel1.add(cityfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 170, 40));

        province.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        province.setText("PROVINCE");
        jPanel1.add(province, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 630, -1, -1));

        provincefield.setEditable(false);
        jPanel1.add(provincefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 650, 170, 40));

        zipcode.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        zipcode.setText("ZIP CODE");
        jPanel1.add(zipcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 630, -1, -1));

        zipcodfield.setEditable(false);
        jPanel1.add(zipcodfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 650, 170, 40));

        mothername.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        mothername.setText("MOTHER'S FULL NAME");
        jPanel1.add(mothername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 730, -1, -1));

        mamafullname.setEditable(false);
        jPanel1.add(mamafullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 750, 320, 40));

        mamaocc.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        mamaocc.setText("OCCUPATION");
        jPanel1.add(mamaocc, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 730, -1, -1));

        mamaoccupationfield.setEditable(false);
        jPanel1.add(mamaoccupationfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 750, 190, 40));

        numbermama.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        numbermama.setText("CONTACT NUMBER:");
        jPanel1.add(numbermama, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 730, -1, -1));

        mamanumber.setEditable(false);
        jPanel1.add(mamanumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 750, 190, 40));

        papaname.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        papaname.setText("FATHER'S FULL NAME");
        jPanel1.add(papaname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, -1, -1));

        papafullname.setEditable(false);
        jPanel1.add(papafullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 840, 320, 40));

        papaoccupation.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        papaoccupation.setText("OCCUPATION");
        jPanel1.add(papaoccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 820, -1, -1));

        papaoccupationfield.setEditable(false);
        jPanel1.add(papaoccupationfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 840, 190, 40));

        numberpapa.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        numberpapa.setText("CONTACT NUMBER:");
        jPanel1.add(numberpapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 820, -1, -1));

        papanumber.setEditable(false);
        jPanel1.add(papanumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 840, 190, 40));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 970, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        sigin v = new sigin();
        v.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void editdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editdetailsMouseClicked
    EditProfile v = new EditProfile();
    v.setVisible (true);
    this.dispose();
    }//GEN-LAST:event_editdetailsMouseClicked

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        Profile v = new Profile();
        v.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_profileMouseClicked

    private void scheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scheduleMouseClicked
        Schedule v = new Schedule();
        v.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_scheduleMouseClicked

    private void attendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendanceMouseClicked
        Attendancee1 v = new Attendancee1();
        v.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_attendanceMouseClicked

    private void FAQsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FAQsMouseClicked
        FAQs v = new FAQs();
        v.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_FAQsMouseClicked

    private void homebuttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebuttMouseClicked
        Homepagee v = new Homepagee();
        v.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_homebuttMouseClicked

    private void middlenamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middlenamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middlenamefieldActionPerformed

    private void lastnamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnamefieldActionPerformed

    }//GEN-LAST:event_lastnamefieldActionPerformed

    private void schoolg10fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolg10fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schoolg10fieldActionPerformed

    private void firstnamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnamefieldActionPerformed

    private void schoolidfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolidfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schoolidfieldActionPerformed

    private void strandcomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strandcomboboxActionPerformed
    
    }//GEN-LAST:event_strandcomboboxActionPerformed

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
    private javax.swing.JButton FAQs;
    private javax.swing.JLabel NAME1;
    private javax.swing.JLabel address;
    private javax.swing.JTextField addressfield;
    private javax.swing.JLabel age;
    private javax.swing.JTextField agefield;
    private javax.swing.JButton attendance;
    private javax.swing.JPanel barforedit;
    private javax.swing.JLabel bday;
    private com.toedter.calendar.JDateChooser birthday;
    private javax.swing.JLabel city;
    private javax.swing.JTextField cityfield;
    private javax.swing.JButton editdetails;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailfield;
    private javax.swing.JLabel firstname;
    private javax.swing.JTextField firstnamefield;
    private javax.swing.JLabel gender;
    private javax.swing.JComboBox<String> gendercombobox;
    private javax.swing.JButton homebutt;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastname;
    public static javax.swing.JTextField lastnamefield;
    private javax.swing.JPanel leftside;
    private javax.swing.JLabel level;
    private javax.swing.JComboBox<String> levelcombobox;
    private javax.swing.JButton logout;
    private javax.swing.JTextField mamafullname;
    private javax.swing.JTextField mamanumber;
    private javax.swing.JLabel mamaocc;
    private javax.swing.JTextField mamaoccupationfield;
    private javax.swing.JLabel middlename;
    public static javax.swing.JTextField middlenamefield;
    private javax.swing.JLabel mothername;
    private javax.swing.JLabel number;
    private javax.swing.JTextField numberfield;
    private javax.swing.JLabel numbermama;
    private javax.swing.JLabel numberpapa;
    private javax.swing.JTextField papafullname;
    private javax.swing.JLabel papaname;
    private javax.swing.JTextField papanumber;
    private javax.swing.JLabel papaoccupation;
    private javax.swing.JTextField papaoccupationfield;
    private javax.swing.JButton profile;
    private javax.swing.JLabel province;
    private javax.swing.JTextField provincefield;
    private javax.swing.JPanel redbar;
    private javax.swing.JLabel residence;
    private javax.swing.JTextField residencefield;
    private javax.swing.JButton schedule;
    private javax.swing.JLabel schoolg10;
    private javax.swing.JTextField schoolg10field;
    private javax.swing.JLabel schoolidd;
    private javax.swing.JTextField schoolidfield;
    private javax.swing.JLabel section;
    private javax.swing.JComboBox<String> sectioncombobox;
    private javax.swing.JLabel strand;
    private javax.swing.JComboBox<String> strandcombobox;
    private javax.swing.JLabel title;
    private javax.swing.JLabel uphdlogo;
    private javax.swing.JLabel zipcode;
    private javax.swing.JTextField zipcodfield;
    // End of variables declaration//GEN-END:variables
}
