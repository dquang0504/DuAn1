package com.gym.form;

import com.gym.model.Model_Card;
import com.gym.model.StatusType;
import com.gym.swing.ScrollBar;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Form_Home extends javax.swing.JPanel {

    public Form_Home() {
        initComponents();
        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/gym/icon/stock.png")), "Stock Total", "$200000", "Increased by 60%"));
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/gym/icon/profit.png")), "Total Profit", "$15000", "Increased by 25%"));
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/gym/icon/flag.png")), "Unique Visitors", "$300000", "Increased by 70%"));
        //  add row table
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        panelBorder1 = new com.gym.swing.PanelBorder();
        card1 = new com.gym.component.Card();
        card2 = new com.gym.component.Card();
        card3 = new com.gym.component.Card();

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        card1.setColor1(new java.awt.Color(142, 142, 250));
        card1.setColor2(new java.awt.Color(123, 123, 245));

        card2.setColor1(new java.awt.Color(186, 123, 247));
        card2.setColor2(new java.awt.Color(167, 94, 236));

        card3.setColor1(new java.awt.Color(241, 208, 62));
        card3.setColor2(new java.awt.Color(211, 184, 61));

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(card3, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(card2, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                        .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(267, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addComponent(panelBorder1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.gym.component.Card card1;
    private com.gym.component.Card card2;
    private com.gym.component.Card card3;
    private javax.swing.JLayeredPane panel;
    private com.gym.swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
