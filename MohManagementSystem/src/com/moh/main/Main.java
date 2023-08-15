
package com.moh.main;

import com.moh.event.EventMenuSelected;
import com.moh.form.AdminAddStaff;
import com.moh.form.AdminProfile;
import com.moh.form.AdminRmvStaff;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;


public class Main extends javax.swing.JFrame {

   int id;
   public Main() {
   
   
   }
    public Main(int id) {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        menu.initMoving(Main.this);
        this.id = id;
        
        setForm(new AdminProfile(id));
        
        menu.addEventMenuSelected(new EventMenuSelected(){
            @Override
            public void selected(int index) {
               if(index == 0){
                   setForm(new AdminProfile(id));
               }else if(index == 1){
                   try {
                       setForm(new AdminAddStaff());
                   } catch (Exception ex) {
                       System.out.println(ex);
                   }
               }else if(index == 2){
                   try {
                       setForm(new AdminRmvStaff());
                   } catch (Exception ex) {
                       System.out.println(ex);
                   }
               }else if(index == 3){
                   new LoginPanel().setVisible(true);
                   dispose();
               }
               
            }
            
        });
    }
    private void setForm(JComponent com){
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBoarder1 = new com.moh.swing.PanelBoarder();
        menu = new com.moh.componant.Menu();
        jLabel1 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        panelBoarder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBoarder1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh-moh");

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBoarder1Layout = new javax.swing.GroupLayout(panelBoarder1);
        panelBoarder1.setLayout(panelBoarder1Layout);
        panelBoarder1Layout.setHorizontalGroup(
            panelBoarder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoarder1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(panelBoarder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE)
                    .addGroup(panelBoarder1Layout.createSequentialGroup()
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        panelBoarder1Layout.setVerticalGroup(
            panelBoarder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBoarder1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBoarder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBoarder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
        
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel mainPanel;
    private com.moh.componant.Menu menu;
    private com.moh.swing.PanelBoarder panelBoarder1;
    // End of variables declaration//GEN-END:variables
}
