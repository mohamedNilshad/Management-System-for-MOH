package com.moh.form;

import com.moh.DBConnection.DatabaseMoh;
import dataValidation.Validation;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class sphiProfile extends javax.swing.JPanel {

    DatabaseMoh Db = new DatabaseMoh();
    Validation encrypt = new Validation();
    private int stID;
    private String oldEmail = "";
    private String oldName = "";
    private String oldPass = "";

    public sphiProfile(int stID) {
        this.stID = stID;

        initComponents();
        lblEmailValidation.setVisible(false);
        ResultSet AB;
        try {
            AB = Db.getData("SELECT full_name, email,password FROM staff WHERE s_ID = '" + stID + "'");

            while (AB.next()) {
                oldEmail = String.valueOf(AB.getString("email"));
                oldName = String.valueOf(AB.getString("full_name"));
                oldPass = String.valueOf(AB.getString("password"));
            }
        } catch (Exception ex) {
            Logger.getLogger(sphiProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtSphiEmail.setText(oldEmail);
        txtSphiName.setText(oldName);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtSphiEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSphiName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        psdSphiPass = new javax.swing.JPasswordField();
        psdSphiCPass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        myButton1 = new button.MyButton();
        lblEmailValidation = new javax.swing.JLabel();

        setBackground(new java.awt.Color(247, 247, 247));
        setPreferredSize(new java.awt.Dimension(729, 483));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("email");

        txtSphiEmail.setBackground(new java.awt.Color(225, 226, 226));
        txtSphiEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtSphiEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSphiEmailKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("SPHI name");

        txtSphiName.setBackground(new java.awt.Color(225, 226, 226));
        txtSphiName.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("password");

        psdSphiPass.setBackground(new java.awt.Color(225, 226, 226));
        psdSphiPass.setForeground(new java.awt.Color(0, 0, 0));

        psdSphiCPass.setBackground(new java.awt.Color(225, 226, 226));
        psdSphiCPass.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("confirm password");

        myButton1.setBorder(null);
        myButton1.setForeground(new java.awt.Color(255, 255, 255));
        myButton1.setText("UPDATE");
        myButton1.setColor(new java.awt.Color(78, 203, 74));
        myButton1.setFocusable(false);
        myButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        myButton1.setRadius(40);
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        lblEmailValidation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEmailValidation.setForeground(new java.awt.Color(204, 0, 0));
        lblEmailValidation.setText("Invalid Email*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(psdSphiPass, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblEmailValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtSphiEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(167, 167, 167)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSphiName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(psdSphiCPass, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGap(286, 286, 286))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmailValidation))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSphiEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtSphiName))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(psdSphiPass)
                    .addComponent(psdSphiCPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(325, 325, 325))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed

        ResultSet AB;
        try {
            AB = Db.getData("SELECT password FROM staff WHERE s_ID = '" + stID + "'");

            while (AB.next()) {
                oldPass = String.valueOf(AB.getString("password"));
            }
        } catch (Exception ex) {
            Logger.getLogger(sphiProfile.class.getName()).log(Level.SEVERE, null, ex);
        }

        int isFeildEmpty = 0;
        int validEmail = 0;
        int validPass = 0;
        int passFeild =0;
        String email;
        String name;
        String pass;
        String cPass;
        //david@gmail.com
        //System.out.print("Worked");
        email = txtSphiEmail.getText();
        name = txtSphiName.getText();

        pass = psdSphiPass.getText();
        cPass = psdSphiCPass.getText();

        System.out.println(pass + "    ->>> 0 ");

        if (email != "") {

            if (encrypt.emailValid(email)) {
                validEmail = 1;
            } else {

                lblEmailValidation.setVisible(true);
            }

        }

        if (!"".equals(pass)) {
            
            if (pass.equals(cPass)) {
                validPass = 1;
                System.out.println(pass + "    ->>> 1 ");
            } else {
                System.out.println(pass + "    ->>> 2 ");
                JOptionPane.showMessageDialog(null, "In correct password and Confirm password");
                passFeild=1;
            }
        }

        if ((validEmail == 1)&&(passFeild == 0)) {

            String conPass;
            conPass = JOptionPane.showInputDialog(null, "Enter Your old Password to confirm");
            //System.out.println(conPass);
            //password Encryption

            try {

                conPass = encrypt.PassEncrypt(conPass);

            } catch (NoSuchAlgorithmException ex) {

                System.out.println("ex");

            }

            //confirm user
            if (conPass.equals(oldPass)) {

                try {
                    if (validPass == 1) {
                        pass = encrypt.PassEncrypt(pass);
                        Db.putData("UPDATE staff set password = '" + pass + "' WHERE s_ID='" + stID + "'");
                        System.out.println(pass + "    ->>> 3 ");
                    }
                    Db.putData("UPDATE staff set full_name ='" + name + "', email='" + email + "' WHERE s_ID='" + stID + "'");
                    System.out.println(pass + "    ->>> 4 ");
                    JOptionPane.showMessageDialog(null, "Updated Succesfully");
                    psdSphiPass.setText("");
                    psdSphiCPass.setText("");

                } catch (Exception ex) {
                    System.out.println(ex);

                }
            } else {
                JOptionPane.showMessageDialog(null, "Wrong password");
            }

        }


    }//GEN-LAST:event_myButton1ActionPerformed

    private void txtSphiEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSphiEmailKeyPressed
        lblEmailValidation.setVisible(false);
    }//GEN-LAST:event_txtSphiEmailKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblEmailValidation;
    private button.MyButton myButton1;
    private javax.swing.JPasswordField psdSphiCPass;
    private javax.swing.JPasswordField psdSphiPass;
    private javax.swing.JTextField txtSphiEmail;
    private javax.swing.JTextField txtSphiName;
    // End of variables declaration//GEN-END:variables
}
