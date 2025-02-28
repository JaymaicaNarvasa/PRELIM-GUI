
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
        userpane = new javax.swing.JPanel();
        user1 = new javax.swing.JLabel();
        customerpane = new javax.swing.JPanel();
        customer = new javax.swing.JLabel();
        adminpane = new javax.swing.JPanel();
        admin = new javax.swing.JLabel();
        maindesktop = new javax.swing.JDesktopPane();
        settingPane = new javax.swing.JPanel();
        settingLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel1.setBackground(new java.awt.Color(153, 153, 153));
        panel1.setLayout(null);

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
        boardpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboardlbl.setBackground(new java.awt.Color(255, 255, 255));
        dashboardlbl.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dashboardlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboardlbl.setText("DASHBOARD PAGE");
        boardpane.add(dashboardlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 30));

        panel2.add(boardpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, 30));

        userpane.setBackground(new java.awt.Color(153, 153, 153));
        userpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userpaneMouseExited(evt);
            }
        });
        userpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user1.setBackground(new java.awt.Color(255, 255, 255));
        user1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        user1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user1.setText("USER PAGE");
        userpane.add(user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 30));

        panel2.add(userpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 240, 30));

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
        customerpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        customer.setBackground(new java.awt.Color(255, 255, 255));
        customer.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        customer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customer.setText("CUSTOMER PAGE");
        customerpane.add(customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 30));

        panel2.add(customerpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 240, 30));

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
        adminpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admin.setBackground(new java.awt.Color(255, 255, 255));
        admin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin.setText("ADMIN PAGE");
        adminpane.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 30));

        panel2.add(adminpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 240, 30));

        panel1.add(panel2);
        panel2.setBounds(0, 0, 240, 430);

        maindesktop.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout maindesktopLayout = new javax.swing.GroupLayout(maindesktop);
        maindesktop.setLayout(maindesktopLayout);
        maindesktopLayout.setHorizontalGroup(
            maindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        maindesktopLayout.setVerticalGroup(
            maindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panel1.add(maindesktop);
        maindesktop.setBounds(240, 60, 710, 370);

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
                .addComponent(settingLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        settingPaneLayout.setVerticalGroup(
            settingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel1.add(settingPane);
        settingPane.setBounds(870, 0, 70, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boardpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boardpaneMouseEntered
        buttonBorderAnimation(boardpane);
    }//GEN-LAST:event_boardpaneMouseEntered

    private void boardpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boardpaneMouseExited
       buttonDefaultColor(boardpane);
    }//GEN-LAST:event_boardpaneMouseExited

    private void customerpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerpaneMouseExited
        buttonDefaultColor(customerpane);
    }//GEN-LAST:event_customerpaneMouseExited

    private void customerpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerpaneMouseEntered
        buttonBorderAnimation(customerpane);
    }//GEN-LAST:event_customerpaneMouseEntered

    private void userpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpaneMouseExited
       buttonDefaultColor(userpane);
    }//GEN-LAST:event_userpaneMouseExited

    private void userpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpaneMouseEntered
        buttonBorderAnimation(userpane);
    }//GEN-LAST:event_userpaneMouseEntered

    private void boardpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boardpaneMouseClicked
        dashboardPage dp = new dashboardPage();
        maindesktop.add(dp).setVisible(true);
    }//GEN-LAST:event_boardpaneMouseClicked

    private void userpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpaneMouseClicked
        userPage up = new userPage();
        maindesktop.add(up).setVisible(true);
    }//GEN-LAST:event_userpaneMouseClicked

    private void settingLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingLblMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_settingLblMouseEntered

    private void settingLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingLblMouseClicked
       settingsPage set = new settingsPage();
       maindesktop.add(set).setVisible(true);
       
    }//GEN-LAST:event_settingLblMouseClicked

    private void adminpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminpaneMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_adminpaneMouseEntered

    private void adminpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminpaneMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_adminpaneMouseExited

    private void customerpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerpaneMouseClicked
       customerPage cp = new customerPage();
       maindesktop.add(cp).setVisible(true);
    }//GEN-LAST:event_customerpaneMouseClicked

    private void adminpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminpaneMouseClicked
        adminPage ap = new adminPage();
        maindesktop.add(ap).setVisible(true);
    }//GEN-LAST:event_adminpaneMouseClicked

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
    private javax.swing.JLabel user1;
    private javax.swing.JPanel userpane;
    // End of variables declaration//GEN-END:variables
}
