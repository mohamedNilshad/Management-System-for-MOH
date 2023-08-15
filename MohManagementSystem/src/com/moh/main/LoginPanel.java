package com.moh.main;

import com.moh.DBConnection.DatabaseMoh;
import dataValidation.Validation;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginPanel extends javax.swing.JFrame {

    DatabaseMoh Db = new DatabaseMoh();
    Validation encrypt = new Validation();

    public LoginPanel() {
        initComponents();

        lblRequiredEmail1.setVisible(false);
        lblRequiredPswd.setVisible(false);
     

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginBG = new javax.swing.JLayeredPane();
        loginPanelCover1 = new com.moh.componant.loginPanelCover();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        psdUserPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        myButton1 = new button.MyButton();
        lblRequiredEmail1 = new javax.swing.JLabel();
        lblRequiredPswd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        loginBG.setBackground(new java.awt.Color(255, 255, 255));
        loginBG.setOpaque(true);

        javax.swing.GroupLayout loginPanelCover1Layout = new javax.swing.GroupLayout(loginPanelCover1);
        loginPanelCover1.setLayout(loginPanelCover1Layout);
        loginPanelCover1Layout.setHorizontalGroup(
            loginPanelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );
        loginPanelCover1Layout.setVerticalGroup(
            loginPanelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("WELCOME");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("User Email :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Password :");

        txtEmail.setBackground(new java.awt.Color(197, 223, 235));
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        psdUserPassword.setBackground(new java.awt.Color(197, 223, 235));
        psdUserPassword.setForeground(new java.awt.Color(0, 0, 0));
        psdUserPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                psdUserPasswordKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 51));
        jLabel5.setText("Forgot Password ?");

        myButton1.setBorder(null);
        myButton1.setForeground(new java.awt.Color(0, 0, 0));
        myButton1.setText("LOGIN");
        myButton1.setBorderColor(new java.awt.Color(102, 255, 102));
        myButton1.setColor(new java.awt.Color(0, 153, 51));
        myButton1.setColorClick(new java.awt.Color(22, 182, 75));
        myButton1.setColorOver(new java.awt.Color(23, 239, 67));
        myButton1.setFocusable(false);
        myButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        myButton1.setRadius(40);
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        lblRequiredEmail1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRequiredEmail1.setForeground(new java.awt.Color(204, 0, 0));
        lblRequiredEmail1.setText("Required*");

        lblRequiredPswd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRequiredPswd.setForeground(new java.awt.Color(204, 0, 0));
        lblRequiredPswd.setText("Required*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRequiredEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRequiredPswd, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(psdUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblRequiredEmail1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblRequiredPswd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(psdUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(32, 32, 32)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        loginBG.setLayer(loginPanelCover1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        loginBG.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout loginBGLayout = new javax.swing.GroupLayout(loginBG);
        loginBG.setLayout(loginBGLayout);
        loginBGLayout.setHorizontalGroup(
            loginBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginBGLayout.createSequentialGroup()
                .addComponent(loginPanelCover1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginBGLayout.setVerticalGroup(
            loginBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanelCover1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBG)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBG)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        String userEmail = txtEmail.getText();
        String passWord = psdUserPassword.getText();

        String userPassword = "";
        //String userType = cmbUserType.getSelectedItem().toString();

        try {
            userPassword = encrypt.PassEncrypt(passWord);
            //System.out.println(passWord);

        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex);

        }

        int login = 0;
        if (userPassword.isEmpty() && (userEmail.isEmpty())) {
            lblRequiredEmail1.setVisible(true);
            lblRequiredPswd.setVisible(true);

        } else if (userPassword.equals("")) {
            lblRequiredPswd.setVisible(true);

        } else if (userEmail.equals("")) {
            //JOptionPane.showMessageDialog(null, "Email feild is Empty");
            lblRequiredEmail1.setVisible(true);

        } else {
            int uType;
            int userID;
            String email;
            String pass;

            try {

                // Connection conn = Db.getDbConnection();
                ResultSet AB = Db.getData("SELECT * FROM staff WHERE hide = 0");

                while (AB.next()) {
                    uType = Integer.valueOf(AB.getString("type_ID"));
                    email = String.valueOf(AB.getString("email"));
                    pass = String.valueOf(AB.getString("password"));
                    userID = Integer.valueOf(AB.getString("s_ID"));

                    //System.out.println(email + "=" + pass);
                    if ((uType == 1)) {

                        if ((userEmail.equals(email)) && (userPassword.equals(pass))) {
                            login = 1;
                            dispose();

                            new MOHDashboard().setVisible(true);
                        }
                    } else if ((uType == 2)) {

                        if ((userEmail.equals(email)) && (userPassword.equals(pass))) {
                            login = 1;
                            dispose();

                            new sphiDashboard(userID).setVisible(true);
                        }
                    } else if ((uType == 3)) {

                        if ((userEmail.equals(email)) && (userPassword.equals(pass))) {
                            login = 1;
                            dispose();

                            new Main(userID).setVisible(true);
                        }
                    } else if ((uType == 4)) {

                        if ((userEmail.equals(email)) && (userPassword.equals(pass))) {
                            login = 1;
                            dispose();

                            new SRDashboard().setVisible(true);
                        }
                    }

                }

                if (login == 0) {
                    JOptionPane.showMessageDialog(null, "In correct email or password");

                }

                //con.close();
            } catch (Exception e) {
                System.out.print(e);
            }
        }

        //new Main().setVisible(true);
    }//GEN-LAST:event_myButton1ActionPerformed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        lblRequiredEmail1.setVisible(false);

    }//GEN-LAST:event_txtEmailKeyPressed

    private void psdUserPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_psdUserPasswordKeyPressed
        lblRequiredPswd.setVisible(false);
    }//GEN-LAST:event_psdUserPasswordKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblRequiredEmail1;
    private javax.swing.JLabel lblRequiredPswd;
    private javax.swing.JLayeredPane loginBG;
    private com.moh.componant.loginPanelCover loginPanelCover1;
    private button.MyButton myButton1;
    private javax.swing.JPasswordField psdUserPassword;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
