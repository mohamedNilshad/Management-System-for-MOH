package com.moh.main;

import com.moh.event.EventMenuSelected;
import com.moh.form.AdminAddStaff;
import com.moh.form.AdminProfile;
import com.moh.form.AdminRmvStaff;
import com.moh.form.sphiMap;
import com.moh.form.sphiNewEntry;
import com.moh.form.sphiPatient;
import com.moh.form.sphiProfile;
import com.moh.form.sphiReturns;
import com.moh.form.sphiSummery;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;

public class sphiDashboard extends javax.swing.JFrame {

    int id;

    public sphiDashboard() {

    }

    public sphiDashboard(int id) {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        sphiMenu.initMoving(sphiDashboard.this);

        this.id = id;
        setForm(new sphiProfile(id));

        sphiMenu.addEventMenuSelected(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                if (index == 0) {
                    setForm(new sphiProfile(id));
                } else if (index == 1) {
                    try {
                        setForm(new sphiNewEntry(id));
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                } else if (index == 2) {
                    try {
                        setForm(new sphiReturns());
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                } else if (index == 3) {
                    try {
                        setForm(new sphiSummery());
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                } else if (index == 4) {
                    try {
                        setForm(new sphiPatient());
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                } else if (index == 5) {
                    try {
                        setForm(new sphiMap());
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                } else if (index == 6) {
                    new LoginPanel().setVisible(true);
                    dispose();
                }

            }

        });
    }

    private void setForm(JComponent com) {
        sphiMainPanel.removeAll();
        sphiMainPanel.add(com);
        sphiMainPanel.repaint();
        sphiMainPanel.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBoarder1 = new com.moh.swing.PanelBoarder();
        sphiMenu = new com.moh.componant.sphiMenu();
        jLabel1 = new javax.swing.JLabel();
        sphiMainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBoarder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBoarder1.setPreferredSize(new java.awt.Dimension(1090, 613));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh--");

        sphiMainPanel.setBackground(new java.awt.Color(255, 255, 255));
        sphiMainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBoarder1Layout = new javax.swing.GroupLayout(panelBoarder1);
        panelBoarder1.setLayout(panelBoarder1Layout);
        panelBoarder1Layout.setHorizontalGroup(
            panelBoarder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoarder1Layout.createSequentialGroup()
                .addComponent(sphiMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(panelBoarder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
                    .addGroup(panelBoarder1Layout.createSequentialGroup()
                        .addComponent(sphiMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0))))
        );
        panelBoarder1Layout.setVerticalGroup(
            panelBoarder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sphiMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
            .addGroup(panelBoarder1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(sphiMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBoarder1, javax.swing.GroupLayout.DEFAULT_SIZE, 1209, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBoarder1, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(sphiDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sphiDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sphiDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sphiDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sphiDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private com.moh.swing.PanelBoarder panelBoarder1;
    private javax.swing.JPanel sphiMainPanel;
    private com.moh.componant.sphiMenu sphiMenu;
    // End of variables declaration//GEN-END:variables
}
