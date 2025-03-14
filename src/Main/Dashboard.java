
package Main;

import intermalpage.*;
import java.awt.BasicStroke;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
/**
 *
 * @author Admin
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        
        dashboardPage dp = new dashboardPage();
        maindesktop.add(dp).setVisible(true);
    }
    Color panel2bg = new Color(255,102,102);
    Color desktopbg = new Color(153,153,153);

             Border empty = BorderFactory.createEmptyBorder();
         
         void buttonBorderAnimation(JPanel panel) {
             panel.setBackground(panel2bg);
             panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
             panel.setBorder(BorderFactory.createStrokeBorder (new BasicStroke (2.0f)));
    
    }
         void buttonDefaultColor(JPanel panel) {
             panel.setBackground(desktopbg);
             panel.setBorder(empty);
             
}
         
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        boardpane = new javax.swing.JPanel();
        dashboardlbl = new javax.swing.JLabel();
        adminpane = new javax.swing.JPanel();
        admin = new javax.swing.JLabel();
        customerpane = new javax.swing.JPanel();
        customer = new javax.swing.JLabel();
        maindesktop = new javax.swing.JDesktopPane();
        settingPane = new javax.swing.JPanel();
        settingLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel1.setBackground(new java.awt.Color(153, 153, 153));

        panel2.setBackground(new java.awt.Color(204, 204, 204));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boardpane.setBackground(new java.awt.Color(153, 153, 153));
        boardpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boardpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boardpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boardpaneMouseExited(evt);
            }
        });

        dashboardlbl.setBackground(new java.awt.Color(255, 255, 255));
        dashboardlbl.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dashboardlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboardlbl.setText("DASHBOARD PAGE");

        javax.swing.GroupLayout boardpaneLayout = new javax.swing.GroupLayout(boardpane);
        boardpane.setLayout(boardpaneLayout);
        boardpaneLayout.setHorizontalGroup(
            boardpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardpaneLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(dashboardlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        boardpaneLayout.setVerticalGroup(
            boardpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boardpaneLayout.createSequentialGroup()
                .addComponent(dashboardlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel2.add(boardpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 260, -1));

        adminpane.setBackground(new java.awt.Color(153, 153, 153));
        adminpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminpaneMouseExited(evt);
            }
        });

        admin.setBackground(new java.awt.Color(255, 255, 255));
        admin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin.setText("ADMIN PAGE");

        javax.swing.GroupLayout adminpaneLayout = new javax.swing.GroupLayout(adminpane);
        adminpane.setLayout(adminpaneLayout);
        adminpaneLayout.setHorizontalGroup(
            adminpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminpaneLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        adminpaneLayout.setVerticalGroup(
            adminpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminpaneLayout.createSequentialGroup()
                .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel2.add(adminpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 260, -1));

        customerpane.setBackground(new java.awt.Color(153, 153, 153));
        customerpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customerpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customerpaneMouseExited(evt);
            }
        });

        customer.setBackground(new java.awt.Color(255, 255, 255));
        customer.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        customer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customer.setText("CUSTOMER PAGE");

        javax.swing.GroupLayout customerpaneLayout = new javax.swing.GroupLayout(customerpane);
        customerpane.setLayout(customerpaneLayout);
        customerpaneLayout.setHorizontalGroup(
            customerpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerpaneLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(customer, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        customerpaneLayout.setVerticalGroup(
            customerpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panel2.add(customerpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, -1));

        maindesktop.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout maindesktopLayout = new javax.swing.GroupLayout(maindesktop);
        maindesktop.setLayout(maindesktopLayout);
        maindesktopLayout.setHorizontalGroup(
            maindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 723, Short.MAX_VALUE)
        );
        maindesktopLayout.setVerticalGroup(
            maindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        settingPane.setBackground(new java.awt.Color(153, 153, 153));

        settingLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settingLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-settings-48.png"))); // NOI18N
        settingLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingLblMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout settingPaneLayout = new javax.swing.GroupLayout(settingPane);
        settingPane.setLayout(settingPaneLayout);
        settingPaneLayout.setHorizontalGroup(
            settingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );
        settingPaneLayout.setVerticalGroup(
            settingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(640, 640, 640)
                        .addComponent(settingPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maindesktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(settingPane, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(maindesktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void settingLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingLblMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_settingLblMouseEntered

    private void settingLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingLblMouseClicked
       settingsPage set = new settingsPage();
       maindesktop.add(set).setVisible(true);
       
    }//GEN-LAST:event_settingLblMouseClicked

    private void customerpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerpaneMouseExited
        buttonDefaultColor(customerpane);
    }//GEN-LAST:event_customerpaneMouseExited

    private void customerpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerpaneMouseEntered
        buttonBorderAnimation(customerpane);
    }//GEN-LAST:event_customerpaneMouseEntered

    private void customerpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerpaneMouseClicked
        customerPage cp = new customerPage();
        maindesktop.add(cp).setVisible(true);
    }//GEN-LAST:event_customerpaneMouseClicked

    private void boardpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boardpaneMouseExited
        buttonDefaultColor(boardpane);
    }//GEN-LAST:event_boardpaneMouseExited

    private void boardpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boardpaneMouseEntered
        buttonBorderAnimation(boardpane);
    }//GEN-LAST:event_boardpaneMouseEntered

    private void boardpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boardpaneMouseClicked
        dashboardPage dp = new dashboardPage();
        maindesktop.add(dp).setVisible(true);
    }//GEN-LAST:event_boardpaneMouseClicked

    private void adminpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminpaneMouseClicked
        adminPage ad = new adminPage();
        maindesktop.add(ad).setVisible(true);
    }//GEN-LAST:event_adminpaneMouseClicked

    private void adminpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminpaneMouseEntered
       buttonBorderAnimation(adminpane);
    }//GEN-LAST:event_adminpaneMouseEntered

    private void adminpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminpaneMouseExited
        buttonDefaultColor(adminpane);
    }//GEN-LAST:event_adminpaneMouseExited

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin;
    private javax.swing.JPanel adminpane;
    private javax.swing.JPanel boardpane;
    private javax.swing.JLabel customer;
    private javax.swing.JPanel customerpane;
    private javax.swing.JLabel dashboardlbl;
    public javax.swing.JDesktopPane maindesktop;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JLabel settingLbl;
    private javax.swing.JPanel settingPane;
    // End of variables declaration//GEN-END:variables
}
