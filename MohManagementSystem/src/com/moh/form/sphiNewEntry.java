package com.moh.form;

import com.moh.DBConnection.DatabaseMoh;
import com.toedter.calendar.JCalendar;
import dataValidation.Validation;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class sphiNewEntry extends javax.swing.JPanel {

    DatabaseMoh Db = new DatabaseMoh();
    Validation encrypt = new Validation();
    private int stID;
    private String diseaseName = "";
    private String placeName = "";
    private String areaName = "";
    private int diseaseID [];
    private int diseaseCount;


    public sphiNewEntry(int stID) {

        initComponents();

        this.stID = stID;

        ResultSet AB, AB1, AB2, DC;
        try {//disease
            
            DC = Db.getCount("SELECT count(d_ID) AS dCount FROM disease");
            DC.next();
            diseaseCount = DC.getInt("dCount");
            
            diseaseID = new int[diseaseCount];
            
            int i=0;
            
            
            
            AB = Db.getData("SELECT d_ID, disease FROM disease ORDER BY d_ID ASC");

            while (AB.next()) {
                diseaseName = String.valueOf(AB.getString("disease"));
                cmbDisease.addItem(diseaseName);
                diseaseID[i] =  Integer.valueOf(AB.getString("d_ID"));
                i++;

            }

            AB1 = Db.getData("SELECT place FROM notified_by ORDER BY n_ID ASC");
            while (AB1.next()) {
                placeName = String.valueOf(AB1.getString("place"));
                cmbNotifyBy.addItem(placeName);

            }

            AB2 = Db.getData("SELECT area FROM phi_area ORDER BY area_ID ASC");
            while (AB2.next()) {
                areaName = String.valueOf(AB2.getString("area"));
                cmbPhiArea.addItem(areaName);

            }
        } catch (Exception ex) {
            Logger.getLogger(sphiProfile.class.getName()).log(Level.SEVERE, null, ex);
        }

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();

        dtpDoN.setDate(date);
        //cmbNotifyBy
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPName = new javax.swing.JTextField();
        myButton1 = new button.MyButton();
        lblDeseas = new javax.swing.JLabel();
        cmbDisease = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lblPName = new javax.swing.JLabel();
        txtPTelephone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblInvalidNum = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaAddress = new javax.swing.JTextArea();
        lblPName1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPAge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblPName2 = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        lblDeseas1 = new javax.swing.JLabel();
        dtpDoN = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        lblDeseas2 = new javax.swing.JLabel();
        cmbNotifyBy = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        lblDeseas3 = new javax.swing.JLabel();
        cmbPhiArea = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        lblDeseas5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(247, 247, 247));
        setPreferredSize(new java.awt.Dimension(729, 483));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Disease :");

        txtPName.setBackground(new java.awt.Color(225, 226, 226));
        txtPName.setForeground(new java.awt.Color(0, 0, 0));
        txtPName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPNameKeyPressed(evt);
            }
        });

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

        lblDeseas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDeseas.setForeground(new java.awt.Color(204, 0, 0));
        lblDeseas.setText("required*");

        cmbDisease.setBackground(new java.awt.Color(225, 226, 226));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Patient Name :");

        lblPName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPName.setForeground(new java.awt.Color(204, 0, 0));
        lblPName.setText("required*");

        txtPTelephone.setBackground(new java.awt.Color(225, 226, 226));
        txtPTelephone.setForeground(new java.awt.Color(0, 0, 0));
        txtPTelephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPTelephoneKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Telephone :");

        lblInvalidNum.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblInvalidNum.setForeground(new java.awt.Color(204, 0, 0));
        lblInvalidNum.setText("invalid number*");

        txtaAddress.setBackground(new java.awt.Color(225, 226, 226));
        txtaAddress.setColumns(20);
        txtaAddress.setRows(5);
        jScrollPane1.setViewportView(txtaAddress);

        lblPName1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPName1.setForeground(new java.awt.Color(204, 0, 0));
        lblPName1.setText("required*");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Address :");

        txtPAge.setBackground(new java.awt.Color(225, 226, 226));
        txtPAge.setForeground(new java.awt.Color(0, 0, 0));
        txtPAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPAgeKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Age :");

        lblPName2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPName2.setForeground(new java.awt.Color(204, 0, 0));
        lblPName2.setText("required*");

        cmbGender.setBackground(new java.awt.Color(225, 226, 226));
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Gender :");

        lblDeseas1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDeseas1.setForeground(new java.awt.Color(204, 0, 0));
        lblDeseas1.setText("required*");

        dtpDoN.setBackground(new java.awt.Color(225, 226, 226));
        dtpDoN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dtpDoN.setDateFormatString("d-M-y");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Date of notification :");

        lblDeseas2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDeseas2.setForeground(new java.awt.Color(204, 0, 0));
        lblDeseas2.setText("required*");

        cmbNotifyBy.setBackground(new java.awt.Color(225, 226, 226));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Notified by :");

        lblDeseas3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDeseas3.setForeground(new java.awt.Color(204, 0, 0));
        lblDeseas3.setText("required*");

        cmbPhiArea.setBackground(new java.awt.Color(225, 226, 226));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("PHI Area :");

        lblDeseas5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDeseas5.setForeground(new java.awt.Color(204, 0, 0));
        lblDeseas5.setText("required*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDeseas3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(6, 6, 6)
                        .addComponent(lblDeseas5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbNotifyBy, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(cmbPhiArea, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtPAge)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(lblPName2)))
                                        .addComponent(cmbDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(12, 12, 12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtPName, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                                    .addGap(30, 30, 30)
                                                    .addComponent(txtPTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(61, 61, 61)
                                                    .addComponent(dtpDoN, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(38, 38, 38))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(6, 6, 6)
                                            .addComponent(lblDeseas1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7)
                                            .addGap(6, 6, 6)
                                            .addComponent(lblDeseas2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(6, 6, 6)
                                    .addComponent(lblDeseas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(jLabel2)
                                    .addGap(6, 6, 6)
                                    .addComponent(lblPName, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addComponent(jLabel3)
                                    .addGap(12, 12, 12)
                                    .addComponent(lblInvalidNum, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(lblPName1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblDeseas)
                            .addComponent(jLabel2)
                            .addComponent(lblPName)
                            .addComponent(jLabel3)
                            .addComponent(lblInvalidNum))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPName)
                            .addComponent(txtPTelephone)
                            .addComponent(cmbDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(lblDeseas1)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDeseas2))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbGender)
                                    .addComponent(dtpDoN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(lblPName2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPAge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(lblPName1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(lblDeseas3)
                    .addComponent(jLabel10)
                    .addComponent(lblDeseas5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbNotifyBy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPhiArea, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        DateFormat yearFormat = new SimpleDateFormat("yyyy");
        Date year = new Date();

        String serialNum = "";
        String PatientName;
        String PatientAddress;
        String DoNotify;
        String DefoultDate = "0000-00-00";

        char Gender = 'M';

        int curntYear;
        int PatientAge;
        int Phone = 0;
        int diseInd;

        int notifyByID;
        int phiAreaID;

        String dise = (cmbDisease.getSelectedItem().toString());
        diseInd = diseaseID[cmbDisease.getSelectedIndex()];

        try {
            serialNum = encrypt.getSerial(dise, diseInd);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        curntYear = Integer.valueOf(yearFormat.format(year));
        PatientName = txtPName.getText();
        PatientAge = Integer.valueOf(txtPAge.getText());
        if (txtPTelephone.getText().isEmpty()) {
            Phone = 0;
        } else {
            Phone = Integer.valueOf(txtPTelephone.getText());
        }

        if (cmbGender.getSelectedIndex() == 0) {
            Gender = 'M';
        } else if (cmbGender.getSelectedIndex() == 1) {
            Gender = 'F';
        }

        //diseInd++;
        PatientAddress = txtaAddress.getText();
        DoNotify = dateFormat.format(dtpDoN.getDate());

        notifyByID = cmbNotifyBy.getSelectedIndex();
        notifyByID++;

        phiAreaID = cmbPhiArea.getSelectedIndex();
        phiAreaID++;

        //Insert Data
        try {

            Db.putData(" INSERT INTO patient (Serial_No, year, patient_Name, Age, Phone, Gender, Adress, disease_ID, Notified_date, NotifiedBy_ID, D_recept_by_MOH, Phi_Area, D_Dispatch_To_PHI, D_of_Investigation, D_Out_Come, satff_ID)" + " VALUES ('" + serialNum + "','" + curntYear + "', '" + PatientName + "', '" + PatientAge + "', '" + Phone + "', '" + Gender + "', '" + PatientAddress + "', '" + diseInd + "', '" + DoNotify + "', '" + notifyByID + "', '" + DefoultDate + "', '" + phiAreaID + "', '" + DefoultDate + "', '" + DefoultDate + "', '" + DefoultDate + "', '" + stID + "')");

            JOptionPane.showMessageDialog(null, "Added Succesfully");

        } catch (Exception ex) {
            System.out.println(ex);
        }


    }//GEN-LAST:event_myButton1ActionPerformed

    private void txtPNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPNameKeyPressed
        //lblDeseas.setVisible(false);
    }//GEN-LAST:event_txtPNameKeyPressed

    private void txtPTelephoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPTelephoneKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPTelephoneKeyPressed

    private void txtPAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPAgeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPAgeKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbDisease;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JComboBox<String> cmbNotifyBy;
    private javax.swing.JComboBox<String> cmbPhiArea;
    private com.toedter.calendar.JDateChooser dtpDoN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDeseas;
    private javax.swing.JLabel lblDeseas1;
    private javax.swing.JLabel lblDeseas2;
    private javax.swing.JLabel lblDeseas3;
    private javax.swing.JLabel lblDeseas5;
    private javax.swing.JLabel lblInvalidNum;
    private javax.swing.JLabel lblPName;
    private javax.swing.JLabel lblPName1;
    private javax.swing.JLabel lblPName2;
    private button.MyButton myButton1;
    private javax.swing.JTextField txtPAge;
    private javax.swing.JTextField txtPName;
    private javax.swing.JTextField txtPTelephone;
    private javax.swing.JTextArea txtaAddress;
    // End of variables declaration//GEN-END:variables
}
