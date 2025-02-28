package Main;

import config.dbConnector;
import intermalpage.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.Border;

public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public LogIn() {
        initComponents();
    }

          Color navcolor = new Color (153,153,153);
          Color body = new Color (255,204,204);
          
         Border empty = BorderFactory.createEmptyBorder();
         
         void buttonBorderAnimation(JPanel panel) {
             panel.setBackground(navcolor);
             panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
             panel.setBorder(BorderFactory.createStrokeBorder (new BasicStroke (2.0f)));
    
    }
         void buttonDefaultColor(JPanel panel) {
             panel.setBorder((Border) body);
             panel.setBorder(empty);
             
}
          
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        utxtfield = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ptxtfield = new javax.swing.JPasswordField();
        loginpane1 = new javax.swing.JPanel();
        Loglbl1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        __lbl = new javax.swing.JLabel();
        lblsign = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("support—financing ");
        jLabel4.setToolTipText("");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("____________________");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jLabel3.setText("your future today.");
        jLabel3.setToolTipText("");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jLabel1.setText("Your dreams, our");
        jLabel1.setToolTipText("");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 180, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setText("CrediSure");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/—Pngtree—coin in hand loan logo_8137202.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 410));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel6.setText("Sign In to Loan ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Don't have an account? ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, -1));

        utxtfield.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        utxtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        utxtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utxtfieldActionPerformed(evt);
            }
        });
        jPanel1.add(utxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 280, 40));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel9.setText("Password");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel8.setText("Username");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        ptxtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ptxtfield.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ptxtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptxtfieldActionPerformed(evt);
            }
        });
        jPanel1.add(ptxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 280, 40));

        loginpane1.setBackground(new java.awt.Color(255, 204, 204));
        loginpane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        loginpane1.setToolTipText("");
        loginpane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginpane1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginpane1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginpane1MouseExited(evt);
            }
        });

        Loglbl1.setBackground(new java.awt.Color(255, 204, 204));
        Loglbl1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Loglbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Loglbl1.setText("LOG IN");
        Loglbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Loglbl1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Loglbl1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout loginpane1Layout = new javax.swing.GroupLayout(loginpane1);
        loginpane1.setLayout(loginpane1Layout);
        loginpane1Layout.setHorizontalGroup(
            loginpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpane1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(Loglbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        loginpane1Layout.setVerticalGroup(
            loginpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Loglbl1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel1.add(loginpane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 320, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("_________________________________________________");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 540, -1));

        __lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        __lbl.setForeground(new java.awt.Color(0, 0, 102));
        __lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        __lbl.setText("______");
        jPanel1.add(__lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 50, -1));

        lblsign.setBackground(new java.awt.Color(255, 204, 204));
        lblsign.setForeground(new java.awt.Color(0, 0, 204));
        lblsign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsign.setText("Sign Up");
        lblsign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsignMouseClicked(evt);
            }
        });
        jPanel1.add(lblsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 50, 30));

        minimize.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("—");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 40, -1));

        close.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 40, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void utxtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utxtfieldActionPerformed

    }//GEN-LAST:event_utxtfieldActionPerformed

    private void ptxtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptxtfieldActionPerformed

    }//GEN-LAST:event_ptxtfieldActionPerformed

    private void loginpane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginpane1MouseClicked
               try {
        dbConnector dbc = new dbConnector();
        Connection conn = dbc.getConnection();
        Dashboard dash = new Dashboard();
        dash.setVisible(true);
        
        String sql = "SELECT u_type, u_status FROM tbl_user WHERE u_username = ? AND u_password = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        pstmt.setString(1, utxtfield.getText().trim());
        pstmt.setString(2, ptxtfield.getText().trim());
        
        ResultSet rs = pstmt.executeQuery();

        if (utxtfield.getText().isEmpty() || ptxtfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "LOG IN FAILED! Fields must not be EMPTY");
        }else if (rs.next()) { 
            String userType = rs.getString("u_type");
            String userStatus = rs.getString("u_status");

            if (userStatus.equalsIgnoreCase("Pending")) {
                JOptionPane.showMessageDialog(this, "Your account is not yet activated!");
            } else if (userStatus.equalsIgnoreCase("Active")) {
                if (userType.equalsIgnoreCase("Admin")) {
                    JOptionPane.showMessageDialog(this, "Welcome Admin!");
                    adminPage ap = new adminPage();
                    dash.maindesktop.add(ap).setVisible(true);
                    
                } else if (userType.equalsIgnoreCase("User")) {
                    JOptionPane.showMessageDialog(this, "Welcome User!");
                    userPage ap = new userPage();
                    dash.maindesktop.add(ap).setVisible(true);
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid user type!");
                }
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Unknown account status!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Login failed! Incorrect username or password.");
        }

        rs.close();
        pstmt.close();
        conn.close();

    } catch (SQLException ex) {
        System.out.println("Error: " + ex.getMessage());
    }                 
    
    }//GEN-LAST:event_loginpane1MouseClicked

    private void loginpane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginpane1MouseEntered
        loginpane1.setBackground(navcolor);
    }//GEN-LAST:event_loginpane1MouseEntered

    private void loginpane1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginpane1MouseExited
        loginpane1.setBackground(body);
    }//GEN-LAST:event_loginpane1MouseExited

    private void lblsignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsignMouseClicked
            new Registration().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_lblsignMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
       setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
       int a = JOptionPane.showConfirmDialog(null, "Confirm EXIT?");
        
       if(a == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_closeMouseClicked

    private void Loglbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Loglbl1MouseClicked
       String username = utxtfield.getText();
       String password = ptxtfield.getText();
    
    if (username.isEmpty() && password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "LOG IN FAILED!Must not be EMPTY!");
        
    } else if (username.equals("jema") && password.equals("2113")) { 
        JOptionPane.showMessageDialog(this, "LOG IN SUCCESS!");
        new Dashboard().setVisible(true);
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(this, "INVAlID username or password!");
}
    }//GEN-LAST:event_Loglbl1MouseClicked

    private void Loglbl1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Loglbl1MouseEntered

    }//GEN-LAST:event_Loglbl1MouseEntered

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Loglbl1;
    private javax.swing.JLabel __lbl;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblsign;
    private javax.swing.JPanel loginpane1;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField ptxtfield;
    private javax.swing.JTextField utxtfield;
    // End of variables declaration//GEN-END:variables
}
