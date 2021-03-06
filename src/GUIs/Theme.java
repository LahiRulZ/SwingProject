/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author lahir
 */
public class Theme extends javax.swing.JFrame {

    /**
     * Creates new form Theme
     */
    public Theme() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        financePanel = new javax.swing.JPanel();
        financeImage = new javax.swing.JLabel();
        financeLabel = new javax.swing.JLabel();
        finishedProductsPanel = new javax.swing.JPanel();
        finishedProductsLabel = new javax.swing.JLabel();
        finishedProductsImage = new javax.swing.JLabel();
        stockMaterialsPanel = new javax.swing.JPanel();
        stockMaterialsLabel = new javax.swing.JLabel();
        stockMaterialsImage = new javax.swing.JLabel();
        qaPanel = new javax.swing.JPanel();
        qaLabel = new javax.swing.JLabel();
        qaImage = new javax.swing.JLabel();
        salesPanel = new javax.swing.JPanel();
        salesLabel = new javax.swing.JLabel();
        salesImage = new javax.swing.JLabel();
        transportsPanel = new javax.swing.JPanel();
        transportsLabel = new javax.swing.JLabel();
        transportsImage = new javax.swing.JLabel();
        returnsPanel = new javax.swing.JPanel();
        returnsLabel = new javax.swing.JLabel();
        returnsImage = new javax.swing.JLabel();
        hrPanel = new javax.swing.JPanel();
        hrLabel = new javax.swing.JLabel();
        hrImage = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        themeImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);

        sidePanel.setBackground(new java.awt.Color(54, 33, 89));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        financePanel.setBackground(new java.awt.Color(85, 65, 118));
        financePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                financePanelMousePressed(evt);
            }
        });

        financeImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        financeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Ratings_26px.png"))); // NOI18N

        financeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        financeLabel.setForeground(new java.awt.Color(204, 204, 204));
        financeLabel.setText("Finance Department");

        javax.swing.GroupLayout financePanelLayout = new javax.swing.GroupLayout(financePanel);
        financePanel.setLayout(financePanelLayout);
        financePanelLayout.setHorizontalGroup(
            financePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(financePanelLayout.createSequentialGroup()
                .addComponent(financeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(financeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        financePanelLayout.setVerticalGroup(
            financePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(financePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(financeImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(financeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidePanel.add(financePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 270, 50));

        finishedProductsPanel.setBackground(new java.awt.Color(85, 65, 118));
        finishedProductsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                finishedProductsPanelMousePressed(evt);
            }
        });

        finishedProductsLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        finishedProductsLabel.setForeground(new java.awt.Color(204, 204, 204));
        finishedProductsLabel.setText("Finished Products");

        finishedProductsImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Clothes_50px.png"))); // NOI18N
        finishedProductsImage.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout finishedProductsPanelLayout = new javax.swing.GroupLayout(finishedProductsPanel);
        finishedProductsPanel.setLayout(finishedProductsPanelLayout);
        finishedProductsPanelLayout.setHorizontalGroup(
            finishedProductsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finishedProductsPanelLayout.createSequentialGroup()
                .addComponent(finishedProductsImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finishedProductsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        finishedProductsPanelLayout.setVerticalGroup(
            finishedProductsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(finishedProductsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(finishedProductsImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidePanel.add(finishedProductsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 270, 50));

        stockMaterialsPanel.setBackground(new java.awt.Color(85, 65, 118));
        stockMaterialsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                stockMaterialsPanelMousePressed(evt);
            }
        });

        stockMaterialsLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stockMaterialsLabel.setForeground(new java.awt.Color(204, 204, 204));
        stockMaterialsLabel.setText("Stock Materials");

        stockMaterialsImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Price_Tag_52px.png"))); // NOI18N
        stockMaterialsImage.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout stockMaterialsPanelLayout = new javax.swing.GroupLayout(stockMaterialsPanel);
        stockMaterialsPanel.setLayout(stockMaterialsPanelLayout);
        stockMaterialsPanelLayout.setHorizontalGroup(
            stockMaterialsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stockMaterialsPanelLayout.createSequentialGroup()
                .addComponent(stockMaterialsImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stockMaterialsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        stockMaterialsPanelLayout.setVerticalGroup(
            stockMaterialsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(stockMaterialsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(stockMaterialsImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidePanel.add(stockMaterialsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 270, 50));

        qaPanel.setBackground(new java.awt.Color(85, 65, 118));
        qaPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                qaPanelMousePressed(evt);
            }
        });

        qaLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        qaLabel.setForeground(new java.awt.Color(204, 204, 204));
        qaLabel.setText("Quality Assurance ");

        qaImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Good_Quality_52px.png"))); // NOI18N
        qaImage.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout qaPanelLayout = new javax.swing.GroupLayout(qaPanel);
        qaPanel.setLayout(qaPanelLayout);
        qaPanelLayout.setHorizontalGroup(
            qaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qaPanelLayout.createSequentialGroup()
                .addComponent(qaImage, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        qaPanelLayout.setVerticalGroup(
            qaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(qaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(qaImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidePanel.add(qaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 270, 50));

        salesPanel.setBackground(new java.awt.Color(85, 65, 118));
        salesPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salesPanelMousePressed(evt);
            }
        });

        salesLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salesLabel.setForeground(new java.awt.Color(204, 204, 204));
        salesLabel.setText("Sales & Marketing");

        salesImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salesImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Sales_Performance_26px.png"))); // NOI18N
        salesImage.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout salesPanelLayout = new javax.swing.GroupLayout(salesPanel);
        salesPanel.setLayout(salesPanelLayout);
        salesPanelLayout.setHorizontalGroup(
            salesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesPanelLayout.createSequentialGroup()
                .addComponent(salesImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        salesPanelLayout.setVerticalGroup(
            salesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(salesImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidePanel.add(salesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 270, 50));

        transportsPanel.setBackground(new java.awt.Color(85, 65, 118));
        transportsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                transportsPanelMousePressed(evt);
            }
        });

        transportsLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        transportsLabel.setForeground(new java.awt.Color(204, 204, 204));
        transportsLabel.setText("Transports");

        transportsImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        transportsImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Transportation_26px.png"))); // NOI18N
        transportsImage.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout transportsPanelLayout = new javax.swing.GroupLayout(transportsPanel);
        transportsPanel.setLayout(transportsPanelLayout);
        transportsPanelLayout.setHorizontalGroup(
            transportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transportsPanelLayout.createSequentialGroup()
                .addComponent(transportsImage, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(transportsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        transportsPanelLayout.setVerticalGroup(
            transportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(transportsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(transportsImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidePanel.add(transportsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 270, 50));

        returnsPanel.setBackground(new java.awt.Color(85, 65, 118));
        returnsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                returnsPanelMousePressed(evt);
            }
        });

        returnsLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        returnsLabel.setForeground(new java.awt.Color(204, 204, 204));
        returnsLabel.setText("Return Stock");

        returnsImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        returnsImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Return_26px.png"))); // NOI18N
        returnsImage.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout returnsPanelLayout = new javax.swing.GroupLayout(returnsPanel);
        returnsPanel.setLayout(returnsPanelLayout);
        returnsPanelLayout.setHorizontalGroup(
            returnsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnsPanelLayout.createSequentialGroup()
                .addComponent(returnsImage, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(returnsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        returnsPanelLayout.setVerticalGroup(
            returnsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(returnsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(returnsImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidePanel.add(returnsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 270, 50));

        hrPanel.setBackground(new java.awt.Color(85, 65, 118));
        hrPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hrPanelMousePressed(evt);
            }
        });

        hrLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hrLabel.setForeground(new java.awt.Color(204, 204, 204));
        hrLabel.setText("HR");

        hrImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hrImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Conference_26px.png"))); // NOI18N
        hrImage.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout hrPanelLayout = new javax.swing.GroupLayout(hrPanel);
        hrPanel.setLayout(hrPanelLayout);
        hrPanelLayout.setHorizontalGroup(
            hrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hrPanelLayout.createSequentialGroup()
                .addComponent(hrImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        hrPanelLayout.setVerticalGroup(
            hrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hrLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(hrImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidePanel.add(hrPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 270, 50));

        jPanel1.setLayout(new java.awt.BorderLayout());

        themeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FirstInterface.jpg"))); // NOI18N
        jPanel1.add(themeImage, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 727, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stockMaterialsPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockMaterialsPanelMousePressed
        setColor(stockMaterialsPanel);
        resetColor(finishedProductsPanel);
        resetColor(salesPanel);
        resetColor(transportsPanel);
        resetColor(returnsPanel);
        resetColor(financePanel);
        resetColor(hrPanel);
        resetColor(qaPanel);
    }//GEN-LAST:event_stockMaterialsPanelMousePressed

    private void finishedProductsPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finishedProductsPanelMousePressed
        setColor(finishedProductsPanel);
        resetColor(stockMaterialsPanel);
        resetColor(salesPanel);
        resetColor(transportsPanel);
        resetColor(returnsPanel);
        resetColor(financePanel);
        resetColor(hrPanel);
        resetColor(qaPanel);
    }//GEN-LAST:event_finishedProductsPanelMousePressed

    private void qaPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qaPanelMousePressed
        setColor(qaPanel);
        resetColor(stockMaterialsPanel);
        resetColor(salesPanel);
        resetColor(transportsPanel);
        resetColor(returnsPanel);
        resetColor(financePanel);
        resetColor(hrPanel);
        resetColor(finishedProductsPanel);
    }//GEN-LAST:event_qaPanelMousePressed

    private void salesPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesPanelMousePressed
        setColor(salesPanel);
        resetColor(stockMaterialsPanel);
        resetColor(finishedProductsPanel);
        resetColor(transportsPanel);
        resetColor(returnsPanel);
        resetColor(financePanel);
        resetColor(hrPanel);
        resetColor(qaPanel);
    }//GEN-LAST:event_salesPanelMousePressed

    private void transportsPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transportsPanelMousePressed
       setColor(transportsPanel);
        resetColor(stockMaterialsPanel);
        resetColor(salesPanel);
        resetColor(finishedProductsPanel);
        resetColor(returnsPanel);
        resetColor(financePanel);
        resetColor(hrPanel);
        resetColor(qaPanel);
    }//GEN-LAST:event_transportsPanelMousePressed

    private void returnsPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnsPanelMousePressed
       setColor(returnsPanel);
        resetColor(stockMaterialsPanel);
        resetColor(salesPanel);
        resetColor(transportsPanel);
        resetColor(finishedProductsPanel);
        resetColor(financePanel);
        resetColor(hrPanel);
        resetColor(qaPanel);
    }//GEN-LAST:event_returnsPanelMousePressed

    private void financePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_financePanelMousePressed
        setColor(financePanel);
        resetColor(stockMaterialsPanel);
        resetColor(salesPanel);
        resetColor(transportsPanel);
        resetColor(returnsPanel);
        resetColor(finishedProductsPanel);
        resetColor(hrPanel);
        resetColor(qaPanel);
    }//GEN-LAST:event_financePanelMousePressed

    private void hrPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hrPanelMousePressed
        setColor(hrPanel);
        resetColor(stockMaterialsPanel);
        resetColor(salesPanel);
        resetColor(transportsPanel);
        resetColor(returnsPanel);
        resetColor(financePanel);
        resetColor(finishedProductsPanel);
        resetColor(qaPanel);
    }//GEN-LAST:event_hrPanelMousePressed

    public void setColor(JPanel panel)
    {
        panel.setBackground(new Color(54,33,89));
    }
    
    public void resetColor(JPanel panel)
    {
        panel.setBackground(new Color(85,65,118));
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Theme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Theme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Theme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Theme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Theme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel financeImage;
    private javax.swing.JLabel financeLabel;
    private javax.swing.JPanel financePanel;
    private javax.swing.JLabel finishedProductsImage;
    private javax.swing.JLabel finishedProductsLabel;
    private javax.swing.JPanel finishedProductsPanel;
    private javax.swing.JLabel hrImage;
    private javax.swing.JLabel hrLabel;
    private javax.swing.JPanel hrPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel qaImage;
    private javax.swing.JLabel qaLabel;
    private javax.swing.JPanel qaPanel;
    private javax.swing.JLabel returnsImage;
    private javax.swing.JLabel returnsLabel;
    private javax.swing.JPanel returnsPanel;
    private javax.swing.JLabel salesImage;
    private javax.swing.JLabel salesLabel;
    private javax.swing.JPanel salesPanel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel stockMaterialsImage;
    private javax.swing.JLabel stockMaterialsLabel;
    private javax.swing.JPanel stockMaterialsPanel;
    private javax.swing.JLabel themeImage;
    private javax.swing.JLabel transportsImage;
    private javax.swing.JLabel transportsLabel;
    private javax.swing.JPanel transportsPanel;
    // End of variables declaration//GEN-END:variables
}
