package com.moh.form;

import com.moh.DBConnection.DatabaseMoh;
import dataValidation.Validation;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class sphiMap extends javax.swing.JPanel {

    DatabaseMoh Db = new DatabaseMoh();
    Validation encrypt = new Validation();
    private int stID;
    private String oldEmail = "";
    private String oldName = "";
    private String oldPass = "";

    public sphiMap() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        myButton1 = new button.MyButton();
        myButton3 = new button.MyButton();

        setBackground(new java.awt.Color(247, 247, 247));
        setPreferredSize(new java.awt.Dimension(729, 483));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("MAP");

        myButton1.setBorder(null);
        myButton1.setForeground(new java.awt.Color(255, 255, 255));
        myButton1.setText("ADD PIN");
        myButton1.setBorderColor(new java.awt.Color(51, 51, 51));
        myButton1.setColor(new java.awt.Color(51, 51, 255));
        myButton1.setColorClick(new java.awt.Color(75, 115, 204));
        myButton1.setColorOver(new java.awt.Color(99, 145, 235));
        myButton1.setFocusable(false);
        myButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        myButton1.setRadius(40);
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        myButton3.setBorder(null);
        myButton3.setForeground(new java.awt.Color(255, 255, 255));
        myButton3.setText("Download");
        myButton3.setBorderColor(new java.awt.Color(51, 51, 51));
        myButton3.setColor(new java.awt.Color(51, 51, 51));
        myButton3.setColorClick(new java.awt.Color(102, 102, 102));
        myButton3.setColorOver(new java.awt.Color(153, 153, 153));
        myButton3.setFocusable(false);
        myButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        myButton3.setRadius(40);
        myButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(661, 661, 661)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(myButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(417, 417, 417))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 524, Short.MAX_VALUE)
                .addComponent(myButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed


    }//GEN-LAST:event_myButton1ActionPerformed

    private void myButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private button.MyButton myButton1;
    private button.MyButton myButton3;
    // End of variables declaration//GEN-END:variables
}
