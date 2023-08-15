package com.moh.componant;

import com.moh.event.EventMenuSelected;
import com.moh.model.Model_Menu;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;

public class sphiMenu extends javax.swing.JPanel {

    private EventMenuSelected event;
    
    public void addEventMenuSelected(EventMenuSelected event){
        this.event = event;
        listMenu1.addEventMenuSelected(event);
    }
    public sphiMenu() {
        initComponents();

        setOpaque(false);
        listMenu1.setOpaque(false);
        init();
    }

    private void init() {
        listMenu1.addItem(new Model_Menu("PROFILE", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("NEW ENTRY", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("RETURNS", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("SUMMERY", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("PATIENTS", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("MAP", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("Logout", Model_Menu.MenuType.MENU));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneMOH = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        listMenu1 = new com.moh.swing.listMenu<>();

        paneMOH.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setText("MOH UDUNUWARA");

        javax.swing.GroupLayout paneMOHLayout = new javax.swing.GroupLayout(paneMOH);
        paneMOH.setLayout(paneMOHLayout);
        paneMOHLayout.setHorizontalGroup(
            paneMOHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(paneMOHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(paneMOHLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jLabel1)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );
        paneMOHLayout.setVerticalGroup(
            paneMOHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
            .addGroup(paneMOHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(paneMOHLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jLabel1)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        listMenu1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "PROFILE", "NEW ENTRY", "RETURNS", "SUMMERY", "PATIENTS", "MAP", "LOGOUT" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listMenu1.setPreferredSize(new java.awt.Dimension(154, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneMOH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(listMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneMOH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintChildren(Graphics graphcs) {
        Graphics2D g2 = (Graphics2D) graphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#4b6cb7"), 0, getHeight(), Color.decode("#182848"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(graphcs);
    }

    private int x;
    private int y;

    public void initMoving(JFrame fram) {
        paneMOH.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }

        });

        paneMOH.addMouseMotionListener(new MouseMotionAdapter() {

            @Override
            public void mouseDragged(MouseEvent me) {
                fram.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private com.moh.swing.listMenu<String> listMenu1;
    private javax.swing.JPanel paneMOH;
    // End of variables declaration//GEN-END:variables
}
