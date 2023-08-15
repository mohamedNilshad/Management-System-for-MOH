package com.moh.swing;

import com.moh.model.Model_Menu;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class MenuItem extends javax.swing.JPanel {

    private boolean selected;
    private boolean over;

    public MenuItem(Model_Menu data) {
        initComponents();
        setOpaque(false);

        if (data.getType() == Model_Menu.MenuType.MENU) {
            lblName.setText(data.getName());
            lblName.setVisible(true);
        } else if (data.getType() == Model_Menu.MenuType.TITLE) {
            lblName.setText(data.getName());
            lblName.setVisible(false);
        } else {
            lblName.setText("");
        }
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }

    public void setOver(boolean over){
        this.over = over;
        repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();

        lblName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics graphcs) {

        if (selected || over) {
            Graphics2D g2 = (Graphics2D) graphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            if(selected){
                g2.setColor(new Color(255, 255, 255, 80));
            }else{
                g2.setColor(new Color(255, 255, 255, 20));
            }
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        }
        super.paintComponent(graphcs);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}
