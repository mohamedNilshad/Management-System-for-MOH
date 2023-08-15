package com.moh.main;

import com.moh.event.EventMenuSelected;
import com.moh.form.MohProfile;
import java.awt.Color;
import javax.swing.JComponent;

public class MOHDashboard extends javax.swing.JFrame {

    public MOHDashboard() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        //sphiMenu1.initMoving(sphiDashboard.this);
        
         setForm(new MohProfile());
        
        mohMenu1.addEventMenuSelected(new EventMenuSelected(){
            @Override
            public void selected(int index) {
               if(index == 0){
                   setForm(new MohProfile());
               }else if(index == 1){
                   //setForm(new AdminAddStaff());
               }else if(index == 2){
                   //setForm(new AdminRmvStaff());
               }else if(index == 3){
                   new LoginPanel().setVisible(true);
                   dispose();
               }
               
            }
            
        });
    }
    
     private void setForm(JComponent com){
        mohMainPanel.removeAll();
        mohMainPanel.add(com);
        mohMainPanel.repaint();
        mohMainPanel.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBoarder1 = new com.moh.swing.PanelBoarder();
        mohMenu1 = new com.moh.componant.mohMenu();
        mohMainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBoarder1.setBackground(new java.awt.Color(255, 255, 255));

        mohMainPanel.setOpaque(false);
        mohMainPanel.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("moh-moh-moh-moh-mohmoh-moh-moh-moh-mohmoh-moh-moh-moh-mohmoh-moh-moh-moh-mohmoh-moh-moh-moh-mohmoh-moh-moh-moh-mohmoh-moh-mohjjj");

        javax.swing.GroupLayout panelBoarder1Layout = new javax.swing.GroupLayout(panelBoarder1);
        panelBoarder1.setLayout(panelBoarder1Layout);
        panelBoarder1Layout.setHorizontalGroup(
            panelBoarder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoarder1Layout.createSequentialGroup()
                .addComponent(mohMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBoarder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mohMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)))
        );
        panelBoarder1Layout.setVerticalGroup(
            panelBoarder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mohMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBoarder1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(mohMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBoarder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBoarder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(MOHDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MOHDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MOHDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MOHDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MOHDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel mohMainPanel;
    private com.moh.componant.mohMenu mohMenu1;
    private com.moh.swing.PanelBoarder panelBoarder1;
    // End of variables declaration//GEN-END:variables
}
