package com.moh.form;

import com.moh.DBConnection.DatabaseMoh;
import dataValidation.Validation;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AdminAddStaff extends javax.swing.JPanel {

    DatabaseMoh Db = new DatabaseMoh();
    Validation encrypt = new Validation();

    private int userType = -1;
    private String userName = "";
    private String userEmail = "";
    private String userPass = "";
    private int emtyFeild;
    private String type;

    public AdminAddStaff() throws Exception {
        initComponents();

        reqType.setVisible(false);
        reqName.setVisible(false);
        reqEmail.setVisible(false);
        reqPass.setVisible(false);
        lblEmailValidation2.setVisible(false);

        java.sql.ResultSet AB = Db.getData("SELECT typeName FROM staff_type ORDER BY id ASC");
        while (AB.next()) {
            type = String.valueOf(AB.getString("typeName"));

            cmbUserType.addItem(type);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        myButton1 = new button.MyButton();
        cmbUserType = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        reqType = new javax.swing.JLabel();
        reqName = new javax.swing.JLabel();
        reqEmail = new javax.swing.JLabel();
        reqPass = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtUserEmail = new javax.swing.JTextField();
        psdUserPass = new javax.swing.JPasswordField();
        lblEmailValidation2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(247, 247, 247));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("user type");

        myButton1.setBorder(null);
        myButton1.setForeground(new java.awt.Color(255, 255, 255));
        myButton1.setText("ADD");
        myButton1.setColor(new java.awt.Color(78, 203, 74));
        myButton1.setFocusable(false);
        myButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        myButton1.setMaximumSize(new java.awt.Dimension(84, 26));
        myButton1.setMinimumSize(new java.awt.Dimension(84, 26));
        myButton1.setRadius(40);
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        cmbUserType.setBackground(new java.awt.Color(225, 226, 226));
        cmbUserType.setForeground(new java.awt.Color(0, 0, 0));
        cmbUserType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbUserTypeMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("email");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("password");

        reqType.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reqType.setForeground(new java.awt.Color(204, 0, 0));
        reqType.setText("requird*");

        reqName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reqName.setForeground(new java.awt.Color(204, 0, 0));
        reqName.setText("requird*");

        reqEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reqEmail.setForeground(new java.awt.Color(204, 0, 0));
        reqEmail.setText("requird*");

        reqPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reqPass.setForeground(new java.awt.Color(204, 0, 0));
        reqPass.setText("requird*");

        txtUserName.setBackground(new java.awt.Color(225, 226, 226));
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserNameKeyPressed(evt);
            }
        });

        txtUserEmail.setBackground(new java.awt.Color(225, 226, 226));
        txtUserEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserEmailKeyPressed(evt);
            }
        });

        psdUserPass.setBackground(new java.awt.Color(225, 226, 226));
        psdUserPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                psdUserPassKeyPressed(evt);
            }
        });

        lblEmailValidation2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEmailValidation2.setForeground(new java.awt.Color(204, 0, 0));
        lblEmailValidation2.setText("Invalid Email*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(reqType, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(reqEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(167, 167, 167)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(reqName, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(reqPass, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtUserEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(167, 167, 167)
                            .addComponent(psdUserPass, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblEmailValidation2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(327, 327, 327))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(reqType)
                    .addComponent(reqName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(reqPass))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(reqEmail)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(psdUserPass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmailValidation2)
                .addGap(58, 58, 58)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(368, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        emtyFeild = 0;
         int validEmail=0;
         
        if (cmbUserType.getSelectedIndex() == -1) {
            reqType.setVisible(true);
            emtyFeild = 1;
        }
        if (txtUserEmail.getText().isEmpty()) {
            reqName.setVisible(true);
            emtyFeild = 1;
        }
        if (txtUserEmail.getText().isEmpty()) {
            reqEmail.setVisible(true);
            emtyFeild = 1;
        }
        if (psdUserPass.getText().isEmpty()) {
            reqPass.setVisible(true);
            emtyFeild = 1;
        }
        //If Every Feilds Are Filled
        if (emtyFeild == 0) {
            userType = Integer.valueOf(cmbUserType.getSelectedIndex());
            userName = String.valueOf(txtUserEmail.getText());
            userEmail = String.valueOf(txtUserEmail.getText());
            userPass = String.valueOf(psdUserPass.getText());

            if (userEmail != "") {

                if (encrypt.emailValid(userEmail)) {
                    validEmail = 1;
                } else {

                    lblEmailValidation2.setVisible(true);
                }

            }

            //System.out.println(userType);
            //increas to set as table
            userType++;

            try {
                userPass = encrypt.PassEncrypt(userPass);
            } catch (NoSuchAlgorithmException ex) {
                System.out.println(ex);
            }
            
            if(validEmail==1){
                try {

                    Db.putData(" INSERT INTO staff (type_ID, full_name, email, password)" + " VALUES ('" + userType + "','" + userName + "', '" + userEmail + "', '" + userPass + "' )");

                    JOptionPane.showMessageDialog(null, "Added Succesfully");

                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        }

    }//GEN-LAST:event_myButton1ActionPerformed

    private void cmbUserTypeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbUserTypeMousePressed
        reqType.setVisible(false);
    }//GEN-LAST:event_cmbUserTypeMousePressed

    private void txtUserEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserEmailKeyPressed
        lblEmailValidation2.setVisible(false);
    }//GEN-LAST:event_txtUserEmailKeyPressed

    private void psdUserPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_psdUserPassKeyPressed
        reqPass.setVisible(false);
    }//GEN-LAST:event_psdUserPassKeyPressed

    private void txtUserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyPressed
        reqName.setVisible(false);
    }//GEN-LAST:event_txtUserNameKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbUserType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblEmailValidation2;
    private button.MyButton myButton1;
    private javax.swing.JPasswordField psdUserPass;
    private javax.swing.JLabel reqEmail;
    private javax.swing.JLabel reqName;
    private javax.swing.JLabel reqPass;
    private javax.swing.JLabel reqType;
    private javax.swing.JTextField txtUserEmail;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
