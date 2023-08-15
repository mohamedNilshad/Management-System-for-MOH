package com.moh.form;

import com.moh.DBConnection.DatabaseMoh;
import dataValidation.Validation;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AdminProfile extends javax.swing.JPanel {

    DatabaseMoh Db = new DatabaseMoh();
    Validation encrypt = new Validation();
    private int stID;
    private String oldEmail = "";
    private String oldName = "";
    private String oldPass = "";

    public AdminProfile(int stID) {
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
            Logger.getLogger(AdminProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtAdEmail.setText(oldEmail);
        txtAdName.setText(oldName);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtAdEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAdName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        psdAdPass = new javax.swing.JPasswordField();
        psdAdCPass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        myButton1 = new button.MyButton();
        lblEmailValidation = new javax.swing.JLabel();

        setBackground(new java.awt.Color(247, 247, 247));
        setPreferredSize(new java.awt.Dimension(729, 483));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("email");

        txtAdEmail.setBackground(new java.awt.Color(225, 226, 226));
        txtAdEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtAdEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAdEmailKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("admin name");

        txtAdName.setBackground(new java.awt.Color(225, 226, 226));
        txtAdName.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("password");

        psdAdPass.setBackground(new java.awt.Color(225, 226, 226));
        psdAdPass.setForeground(new java.awt.Color(0, 0, 0));

        psdAdCPass.setBackground(new java.awt.Color(225, 226, 226));
        psdAdCPass.setForeground(new java.awt.Color(0, 0, 0));

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
                                .addComponent(psdAdPass, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblEmailValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtAdEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(167, 167, 167)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(psdAdCPass, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdName))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(psdAdPass)
                    .addComponent(psdAdCPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(325, 325, 325))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        int isFeildEmpty = 0;
        int validEmail=0;
        String email;
        String name;
        String pass;
        String cPass ;
        //david@gmail.com
        //System.out.print("Worked");
        email = txtAdEmail.getText();
        name = txtAdName.getText();
        pass = psdAdPass.getText();
        cPass = psdAdCPass.getText();
        
        if(email != ""){
        
            if(encrypt.emailValid(email)){
                validEmail =1;
            }else{
            
                lblEmailValidation.setVisible(true);
            }
        
        }

        if ((pass.equals(cPass)) &&(validEmail==1)) {

            String conPass = "";
            conPass = JOptionPane.showInputDialog(null,"Enter Your old Password to confirm");
            //System.out.println(conPass);
            //password Encryption
            
                try {
                    if(pass != ""){
                        pass = encrypt.PassEncrypt(pass);
                    }
                    conPass = encrypt.PassEncrypt(conPass);
                   // System.out.println(conPass);

                } catch (NoSuchAlgorithmException ex) {
                   
                    System.out.println("ex");

                }
            

            //confirm user
            if (conPass.equals(oldPass)) {
                
                try {
                    Db.putData("UPDATE staff set full_name ='" + name + "', email='" + email + "', password = '" + pass + "' WHERE s_ID='" + stID + "'");
                    
                    JOptionPane.showMessageDialog(null, "Updated Succesfully");
                    psdAdPass.setText("");
                    psdAdCPass.setText("");
                    
                } catch (Exception ex) {
                    System.out.println(ex);
                    
                }
            } else {
                JOptionPane.showMessageDialog(null, "Wrong password");
            }

        } else {
            JOptionPane.showMessageDialog(null, "In correct password and Confirm password");
        }


    }//GEN-LAST:event_myButton1ActionPerformed

    private void txtAdEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdEmailKeyPressed
         lblEmailValidation.setVisible(false);
    }//GEN-LAST:event_txtAdEmailKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblEmailValidation;
    private button.MyButton myButton1;
    private javax.swing.JPasswordField psdAdCPass;
    private javax.swing.JPasswordField psdAdPass;
    private javax.swing.JTextField txtAdEmail;
    private javax.swing.JTextField txtAdName;
    // End of variables declaration//GEN-END:variables
}
